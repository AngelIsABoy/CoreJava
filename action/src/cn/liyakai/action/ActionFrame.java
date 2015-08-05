package cn.liyakai.action;

import java.awt.*;
import java.awt.event¡£*;
importjavax.swing.*;

/*
 * A frame with a panel that demonstrates color change actions.
 * */

public class ActionFrame extends JFrame{
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public ActionFrame(){
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		buttonPanel = new JPanel();
		
		//define actions
		Action yellowAction = new ColorAction("Yellow", new ImageIcon("yellow-ball.gif"), Color.YELLOW);
		Action blueAction = new ColorAction("Blue", new ImageIcon("blue-ball.gif"),Color.BLUE);
		Action redAction = new ColorAction("Red", new ImageIcon("red-ball.gif"),Color.RED);
		
		//add buttons for these actions
		buttonPanel.add()
	}
}
