package cn.liyakai.comboBox;

import java.awt.*;
import javax.swing.*;

public class ComboBoxFrameTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new ComboBoxFrame();
				frame.setTitle("ComboBoxTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}
