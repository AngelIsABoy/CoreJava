package cn.liyakai.colorChooser;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ColorChooserFrame extends JFrame{
	public ColorChooserFrame(){
		add(new ColorChooserPanel(), BorderLayout.CENTER);
		pack();
	}

}
