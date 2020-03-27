package cn.xjc.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

/**
 * 游戏物体的父类
 * @author 项佳诚
 *
 */
public class GameObject {
	Image img;
	double x,y;
	int speed;
	int width,heigh;
	
	public void drawSelf(Graphics g) {
		g.drawImage(img,(int) x,(int) y, null);
	
	
	}

	public GameObject(Image img, double x, double y, int speed, int width, int heigh) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.heigh = heigh;
	}

	public GameObject(Image img, double x, double y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}

	public GameObject() {
		super();
	}
	
	
	/**
	 * 返回物体所在的矩形，便于后续的碰撞检测
	 * @return
	 */
	public Rectangle getRect() {
		return new Rectangle((int)x,(int)y,width,heigh);
	}
	
}
