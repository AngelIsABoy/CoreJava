package cn.liyakai.fileChooser;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageViewerFrameTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new ImageViewerFrame();
				frame.setTitle("ImageViewerFrameTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
