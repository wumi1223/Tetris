package lyh.tetris.model;

import java.awt.Color;

public class Shape {
	
	int x, y;
	
	int typeCode;
	Color color;
	
	Shape(int i) {
		this.typeCode = i;
		switch(i) {
			case 0 : color = Color.RED;
			case 1 : color = Color.ORANGE;
			case 2 : color = Color.YELLOW;
			case 3 : color = Color.GREEN;
			case 4 : color = Color.BLUE;
			case 5 : color = Color.CYAN;
			case 6 : color = new Color(255,0,255);
		}
	}
	
	
	int[][] shapes = {
			{0xcc00},
			{0x8888,0xf000},
			{0x4e00,0x8c80,0xe400,0x4c40},
			{0x8c40,0x6c00},
			{0x4c80,0xc600},
			{0x88c0,0xe800,0xc440,0x2e00},
			{0x44c0,0x8e00,0xc440,0xe200},};
	int shape = shapes[2][1];
	
	
	for (int i = 0; i < 9; i ++) {
		shape = shapes[2][i%4];
		System.out.println(shape);
	}
	
	
	
	
	final void moveLeft(){};
	
	final void moveRight(){};
	
	final void moveDown(){};
	
	final void quicken(){};
	
	void rotate(){};
	
}
