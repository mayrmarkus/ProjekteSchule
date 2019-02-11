
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Markus_Mayr
 */
public class TimerGUI extends JFrame{
    
	
	private boolean status;
	private boolean reset;
	
    JPanel panel;
    JLabel output;
    JButton button[] = new JButton[3];
    
    
    public TimerGUI(){
        initialize();
    }
    private void initialize(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(317, 200);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        this.setContentPane(panel);
        
        output = new JLabel();
        output.setBounds(95, 50, 100, 50);
        output.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        panel.add(output);
        
        for(int i = 0; i < button.length; i++){
        button[i] = new JButton();
        button[i].setBounds(i*100, 1, 100, 50);
        panel.add(button[i]);
        }
        button[0].setText("Start");
        button[1].setText("Reset");
        button[2].setText("End");
        
        button[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				status = true;
			}
		});
        
        button[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				reset = true;
			}
		});
        
        button[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				status = false;
				
			}
		});
    }
    
	protected boolean setReset() {
		return reset;
		
	}
	
	public void setOutput(String minuten, String sekunden, String ms){
        output.setText(minuten + ":" + sekunden + ":" + ms);
    }
    
    public boolean getStatus(){
    	return status;
    }
}
