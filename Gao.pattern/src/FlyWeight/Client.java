package FlyWeight;

/**
 * 享元模式，把类分成内部和外部，内部共享，外部灵活
 * 享元工厂
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		ChessFactory cf =new ChessFactory();
		ChessFlyWeight chess =cf.getChess("black");
		System.out.println(chess.getColor());
		
		Coordidate co =new Coordidate(10, 20);
		chess.Display(co);
		
		
		
	}
}
