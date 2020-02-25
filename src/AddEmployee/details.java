  package AddEmployee;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class details  implements ActionListener{

    public JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;
    private JPanel panel_1;

    public details(){
        f=new JFrame("Employee Detail");
        f.setBackground(Color.white);
        f.getContentPane().setLayout(null);
                                                                                                                
       JPanel panel = new JPanel();
       panel.setBackground(Color.BLACK);
       panel.setBounds(405, 72, 279, 155);
       f.getContentPane().add(panel);
       panel.setLayout(null);
                                                                  
                                                                  
       b2=new JButton("View");
       b2.setBackground(new Color(51, 255, 255));
       b2.setBounds(147, 23, 100, 40);
       panel.add(b2);
       b2.setFont(new Font("serif",Font.BOLD,15));
                                                                  
       b4=new JButton("Update");
       b4.setBackground(new Color(255, 255, 0));
       b4.setBounds(147, 85, 100, 40);
       panel.add(b4);
       b4.setFont(new Font("serif",Font.BOLD,15));
       b4.addActionListener(this);
                                                                          
        b1=new JButton("Add");
        b1.setBackground(new Color(51, 204, 0));
        b1.setBounds(23, 23, 100, 40);
       panel.add(b1);
       b1.setFont(new Font("serif",Font.BOLD,15));
                                                                                  
       b3=new JButton("Remove");
       b3.setBackground(new Color(255, 0, 0));
       b3.setBounds(23, 85, 100, 40);
       panel.add(b3);
       b3.setFont(new Font("serif",Font.BOLD,15));
       b3.addActionListener(this);
             
       b1.addActionListener(this);
       
                                                                  
       b2.addActionListener(this);
                                                                                                                                
       panel_1 = new JPanel();
       panel_1.setBackground(new Color(0, 0, 51));
       panel_1.setBounds(-15, 0, 715, 71);
       f.getContentPane().add(panel_1);
       panel_1.setLayout(null);
                                                                                                                               
       l2 = new JLabel("Employee Details");
       l2.setBackground(new Color(255, 255, 255));
       l2.setBounds(250, 11, 225, 49);
       panel_1.add(l2);
       l2.setFont(new Font("Serif", Font.BOLD, 26));
       l2.setForeground(new Color(255, 255, 255));
                                                                                                                                        
       l1 = new JLabel();
       l1.setBounds(0, 0, 700, 500);
       l1.setLayout(null);
                                                                      
       l1.setIcon(new ImageIcon("G:\\icons\\details.jpg"));
       f.getContentPane().add(l1);

        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(450,200);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new View_Employee();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new Remove_Employee();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new Search_Employee();
        }
    }
}
class MainDetails{
	 public static void main(String[] arg){
	        details d = new details();

	        
	    }
}

