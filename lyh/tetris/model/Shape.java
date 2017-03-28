package lyh.tetris.model;

import java.awt.Color;

public class Shape {
	
	public int 	x = 5, 
				y = 0;
	
	/**��index��*/
	private int i, j;
	
	public int shapeCode;
	public Color color;
	
	/** ���Դ��19�ֲ�ͬ�ķ��� */
	private int[][] shapes = {
			{0xcc00},
			{0x8888,0x0f00},
			{0x4e00,0x8c80,0xe400,0x4c40},
			{0x8c40,0x6c00},
			{0x4c80,0xc600},
			{0x88c0,0xe800,0xc440,0x2e00},
			{0x44c0,0x8e00,0xc440,0xe200}};
	
	
	Shape(int i, int j) {
		
		this.i = i;
		this.j = j;
		
		switch(i) {
			case 0 : color = Color.RED; break;
			case 1 : color = Color.ORANGE; break;
			case 2 : color = Color.YELLOW; break;
			case 3 : color = Color.GREEN; break;
			case 4 : color = Color.BLUE; break;
			case 5 : color = Color.CYAN; break;
			case 6 : color = new Color(255,0,255); break;
		}
		
		/** ��������Խ���ʱ��ص���һ���� */
		shapeCode = shapes[i][j%(shapes[i].length)];
		
	}
	
	/** ���� */
	public final void moveLeft(){
		if(x > 0) {x --;}
		if(x == 0) {}
	}
	
	/** ���� */
	public final void moveRight(){
		if(x < 12) {x ++;}
		if(x == 12) {}
	}
	
	/** ���� */
	public final void moveDown(){}
	
	/** ���� */
	public final void quicken(){}
	
	/** ��ת */
	public final void rotate(){
		
		shapeCode = shapes[i][(j+1)%(shapes[i].length)];
		
	}
	
}



































