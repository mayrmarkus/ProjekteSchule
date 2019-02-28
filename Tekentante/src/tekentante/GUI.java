package tekentante;

import java.awt.Font;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame{
	
	private JFrame frame;
	private JPanel panel;
	private JLabel lable;
	
	public GUI(){
		init();
	}
	
	public void init(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(317, 200);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        this.setContentPane(panel);
        
        lable = new JLabel();
        lable.setBounds(95, 50, 100, 50);
        panel.add(lable);
        
	}
}
