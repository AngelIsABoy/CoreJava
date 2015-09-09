package cn.liyakai.colorChooser;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorChooserPanelTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new ColorChooserFrame();
				frame.setTitle("ColorChooserPanelTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}
