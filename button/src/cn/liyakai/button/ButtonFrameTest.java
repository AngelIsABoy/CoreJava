package cn.liyakai.button;

import java.awt.*;
import javax.swing.*;

public class ButtonFrameTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new ButtonFrame();
				frame.setTitle("FontTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
