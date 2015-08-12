package cn.liyakai.calculator;

import java.awt.*;
import javax.swing.*;

public class CalculatorFrame  extends JFrame{
	private CalculatorPanel calculatorPanel;
	private static final int DEFAULT_WIDTH = 600;
	private static final int DEFAULT_HEIGHT = 400;
	
	public CalculatorFrame(){
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		calculatorPanel = new CalculatorPanel();
		add(calculatorPanel);
	}

}
