package cn.liyakai.border;

import java.awt.*;
import javax.swing.*;

public class BorderFrameTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new BorderFrame();
				frame.setTitle("RadioButtonFrameTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
