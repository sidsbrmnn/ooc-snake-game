import java.awt.Color;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		Gameplay gameplay = new Gameplay();

		jf.setBounds(10, 10, 905, 700);
		jf.setBackground(Color.darkGray);
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(gameplay);
	}
}
