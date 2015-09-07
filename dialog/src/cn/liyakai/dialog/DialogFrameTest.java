package cn.liyakai.dialog;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DialogFrameTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
			    DialogFrame frame = new DialogFrame();
			    frame.setTitle("DialogFrameTest");
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setVisible(true);
			}
		});
	}

}
