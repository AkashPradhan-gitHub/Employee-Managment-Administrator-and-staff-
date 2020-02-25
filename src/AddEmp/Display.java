
package AddEmp;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import login.Login;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Display extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Display(String v1,String v2) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDetailsOfEmployee = new JLabel("Details Of Employee");
		lblDetailsOfEmployee.setForeground(new Color(0, 0, 51));
		lblDetailsOfEmployee.setBackground(new Color(0, 0, 51));
		lblDetailsOfEmployee.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblDetailsOfEmployee.setBounds(80, 11, 274, 30);
		contentPane.add(lblDetailsOfEmployee);
		
		JLabel lblNewLabel = new JLabel("Name :    "+v1);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(60, 80, 294, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblAddress = new JLabel("Address :  "+v2);
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAddress.setBounds(60, 154, 280, 30);
		contentPane.add(lblAddress);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				System.exit(0);
			}
		});
		btnExit.setBounds(177, 243, 89, 23);		contentPane.add(btnExit);
		

		
	       
	    
		
		setUndecorated(true);
		
	}
	
	
	
	 
}
