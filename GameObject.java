package cn.xjc.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

/**
 * ��Ϸ����ĸ���
 * @author ��ѳ�
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
	 * �����������ڵľ��Σ����ں�������ײ���
	 * @return
	 */
	public Rectangle getRect() {
		return new Rectangle((int)x,(int)y,width,heigh);
	}
	
}
