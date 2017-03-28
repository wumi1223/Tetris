package lyh.tetris.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import lyh.tetris.model.Shape;

public class PreviewPanel extends JPanel{

	private static final long serialVersionUID = -1378268128933625864L;
	
	public PreviewPanel() {
		super();
		this.setBackground(Color.WHITE);
	}
	
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Shape shape = ShapePainter.getShape();
		ShapePainter.paint(g, shape, 15, 20, 20);
		
	}
	

	
	
	
	
	
	
	

}
