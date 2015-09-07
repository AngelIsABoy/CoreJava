package cn.liyakai.dialog;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * A sample model dialog that displays a message and waits for the user to click the OK button.
 * */
public class AboutDialog extends JDialog{
	public AboutDialog(JFrame owner){
		super(owner, "About DialogTest", true);
		
		//add HTML label to center
		add(
				new JLabel(
						"<html><h1><i>leeyakai@ustc.edu.cn</i><h1><hr>www.liyakai.cn</html>"),
						BorderLayout.CENTER);
		// OK button closes the dialog
		
		JButton ok = new JButton("OK");
		ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				setVisible(false);
			}
		});
		// add Ok button to southern border
		JPanel panel = new JPanel();
		panel.add(ok);
		add(panel, BorderLayout.SOUTH);
		pack();
	}
}
