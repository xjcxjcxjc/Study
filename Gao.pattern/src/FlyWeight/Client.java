package FlyWeight;

/**
 * ��Ԫģʽ������ֳ��ڲ����ⲿ���ڲ������ⲿ���
 * ��Ԫ����
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
