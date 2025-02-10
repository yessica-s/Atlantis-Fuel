/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.*;
import Model.*;
import static View.HomePage.username;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Vehicle extends JFrame /*implements ActionListener*/{
    
    
    /*some of the following code is adapted from
    https://www.youtube.com/watch?v=PUeiDFWreFc
    */

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel sidepanel = new JPanel();
    JButton homeButton = new JButton("Home");
    JButton addEntry = new JButton("Add Fuel Entry");
    
    public Vehicle(String username){
        
        //homeButton.setSize(20, 20);
        homeButton.setBounds(30,30,200,30);
        homeButton.setBackground(Color.WHITE);
        homeButton.setForeground(Color.BLACK);
        
        addEntry.setBounds(30, 580, 200, 30);
        addEntry.setBackground(Color.WHITE);
        addEntry.setForeground(Color.BLACK);
        
        panel.setLayout(null);
        panel.setBounds(260,0,1130,800);
        panel.setBackground(new Color(239, 240, 245));
        panel.add(homeButton);
        
        sidepanel.setLayout(null);
        sidepanel.setBackground(new Color(116, 28, 204));
        sidepanel.add(addEntry);
        sidepanel.add(homeButton);
        
        frame.setSize(1280,800);
        frame.add(panel);
        frame.add(sidepanel);
        
        //the action listeners: for when the user presses a button
//        homeButton.addActionListener(this);
//        addEntry.addActionListener(this);
//        
//        homeButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                new HomePage(username).setVisible(true);
//                frame.setVisible(false);
//            }
//        });

    }
    
//    @Override
//    public void actionPerformed(ActionEvent e){
//        
//    }

    
    public static void main(String[] args){
        Vehicle v = new Vehicle(username);
        v.frame.setVisible(true);

        
    }

}
