package FlyWeight;


public interface ChessFlyWeight {

	String getColor();
	void setColor(String color);
	void Display(Coordidate d);
}

class chess implements ChessFlyWeight {

	private String Color;
	
	public chess(String color) {
		super();
		this.Color = color;
	}

	public String getColor() {
		return Color;
	}

	@Override
	public void setColor(String color) {
		this.Color = color;
	}


	@Override
	public void Display(Coordidate d) {
		
		System.out.println("棋子的颜色："+this.Color);
		System.out.println("棋子的位置："+"x:"+d.getX()+"y:"+d.getY());
		
	}

	
	
}
