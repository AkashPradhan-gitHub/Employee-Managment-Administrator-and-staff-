package AddEmployee;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Search_Employee implements ActionListener{
    JFrame fr;
    JTextField t;
    JLabel l,l5;
    JButton b,b2;

    Search_Employee(){
        fr=new JFrame("search");
        fr.setBackground(Color.green);
        fr.getContentPane().setLayout(null);

        l5=new JLabel();
        l5.setBounds(0,0,500,270);
        l5.setLayout(null);
       
        l5.setIcon(new ImageIcon("G:\\icons\\se1.jpg"));


        l=new JLabel("Employee Id");
        l.setVisible(true);
        l.setBounds(40,50,250,30);
        l.setForeground(Color.white);
        Font F1=new Font("serif",Font.BOLD,25);
        l.setFont(F1);
        l5.add(l);
        fr.getContentPane().add(l5);

        t=new JTextField();
        t.setBounds(240,50,220,30);
        l5.add(t);

        b=new JButton("Search");
        b.setBackground(new Color(0, 51, 204));
        b.setBounds(240,150,100,30);
        b.addActionListener(this);
        l5.add(b);


        b2=new JButton("Cancel");
        b2.setBackground(new Color(255, 0, 0));
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        l5.add(b2);

        fr.setSize(500,270);
        fr.setLocation(450,250);
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
           // f.setVisible(false);
            details d=new details();
            fr.dispose();
            fr.setVisible(false);
        }
        if(ae.getSource()==b){
            new Update_Employee(t.getText());
            
            fr.dispose();
            fr.setVisible(false);
            
        }

    }
   
    public static void main(String[]ar){
        new Search_Employee();
    }    
}