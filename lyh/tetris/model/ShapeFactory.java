package lyh.tetris.model;

import java.util.Random;

public class ShapeFactory {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		for(int i = 0; i < 100; i ++) {
			int a = random.nextInt(7);
			System.out.println(a);
		}
	}
	
	
	
}
