package cn.liyakai.mouse;

import java.awt.*;

import javax.swing.*;


public class MouseComponentTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new MouseFrame();
				frame.setTitle("MouseTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
