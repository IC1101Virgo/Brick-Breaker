package brickbreaker;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(10, 10, 700, 600) ;
		obj.setTitle("Lets Break It");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);

	}

}
