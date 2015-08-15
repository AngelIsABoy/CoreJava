package cn.liyakai.checkBox;

import java.awt.*;
import javax.swing.*;

public class checkBoxTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new CheckBoxFrame();
				frame.setTitle("CheckBoxTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
