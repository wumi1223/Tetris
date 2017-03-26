package lyh.tetris.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PreviewPanel extends JPanel{

	private static final long serialVersionUID = -1378268128933625864L;
	
	public PreviewPanel() {
		super();
		this.setBackground(Color.WHITE);
	}
	
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Color olderColor = g.getColor();
		g.setColor(Color.RED);
		
		g.fillRect(15, 15, 15, 15);
		g.setColor(olderColor);
	}
	
	

}
