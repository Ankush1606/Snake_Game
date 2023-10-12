package Snake.game;

import javax.swing.*;
public class Snakegame extends JFrame {
	
	Snakegame(){
		super("Sanke Game");
		add(new Board());
		pack();   
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		
	}

	public static void main(String[] args) {
		new Snakegame().setVisible(true);

	}

}
