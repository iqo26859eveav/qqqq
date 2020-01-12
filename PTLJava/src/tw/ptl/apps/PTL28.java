package tw.ptl.apps;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PTL28 extends JFrame {
	private JButton open, close, exit;
	
	public PTL28() {
		super("我的視窗");

		setLayout(new FlowLayout(FlowLayout.RIGHT)); //
		
		open = new JButton("Open");
		close = new JButton("Close");
		exit = new JButton("Exit");
		
		add(open); add(close); add(exit);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); //因此方法定義在JFrame中故可直接呼叫
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PTL28();
	}

}
