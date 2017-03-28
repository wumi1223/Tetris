package lyh.tetris.model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ShapeFactory {
	
	public static void main(String[] args) {
		Shape shape = new ShapeFactory().getShape();
		
		System.out.println(shape.shapeCode);
		System.out.println(shape.color);
		
		shape.rotate();
		
		System.out.println(shape.shapeCode);
		System.out.println(shape.color);
		
	}
	
	public Shape getShape() {
		
		Random random = new Random();
		
		int i = random.nextInt(7);
		int j = random.nextInt(4);
		
		Shape shape = new Shape(i, j);
		
		Queue<Shape> shapeQueue = LinkedList<Shape>();
		
		return shape;
		
	}
	
}
