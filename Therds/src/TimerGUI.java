
import java.awt.Font;
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
    
    JPanel panel;
    JLabel output;
    JButton button;
    
    public TimerGUI(){
        initialize();
    }
    private void initialize(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 200);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        this.setContentPane(panel);
        
        output = new JLabel();
        output.setBounds(95, 50, 100, 50);
        output.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        panel.add(output);
        
        button = new JButton();
        button.setSize(80, 50);
        button.setText("Start");
        panel.add(button);
        
        button.addActionListener(null);
    }
    
    public void setOutput(String minuten, String sekunden, String ms){
        output.setText(minuten + ":" + sekunden + ":" + ms);
    }
}