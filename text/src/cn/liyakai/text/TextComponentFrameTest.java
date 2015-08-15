package cn.liyakai.text;

import java.awt.*;

import javax.swing.*;


public class TextComponentFrameTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new TextComponentFrame();
				frame.setTitle("TextComponentFrameTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}
