//Carolina Pérez Alvarado A01631526
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class YaMeHiceBolas extends JFrame{

	private int x1, y1, largo, nivel;

	public YaMeHiceBolas() {
		super("Ya me hice bolas");
		this.setSize(720, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.x1 = 50;
		this.y1 = 350;
		this.largo = 600;
		this.nivel = Integer.parseInt(JOptionPane.showInputDialog("Introduce"));
		this.setVisible(true);
	}

	public void paint(Graphics g) {
		super.paint(g);
		this.pintaCirculos(g, nivel, x1, y1, largo);
	}

	public void pintaCirculos(Graphics g, int nivel, int x1, int y1, int largo) {
		if (nivel == 0) {
			g.drawOval(x1, y1, largo, largo);
		}
		else {
			this.pintaCirculos(g, nivel - 1, x1, y1, largo);
			this.pintaCirculos(g, nivel - 1, x1, y1 + (largo/4), largo/2);
			this.pintaCirculos(g, nivel - 1, x1 + (largo/2), y1 + (largo/4), largo/2);

		}
	}

	public static void main(String[] args) {
		YaMeHiceBolas ventana = new YaMeHiceBolas();

	}

}
