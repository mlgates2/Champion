package com.create.champion.startup;

import java.awt.EventQueue;

import com.create.champion.gui.main.MainDisplay;

public class ChampionStartup {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDisplay window = new MainDisplay();
					window.getFrame().setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
