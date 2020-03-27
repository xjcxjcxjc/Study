package cn.xjc.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import javax.swing.JFrame;


/**
 * 飞机游戏主窗口
 * @author Administrator
 *
 */

public class MyGameFrame extends Frame {
	
	Image planeimg = GameUtil.getImage("image/plane.png");
	Image bg = GameUtil.getImage("image/bg.jpg");	
	Plane plane = new Plane(planeimg,250,250);
	Shell[] shells = new Shell[40];
	Explode bao;
	Date startime  = new Date();
	Date endtime;
	int period ;
	
	
	
	
	//画
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		plane.drawSelf(g);
		Color c = g.getColor();
		g.setColor(Color.red);
		
		for(int i = 0;i< shells.length;i++) {    //炮弹导出，碰撞检测
			shells[i].draw(g);
			boolean peng = shells[i].getRect().intersects(plane.getRect());
			if(peng) {
				
				plane.live=false;
				if(bao==null){
					bao = new Explode(plane.x, plane.y);
					
					endtime = new Date();
					period = (int)((endtime.getTime() -startime.getTime())/1000);
					System.out.println("1");	
				}
				
				bao.draw(g);;
				
			}
			
					
		}
		
		if(plane.live==false) {
			
			Font f = new Font("项佳诚",Font.BOLD, 50);
			g.setFont(f);
			g.drawString("时间："+period+"秒", 350, 330);
		}
		g.setColor(c);
	}
	
	
	//多线程
	class PaintThread extends Thread{
		public  void run () {
			while(true) {
				repaint();
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	//键盘监听
	class KeyMonistor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDiraction(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDiraction(e);
		}
		
	}
	
	//初始化窗口
	public void LaunchFrame() {
		this.setTitle("xjc_game0.1");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		this.setLocation(200, 100);
		this.addWindowListener(new WindowAdapter(){			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});		
		new PaintThread().start();  //启动重画窗口的线程
		addKeyListener(new KeyMonistor()); //给窗口增加监听器
		
		for(int i = 0;i<shells.length;i++) {
			shells[i]=new Shell();
		}
	}
	
	
	
	public static void main(String[]args) {
		MyGameFrame f  = new MyGameFrame();
		f.LaunchFrame();
	}
	
	private Image offScreenImage = null;
	
	public void update(Graphics g) {
		if(offScreenImage == null) {
			offScreenImage = this.createImage(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		}
	Graphics gOff = offScreenImage.getGraphics();
	paint(gOff);
	g.drawImage(offScreenImage, 0, 0, null);
	
	}
	
	
}


