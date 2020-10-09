package JavaSwing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogiinFraame extends JFrame {
    
    private JLabel j1, j2;
    private JTextField tf1;
    private JPasswordField pf1;
    private JButton login, clear;
    private Container c;
    private Font f;
    
    LogiinFraame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 50, 700, 300);
        setTitle("Log in Demo");
        setResizable(false);
        
        f = new Font("Arial", Font.BOLD, 15);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        j1 = new JLabel("username :");
        j1.setBounds(50, 50, 150, 50);
        j1.setFont(f);
        c.add(j1);
        
        tf1 = new JTextField();
        tf1.setBounds(250, 50, 200, 50);
        tf1.setBackground(Color.white);
        tf1.setForeground(Color.GREEN);
        tf1.setFont(f);
        c.add(tf1);
        
        j2 = new JLabel("Password :");
        j2.setBounds(50, 120, 150, 50);
        j2.setFont(f);
        c.add(j2);
        
        pf1 = new JPasswordField();
        pf1.setBounds(250, 120, 200, 50);
        pf1.setEchoChar('*');
        pf1.setFont(f);
        c.add(pf1);
        
        login = new JButton("Login");
        login.setBounds(170, 190, 90, 50);
        login.setFont(f);
        c.add(login);
        
        clear = new JButton("Clear");
        clear.setBounds(280, 190, 90, 50);
        clear.setFont(f);
        c.add(clear);
        
        clear.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                
                tf1.setText(null);
                pf1.setText(null);
                
            }
        });
        
        login.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                
               String userName=tf1.getText();
               String password=pf1.getText();
               
               if(userName.equals("JAWAD") && password.equals("52923"))
               {
               
               JOptionPane.showMessageDialog(null,"Login Succesfull");
               
               }
               
               else
               {
               
               JOptionPane.showMessageDialog(null,"Invalid username Or Password");
               }
                
            }
        });
        
        
    }
    
    public static void main(String[] args) {
        LogiinFraame frame = new LogiinFraame();
        frame.setVisible(true);
    }
    
}
