package lyh.tetris.view;


import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = -2969443552211652082L;


	public static void main(String[] args) {
		new MainFrame();
		
	}
	
	
	public MainFrame() {
		super("Tetris");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 440);
		this.setIconImage(new ImageIcon("Icon.png").getImage());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.WHITE);
		this.setVisible(true);
		
		this.panelAdd(new GamePanel(), 5, 5, 240, 400);
		this.panelAdd(new PreviewPanel(), 250, 5, 90, 90);
		this.panelAdd(new ButtonPanel(), 250,105,90,300);
		
	}
	
	
	/**
	 * 用于添加JPanel组件
	 * 
	 * @param panel JPanel组件
	 * @param x 相对原点的x坐标
     * @param y 相对原点的y坐标
     * @param width 组件的宽度
     * @param height 组件的高度
     * 
	 */
	private void panelAdd(JPanel panel, int x, int y, int width, int height) {
		
		final LineBorder lBorder = new LineBorder(Color.DARK_GRAY);
		
		panel.setBounds(x, y, width, height);
		if(panel instanceof ButtonPanel == false) {panel.setBorder(lBorder);}
		this.add(panel);
		
	}
	
}






































