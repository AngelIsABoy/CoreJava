package cn.liyakai.swing;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/*
 * This program demonstrates that a thread that runs in parallel with the event dispatch thread
 * can cause errors in Swing components.
 * */
public class SwingThreadTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new SwingThreadFrame();
				frame.setTitle("SwingThreadTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}
