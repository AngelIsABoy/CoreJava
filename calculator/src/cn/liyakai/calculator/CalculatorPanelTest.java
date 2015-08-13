package cn.liyakai.calculator;

import java.awt.*;
import javax.swing.*;

public class CalculatorPanelTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new CalculatorFrame();
				frame.setTitle("CalculateTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
