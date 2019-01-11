/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballadvanced;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class BallWorld extends JFrame {

    private BallCage cage;
    private DrawPanel panel;
    private ArrayList<Shape> shapes;
    private JButton add_buttonBall;
    private JButton remove_button;
    private JButton add_buttonRect;
    private JButton add_buttonImg;
    
    Random ran = new Random();

    public BallWorld(int h, int w) {

        shapes = new ArrayList<>();

        this.setSize(h, w);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cage = new BallCage(h, w, Color.BLACK, Color.orange);
        panel = new DrawPanel(w, h, cage);

        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);

        Ball b1 = new Ball(5, 5, 5, 5, 5, Color.yellow);
        shapes.add(b1);
        panel.addShape(b1);

        add_buttonBall = new JButton();
        add_buttonBall.setText("ADD");
        add_buttonBall.setBounds(50, 50, 100, 30);
        this.add(add_buttonBall, BorderLayout.WEST);
        
        add_buttonRect = new JButton();
        add_buttonRect.setText("ADD Rect");
        add_buttonRect.setBounds(50, 50, 100, 30);
        this.add(add_buttonRect, BorderLayout.WEST);
        
        add_buttonBall = new JButton();
        add_buttonBall.setText("ADD Ball");
        add_buttonBall.setBounds(50, 50, 100, 30);
        this.add(add_buttonBall, BorderLayout.WEST);
        
        add_buttonImg = new JButton();
        add_buttonImg.setText("ADD Img");
        add_buttonImg.setBounds(50, 50, 100, 30);
        this.add(add_buttonImg, BorderLayout.WEST);

        remove_button = new JButton();
        remove_button.setText("REMOVE");
        add_buttonBall.setBounds(50, 50, 100, 30);
        this.add(remove_button, BorderLayout.EAST);

        remove_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (shapes.size() > 0) {
                    Random ran = new Random();
                    int a = ran.nextInt(shapes.size());
                    panel.removeBall(shapes.get(a));
                    shapes.remove(a);
                }
            }
        });

        add_buttonImg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                Image i = new Image(ran.nextInt(1000), ran.nextInt(1000), ran.nextInt(10)+1, ran.nextInt(10)+1);
                shapes.add(i);
                panel.addShape(i);
            }
        });
        
        add_buttonRect.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                Rectangle r = new Rectangle(ran.nextInt(1000), ran.nextInt(1000), ran.nextInt(10)+1, ran.nextInt(10)+1,
                        ran.nextInt(50)+3, ran.nextInt(50)+3, new Color(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255)));
                shapes.add(r);
                panel.addShape(r);
            }
        });
        add_buttonBall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ball b = new Ball(ran.nextInt(1000), ran.nextInt(1000), ran.nextInt(10)+1,
                        ran.nextInt(10)+1, ran.nextInt(50)+3, new Color(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255)));
                shapes.add(b);
                panel.addShape(b);
            }
        });
    }

    public void gameStart() {
        Thread gamethread = new Thread() {

            public void run() {
                while (true) {
                    gameUpdate();

                    repaint();

                    try {
                        Thread.sleep(1000 / 50);
                    } catch (InterruptedException ex) {

                    }
                }
            }
        };

        gamethread.start();

    }

    public void gameUpdate() {

        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).move(cage);
        }

    }
}
