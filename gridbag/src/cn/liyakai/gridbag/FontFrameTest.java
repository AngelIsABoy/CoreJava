package cn.liyakai.gridbag;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FontFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				FontFrame frame = new FontFrame();
				frame.setTitle("FontTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
