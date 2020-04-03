package cn.xjc.game;

import java.awt.Color;
import java.awt.Graphics;

/**
 * 
 * ÅÚµ¯
 * @author Ïî¼Ñ³Ï
 *
 */
public class Shell extends GameObject {

	double degree;
	
	public Shell() {
		x = 100;
		y = 100 ;
		width = 20;
		heigh = 20;
		speed = 4;
		
		degree = Math.random()*Math.PI*2;
	}
	
	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.yellow);
		g.fillOval((int)x, (int)y, width, heigh);
		
		//ÅÚµ¯ÔË¶¯
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		
		if(x<10|x>Constant.GAME_WIDTH-width-10) {
			degree=Math.PI-degree;
		}
		
		if(y<30|y>Constant.GAME_HEIGHT-heigh-10) {
			degree= - degree;
		}
		g.setColor(c);
	}
}





