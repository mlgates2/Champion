package com.create.champion.gui.main;

import javax.swing.JFrame;

public class MainDisplay {

	private JFrame frame;

	public MainDisplay() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public JFrame getFrame() {
		return frame;
	}

}
