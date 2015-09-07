package cn.liyakai.dataExchange;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DataExchangeFrameTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			    public void run(){
				JFrame frame = new DataExchangeFrame();
				frame.setTitle("DataExchangeFrameTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
