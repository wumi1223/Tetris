package lyh.tetris.view;

import java.awt.Color;
import java.awt.Graphics;

import lyh.tetris.model.Shape;
import lyh.tetris.model.ShapeFactory;

public class ShapePainter {
	
	public static Shape getShape() {
		Shape shape = new ShapeFactory().getShape();
		return shape;
	}
	
	
	public static void paint(Graphics g, Shape shape, int width, int x, int y) {
		
		int shapeCode = shape.shapeCode;
		
		Color olderColor = g.getColor();
		g.setColor(shape.color);
		
		int[][] shapeMatrix = new int[4][4];
		int mask = 0x8000;
		int count = 15;
		
		/** ʹ��һ������mask��shapeCode���С��ҡ�������Ȼ�󽫸�����������ȡshapeCode��ĳһλ*/
		for( int i = 0; i < 4; i ++) {
			for( int j = 0; j < 4; j ++) {
				shapeMatrix[i][j] = (shapeCode & mask) >>> count;
				count --;
				mask = mask >>> 1;
			}
		}
		
		for(int i = 0; i < 4; i ++) {
			for(int j = 0; j < 4; j ++) {
				System.out.print(shapeMatrix[i][j]+"\t");
				if(shapeMatrix[i][j] == 1) {
					g.fillRect(width*i+x, width*j+y, width, width);
				}
			}
			System.out.println("\r");
		}
		
		g.setColor(olderColor);
	}
	
	
	public static void rePaint() {
		//todo
		//paint(Graphics g, Shape shape, int width, int x, int y);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
