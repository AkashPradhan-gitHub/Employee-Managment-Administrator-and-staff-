package AddEmployee;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import login.conn;
import com.jgoodies.forms.factories.DefaultComponentFactory;

class Remove_Employee implements ActionListener{
    JFrame f;
    JTextField t;
    JLabel l1,l2,l3,l4,l6,l7,l8;
    JButton b,b3;
    private JPanel panel_1;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    JButton Rmv,Cen;

    Remove_Employee(){
        f=new JFrame("Remove Employee");
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
        f.setBackground(Color.green);
        Font f2 = new Font("serif",Font.BOLD,25);
        Font f3 = new Font("serif",Font.BOLD,20);
        Font F6=new Font("serif",Font.BOLD,20);
        Font f4 = new Font("serif",Font.BOLD,20);
        Font F7=new Font("serif",Font.BOLD,20);
        Font F5=new Font("serif",Font.BOLD,20);
        Font f8=new Font("serif",Font.BOLD,20);
       f.getContentPane().setLayout(null);
                                                                                                                                
                                                                                                                         
      l2=new JLabel("Name:");
     l2.setBounds(51, 244, 250, 30);
     l2.setBackground(new Color(255, 255, 255));
     f.getContentPane().add(l2);
     l2.setForeground(new Color(255, 255, 255));
     l2.setFont(new Font("Serif", Font.BOLD, 22));
     l2.setVisible(false);
                                                                                                                        
                                                                                                                               
    l1=new JLabel("Employee Id");
    l1.setBounds(51, 49, 250, 30);
   l1.setBackground(Color.BLACK);
    f.getContentPane().add(l1);
   l1.setForeground(Color.white);
   l1.setFont(f2);
                                                                                                                                
   t=new JTextField();
   t.setBounds(249, 61, 150, 30);
   f.getContentPane().add(t);
                                                                                                                                        
                                                                                                                                        
   b=new JButton("Search");
   b.setForeground(new Color(255, 255, 255));
   b.setBackground(new Color(0, 0, 255));
   b.setBounds(215, 131, 100, 30);
  f.getContentPane().add(b);
                                                                                                                                                
  b3=new JButton("back");
  b3.setForeground(new Color(255, 255, 255));
  b3.setBackground(new Color(255, 51, 51));
  b3.setBounds(357, 131, 100, 30);
  f.getContentPane().add(b3);
                                                                                                                                                    
                                                                                                        l3=new JLabel("Mobile No:");
                                                                                                         l3.setBounds(51, 299, 250, 30);
                                                                                                        f.getContentPane().add(l3);
                                                                                                      l3.setForeground(new Color(255, 255, 255));
                                                                                                   l3.setFont(new Font("Serif", Font.BOLD, 22));
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                l4=new JLabel("Email Id:");
                                                                                               l4.setBounds(51, 350, 250, 30);
                                                                                             f.getContentPane().add(l4);
                                                                                              l4.setForeground(new Color(255, 255, 255));
                                                                                             l4.setFont(F5);
                                                                                                                                                                                
                                                                                             l6=new JLabel();
                                                                                             l6.setBounds(215, 244, 269, 30);
                                                                                            f.getContentPane().add(l6);
                                                                                          l6.setForeground(Color.white);
                                                                                       l6.setFont(new Font("Serif", Font.BOLD, 22));
                                                                                                                                                                                        
                                                                                                                                                                                        
                                                                                   l7=new JLabel();
                                                                                 l7.setBounds(215, 299, 269, 30);
                                                                               f.getContentPane().add(l7);
                                                                             l7.setForeground(Color.white);
                                                                           l7.setFont(new Font("Serif", Font.BOLD, 22));
                                                                                                                                                                                                
                                                                            l8=new JLabel();
                                                                          l8.setBounds(215, 350, 269, 30);
                                                                           f.getContentPane().add(l8);
                                                                            l8.setForeground(Color.white);
                                                                           l8.setFont(new Font("Serif", Font.BOLD, 22));
                                                                                                                                                                                                        
                                                                           JPanel panel = new JPanel();
                                                                          panel.setBounds(0, 0, 484, 180);
                                                                          panel.setBackground(new Color(255,87,34));
                                                                        f.getContentPane().add(panel);
                                                                        panel.setLayout(null);
                                                                        
                                                                        lblNewLabel_1 = new JLabel("");
                                                                        lblNewLabel_1.setIcon(new ImageIcon("G:\\icons\\b2.jpg"));
                                                                        lblNewLabel_1.setBounds(0, 0, 484, 183);
                                                                        panel.add(lblNewLabel_1);
                                                                                                                                                                                                        
                                                                         panel_1 = new JPanel();
                                                                        panel_1.setBackground(new Color(156,39,176));
                                                                        panel_1.setBounds(0, 180, 484, 281);
                                                                        f.getContentPane().add(panel_1);
                                                                       panel_1.setLayout(null);
                                                                       
                                                                       Cen = new JButton("CENCEL");
                                                                       Cen.addActionListener(new ActionListener() {
                                                                       	public void actionPerformed(ActionEvent ae) {
                                                                       		
                                                                       		if(ae.getSource()==Cen)
                                                                            {
                                                                          	  f.setVisible(false);
                                                                          	  details d=new details();
                                                                            }
                                                                            
                                                                       		
                                                                       		
                                                                       		
                                                                       	}
                                                                       });
                                                                       Cen.setForeground(new Color(255, 255, 255));
                                                                       Cen.setBackground(new Color(204, 0, 0));
                                                                       Cen.setBounds(299, 225, 96, 29);
                                                                       panel_1.add(Cen);
                                                                       
                                                                       Rmv = new JButton("REMOVE");
                                                                       Rmv.addActionListener(new ActionListener() {
                                                                       	public void actionPerformed(ActionEvent e) {
                                                                       	 if(e.getSource()==Rmv){
                                                                             try{
                                                                                 conn con = new conn();
                                                                                 int re=JOptionPane.showConfirmDialog(null,"Are you sure to delete?");
                                                                                 if(re==0)
                                                                                 {
                                                                                 String str = "delete from employee where emp_id = '"+t.getText()+"'";
                                                                                 con.s.executeUpdate(str);
                                                                                 JOptionPane.showMessageDialog(null,"deleted successfully");
                                                                                 l2.setVisible(false);
                                                                                 l3.setVisible(false);
                                                                                 l4.setVisible(false);
                                                                                 l6.setVisible(false);
                                                                                 l7.setVisible(false);
                                                                                 l8.setVisible(false);
                                                                                 Rmv.setVisible(false);
                                                                                 Rmv.setVisible(false);
                                                                                 }
                                                                                 else if(re==1)
                                                                                 {
                                                                                	 
                                                                                 }
                                                                                 
                                                                                 else
                                                                                 {
                                                                                	 
                                                                                 }

                                                                             }catch(Exception ex){
                                                                                 JOptionPane.showMessageDialog(null,"Exception occured while delting record "+ex);
                                                                             }
                                                                         }
                                                                       		
                                                                       	}
                                                                       });
                                                                       Rmv.setForeground(Color.WHITE);
                                                                       Rmv.setBackground(Color.RED);
                                                                       Rmv.setBounds(146, 228, 96, 26);
                                                                       panel_1.add(Rmv);
                                                                       
                                                                       lblNewLabel = new JLabel("");
                                                                       lblNewLabel.setIcon(new ImageIcon("G:\\icons\\h1.jpg"));
                                                                       lblNewLabel.setBounds(0, 0, 484, 305);
                                                                       panel_1.add(lblNewLabel);
                                                                       l4.setVisible(false);
                                                                      l3.setVisible(false);
                                                                    b3.addActionListener(this);
                                                                 b.addActionListener(this);

        f.setSize(500,500);
        f.setLocation(500,250); 
        f.setVisible(true);
    }
   
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            try{
                conn con = new conn();
                String str = "select name,phone,email from employee where emp_id ='"+t.getText()+"' ";
                ResultSet rs = con.s.executeQuery(str);

                int i=0;
                if(rs.next()){
                    String name = rs.getString(1);
                    String mob = rs.getString(2);
                    String email=rs.getString(3);

                    l2.setVisible(true);
                    l3.setVisible(true);
                    l4.setVisible(true);
                    //b1.setVisible(true);
                    //b2.setVisible(true);   
                    i=1;
                    l6.setText(name);
                    l7.setText(mob);
                    l8.setText(email);
                    
                   
                    
                  }
                
                
                if(i==0)
                    JOptionPane.showMessageDialog(null,"Id not found");
            }catch(Exception ex){}
            
           
          }
        
        if(ae.getSource()==b3){
            f.setVisible(false);
            details d=new details();
        }
            
       
            
          
        
    }
    

    public static void main(String[]ar){
        new Remove_Employee();
    }
}
