package cn.liyakai.menu;

import java.awt.event.*;

import javax.swing.*;

/*
 * A frame with a sample menu bar.
 * */
public class MenuFrame extends JFrame{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	private Action saveAction;
	private Action saveAsAction;
	private JCheckBoxMenuItem readonlyItem;
	private JPopupMenu popup;
	
	/*
	 * A sample action that prints the action name to System.out
	 * */
	class TestAction extends AbstractAction{
		public TestAction(String name){
			super(name);
		}
		
		public void actionPerformed(ActionEvent event){
			System.out.println(getValue(Action.NAME) + " selected.");
		}
	}
	
	public MenuFrame(){
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.add(new TestAction("New"));
		
		//demonstrate accelerators
		JMenuItem openItem = fileMenu.add(new TestAction("Open"));
		openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
		
		fileMenu.addSeparator();
		saveAction = new TestAction("Save");
		JMenuItem saveItem = fileMenu.add(saveAction);
		saveItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
		
		saveAsAction = new TestAction("Save As");
		fileMenu.add(saveAsAction);
		fileMenu.addSeparator();
		
		fileMenu.add(new AbstractAction("Exit"){
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
		});
		
		// add all top-level menus to menu bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(fileMenu);
	}

}
