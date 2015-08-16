package cn.liyakai.checkBox;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckBoxFrame extends JFrame{
	private static final int DEFAULT_WIDTH = 450;
	private static final int DEFAULT_HEIGHT = 300;
	public static final int FONTSIZE = 18;
	private JCheckBox bold;
	private JCheckBox italic;
	private JLabel label;
	public CheckBoxFrame(){
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		//create Panel
		JPanel southPanel = new JPanel();
		
		//create a label
		label = new JLabel("The quick brown for jumps over the lazy dog.");
		label.setFont(new Font("Serif", Font.PLAIN, FONTSIZE));
		add(label, BorderLayout.CENTER);
		
		//create buttons
		bold = new JCheckBox("Bold");
		italic = new JCheckBox("Italic");
		
		//add buttons to southPanel
		southPanel.add(bold);
		southPanel.add(italic);
		
		//add the listener to buttons
		ActionListener listener = new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               int mode = 0;
               if (bold.isSelected()) mode += Font.BOLD; 
               if (italic.isSelected()) mode += Font.ITALIC;
               label.setFont(new Font("Serif", mode, FONTSIZE));
            }
         };
		bold.addActionListener(listener);
		italic.addActionListener(listener);
		
		add(southPanel, BorderLayout.SOUTH);
		
		}
	
}
