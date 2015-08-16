package cn.liyakai.radioButton;

import java.awt.*;
import javax.swing.*;

public class RadioButtonFrameTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new RadioButtonFrame();
				frame.setTitle("RadioButtonFrameTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}
