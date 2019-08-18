/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jtextfield;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author kaal
 */
public class newclass extends JFrame{
    JTextField text=new JTextField(20);
    public newclass(){
    super("JTextField");
        setLayout(new BorderLayout());
        add(text,BorderLayout.CENTER);
    
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
