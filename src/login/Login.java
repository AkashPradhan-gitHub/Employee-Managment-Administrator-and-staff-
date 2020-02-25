  
package login;
import AddEmp.AddEmp;
import AddEmployee.*;


import java.awt.*;
import java.awt.EventQueue;

import javax.swing.*;
//import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import java.awt.Font;
//import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JSeparator;

public class Login extends JFrame {
	
	private JPanel contentPane;
	private JTextField User;
	private JPasswordField Pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(241, 196, 15));
		
		p1.setBounds(10, 11, 430, 56);
		contentPane.add(p1);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		p1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		
		JPanel p2 = new JPanel();
		p2.setBackground(new Color(0, 0, 51));
		p2.setBounds(10, 67, 430, 222);
		contentPane.add(p2);
		p2.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(new Color(46, 204, 113));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLogin.setBounds(73, 172, 89, 23);
		p2.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(new Color(243, 156, 18));
		btnReset.setBounds(187, 172, 89, 23);
		p2.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnExit.setBackground(new Color(183, 28, 12));
		btnExit.setBounds(311, 172, 79, 23);
		p2.add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 151, 410, 10);
		p2.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("PassWord");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(48, 96, 91, 26);
		p2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1.setBackground(SystemColor.activeCaption);
		
		Pass = new JPasswordField();
		Pass.setBackground(new Color(189, 195, 199));
		Pass.setBounds(180, 97, 175, 31);
		p2.add(Pass);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(48, 27, 114, 26);
		p2.add(lblUsername);
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Calisto MT", Font.BOLD, 17));
		
		User = new JTextField();
		User.setFont(new Font("Tahoma", Font.PLAIN, 14));
		User.setForeground(new Color(0, 0, 0));
		User.setBackground(new Color(189, 195, 199));
		User.setBounds(180, 25, 175, 31);
		p2.add(User);
		User.setColumns(10);
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f=new JFrame();
				int a=JOptionPane.showConfirmDialog(f,"Are you sure you want to exit ");
				if(a==JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
				
				
			}
			
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setText(null);
				Pass.setText(null);
			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
				
				String uname=User.getText();
				String upass=Pass.getText();
				
				conn c1=new conn();
					//c1.con();
					
				
				ResultSet rs=(ResultSet) c1.s.executeQuery("select * from login");  
	         
				String u=null,v=null;
				while(rs.next())  
	            {
					 u=rs.getString("password");
					 v=rs.getString("username");
					 //c=rs.getString("name");
					
	            	
	            	
	            }
				//System.out.println(u+"   \n" +v);  
					
	          
			      
									
					  if(uname.equals(u) && upass.equals(u)) {
					  //System.out.println("Login sucessfully");
					  
					  JOptionPane.showMessageDialog(null, "Welcome"); 
					  //Add_Employee d=new Add_Employee(); 
					  
					  details d1 = new details();
					 
					  dispose(); 
					 					 
					  d1.f.setVisible(true);
					  }
					  else
					  {
						  JOptionPane.showMessageDialog(null, "Login faild \n Try again");
						  
					  }
					 
				}
				catch(Exception e)
				{
					
				}
				
				
			}
		});
		
		
		setUndecorated(true);
	}
}
