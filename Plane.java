package cn.xjc.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

/**
 * 
 * @author Administrator
 *
 */
public class Plane extends GameObject {
	
	int speed = 5;
	boolean left,up,right,down;
	boolean live = true;
	public void drawSelf(Graphics g) {
		g.drawImage(img,(int) x,(int) y, null);
		if(live) {
			
			if(left) {
				x -= speed;
			}
		
			if(right) {
				x+=speed;
			}
			
			if(up) {
				y-=speed;
			}
			
			if(down) {
				y+=speed;
			}
	    }else {
	    	
	    }
	}
	
	
	public Plane(Image img,double x,double y ) {
		this.img = img;
		this.x=x;
		this.y = y;
		this.heigh=img.getHeight(null);
		this.width= img.getWidth(null);
	}
	//按下某个键，增加相应的方向
	public void addDiraction(KeyEvent e) {
		
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT:  
			left = true;
		break;
		case 38: 
			up = true;
		break;
		case 39: 
			right = true;
		break;
		case 40: 
			down = true;
		break;
		}
	}
	
	//按下某个键，取消相应的方向
		public void minusDiraction(KeyEvent e) {
			switch(e.getKeyCode()){
			case KeyEvent.VK_LEFT:  
				left = false;
			break;
			case 38: 
				up = false;
			break;
			case 39: 
				right = false;
			break;
			case 40: 
				down = false;
			break;
			}
		}
}



