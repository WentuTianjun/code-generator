package org.liuchen.demo;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo extends Applet implements ActionListener{
    private static final String YES = "YES";
    private static final String NO = "NO";
    private static final String UNDECIED = "UNDECIED";

    private String msg = "";
    private Button yesButton;
    private Button noButton;
    private Button undecidedButton;

    public void init(){
        yesButton = new Button(YES);
        noButton = new Button(NO);
        undecidedButton = new Button(UNDECIED);

        add(yesButton);
        add(noButton);
        add(undecidedButton);

        yesButton.addActionListener(this);
        noButton.addActionListener(this);
        undecidedButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(YES.equals(s)){
            msg = "点头yes";
        }else if(NO.equals(s)){
msg = "摇头no";
        }else if(UNDECIED.equals(s)){
msg = "这个听不懂哦";
        }

        repaint();
    }

    public void paint(Graphics g){
        g.drawString(msg, 6, 100);
    }

    public static void main(String[] args) {
        ButtonDemo bd= new ButtonDemo();
        bd.init();
    }
}
