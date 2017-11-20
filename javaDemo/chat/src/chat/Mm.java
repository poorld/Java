package chat;

import javax.swing.UIManager;

public class Mm {
	public static void main(String[] args) {
		UIManager.put("RootPane.setupButtonVisible", false); 
		new Main();
	}
}
