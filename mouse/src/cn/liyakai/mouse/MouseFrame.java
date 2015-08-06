package cn.liyakai.mouse;

import javax.swing.*;

/*
 * A frame containing a panel for testing mouse operations
 * */

public class MouseFrame extends JFrame{
	private static final int DEFAULT_WIDTH = 1200;
	private static final int DEFAULT_HEIGHT = 800;
	public MouseFrame(){
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		add(new MouseComponent());
		//pack();	
	}
}
