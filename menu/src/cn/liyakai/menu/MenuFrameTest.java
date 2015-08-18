package cn.liyakai.menu;

import java.awt.*;
import javax.swing.*;

public class MenuFrameTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new MenuFrame();
				frame.setTitle("MenuFrameTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
