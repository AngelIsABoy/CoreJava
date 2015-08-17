package cn.liyakai.slider;

import java.awt.*;
import javax.swing.*;

public class SliderFrameTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new SliderFrame();
				frame.setTitle("RadioButtonFrameTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
