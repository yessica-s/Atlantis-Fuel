/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import Controller.*;
import Model.*;
import static View.HomePage.username;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

//if need to access username just call it from homepage.username (already improrted)


public class FINALVEHICLE extends JFrame implements ActionListener{
    
    public static ArrayList<VehicleStorage> vehicleStorage = new ArrayList<>();
    
    /*some of the following code is adapted from
    https://www.youtube.com/watch?v=PUeiDFWreFc
    */

    JFrame frame = new JFrame();
    public static JPanel panel = new JPanel();
    JPanel sidepanel = new JPanel();
    JButton homeButton = new JButton("Home");
    JButton addEntry = new JButton("Add Fuel Entry");
    
    public FINALVEHICLE(String username){
        
        //homeButton.setSize(20, 20);
        homeButton.setBounds(30,30,200,30);
        homeButton.setBackground(Color.WHITE);
        homeButton.setForeground(Color.BLACK);
        
        addEntry.setBounds(30, 580, 200, 30);
        addEntry.setBackground(Color.WHITE);
        addEntry.setForeground(Color.BLACK);
        
        //panel.setLayout(null);
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
        
        homeButton.addActionListener(this);
        addEntry.addActionListener(this);
        
        homeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new HomePage(username).setVisible(true);
                frame.setVisible(false);
            }
        });
        
        addEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AddEntry(username).setVisible(true);
                frame.setVisible(false);
            }
        });
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
    

    
    public static void main(String[] args){
        FINALVEHICLE v = new FINALVEHICLE(username);
        v.frame.setVisible(true);
        panel.removeAll();

  

    int w = 0;
        while(w < AtlantisFuel.vehicles.size()){
            JButton[] button = new JButton[AtlantisFuel.vehicles.size()];
            if(HomePage.username.equals(AtlantisFuel.vehicles.get(w).getUsername())){    
                panel.add(new JButton(AtlantisFuel.vehicles.get(w).getNameOfVehicle()));
                
//                JButton b = new JButton();
//                b.setBounds(200,200,200,60);
//                b.setText(AtlantisFuel.vehicles.get(w).getNameOfVehicle());
//                panel.add(b);
            }
            w = w + 1;
        }
        
//        borderlayout.add(gridlayout, BorderLayout.CENTER);
//        panel.setLayout(borderlayout);

    }
    
    
    
}
