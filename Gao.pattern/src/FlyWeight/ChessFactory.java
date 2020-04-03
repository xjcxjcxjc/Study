package FlyWeight;

import java.util.HashMap;

public class ChessFactory {
	
	HashMap<String, ChessFlyWeight> map =new HashMap<String, ChessFlyWeight>();
	
	public ChessFlyWeight getChess(String Color) {
		
		if(map.get(Color)!=null) {
			return map.get(Color);
		}else {
			ChessFlyWeight ch=new chess(Color);
			map.put(Color, ch);
			return ch;
		}
	}
	
	
}
