package AddEmp;
import login.Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddEmp extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAdd;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AddEmp() {
		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(153, 255, 0));
		contentPane.setBackground(new Color(51, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmpDetails = new JLabel("Emp Details");
		lblEmpDetails.setForeground(new Color(102, 204, 0));
		lblEmpDetails.setBackground(new Color(51, 0, 51));
		lblEmpDetails.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblEmpDetails.setBounds(137, 11, 157, 32);
		contentPane.add(lblEmpDetails);
		
		JLabel Name = new JLabel("Name    :");
		Name.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Name.setForeground(new Color(255, 255, 255));
		Name.setBounds(10, 70, 109, 37);
		contentPane.add(Name);
		
		textName = new JTextField();
		textName.setBounds(165, 75, 161, 37);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblAddress.setForeground(new Color(255, 255, 255));
		lblAddress.setBounds(10, 161, 109, 32);
		contentPane.add(lblAddress);
		
		textAdd = new JTextField();
		textAdd.setBounds(165, 160, 161, 32);
		contentPane.add(textAdd);
		textAdd.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		
		
		
		btnSubmit.addActionListener(new ActionListener() {
			String name,add;
			
			public void actionPerformed(ActionEvent e) {
				
				
				
				   
				dispose();
								
			}
			
		});
		
		
		btnSubmit.setBounds(59, 227, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(237, 227, 89, 23);
		contentPane.add(btnExit);
	
		setUndecorated(true);
		
	}
	
	
	
	

}
