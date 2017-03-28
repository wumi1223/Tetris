package lyh.tetris.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import lyh.tetris.model.Shape;

public class GamePanel extends JPanel{

	private static final long serialVersionUID = 3195483946336416042L;
	
	public GamePanel() {
		super();
		this.setBackground(Color.WHITE);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Shape shape = ShapePainter.getShape();
		ShapePainter.paint(g, shape, 20, 100, 0);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
