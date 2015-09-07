package cn.liyakai.optionDialog;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OptionDialogFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				OptionDialogFrame frame = new OptionDialogFrame();
				frame.setTitle("OptionDialogFrameTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
