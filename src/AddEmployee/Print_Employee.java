package AddEmployee;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Blob;

import login.conn;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Print_Employee extends JFrame {

	
	protected static final String Im = null;
	JLabel limg;
	String emp_id,nam,fath,addr,ph,emal,education,post,ag,db,aadhar;
		Image blob;
	private JPanel contentPane;
	ImageIcon newImage;
	byte[] img=new byte[500];
	Image myImg;
	//public static Image im;

	
	
	
	  Print_Employee(String e_id){
	        try{
	          
	        	Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from employee where emp_id = '"+e_id+"'");

	            if(rs.next()){
	             	                emp_id = rs.getString("emp_id");
	            	   nam = rs.getString("name");
	                fath = rs.getString("fname");
	            
	                addr = rs.getString("address");
	                ph = rs.getString("phone");
	                ag = rs.getString("age");
	                db = rs.getString("dob");
	                
	                
	                emal = rs.getString("email");
	                education = rs.getString("education");
	                post = rs.getString("post");
	                aadhar = rs.getString("aadhar");
	         
	                
	            }
	            rs.close();
	            
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	       
		  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,950, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 934, 75);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEmployeeDetails = new JLabel("Employee Details");
		lblEmployeeDetails.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblEmployeeDetails.setBounds(309, 11, 248, 53);
		panel.add(lblEmployeeDetails);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 74, 934, 537);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel emp = new JLabel("Employee Id  :");
		emp.setForeground(Color.WHITE);
		emp.setFont(new Font("Tahoma", Font.BOLD, 18));
		emp.setBounds(31, 52, 162, 30);
		panel_1.add(emp);
		
		JLabel name = new JLabel("Name       :  ");
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Tahoma", Font.BOLD, 18));
		name.setBounds(31, 116, 162, 30);
		panel_1.add(name);
		
		JLabel father = new JLabel("Father's Name  :");
		father.setForeground(Color.WHITE);
		father.setFont(new Font("Tahoma", Font.BOLD, 18));
		father.setBounds(31, 181, 162, 30);
		panel_1.add(father);
		
		JLabel add = new JLabel("Address    :");
		add.setForeground(Color.WHITE);
		add.setFont(new Font("Tahoma", Font.BOLD, 18));
		add.setBounds(31, 246, 160, 30);
		panel_1.add(add);
		
		JLabel job = new JLabel("Job Post  :");
		job.setForeground(Color.WHITE);
		job.setFont(new Font("Tahoma", Font.BOLD, 18));
		job.setBounds(31, 308, 162, 30);
		panel_1.add(job);
		
		JLabel lemp = new JLabel(emp_id);
		lemp.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
		lemp.setForeground(Color.WHITE);
		lemp.setBounds(203, 52, 200, 30);
		panel_1.add(lemp);
		
		JLabel lname = new JLabel(nam);
		lname.setForeground(Color.WHITE);
		lname.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
		lname.setBounds(203, 116, 200, 30);
		panel_1.add(lname);
		
		JLabel lfather = new JLabel(fath);
		lfather.setForeground(Color.WHITE);
		lfather.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
		lfather.setBounds(203, 181, 200, 30);
		panel_1.add(lfather);
		
		JLabel ladd = new JLabel(addr);
		ladd.setForeground(Color.WHITE);
		ladd.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
		ladd.setBounds(201, 246, 202, 30);
		panel_1.add(ladd);
		
		JLabel ljob = new JLabel(post);
		ljob.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
		ljob.setForeground(Color.WHITE);
		ljob.setBounds(203, 308, 200, 30);
		panel_1.add(ljob);
		
		JLabel mob = new JLabel("Mobile  :");
		mob.setForeground(Color.WHITE);
		mob.setFont(new Font("Tahoma", Font.BOLD, 18));
		mob.setBounds(469, 181, 151, 30);
		panel_1.add(mob);
		
		JLabel email = new JLabel("Email Id  :");
		email.setForeground(Color.WHITE);
		email.setFont(new Font("Tahoma", Font.BOLD, 18));
		email.setBounds(469, 246, 151, 30);
		panel_1.add(email);
		
		JLabel edu = new JLabel("Education  :");
		edu.setForeground(Color.WHITE);
		edu.setFont(new Font("Tahoma", Font.BOLD, 18));
		edu.setBounds(469, 308, 151, 30);
		panel_1.add(edu);
		
		JLabel lmob = new JLabel(ph);
		lmob.setForeground(Color.WHITE);
		lmob.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
		lmob.setBounds(630, 181, 222, 30);
		panel_1.add(lmob);
		
		JLabel lemail = new JLabel(emal);
		lemail.setForeground(Color.WHITE);
		lemail.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
		lemail.setBounds(630, 240, 294, 36);
		panel_1.add(lemail);
		
		JLabel ledu = new JLabel(education);
		ledu.setForeground(Color.WHITE);
		ledu.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
		ledu.setBounds(630, 308, 222, 30);
		panel_1.add(ledu);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnPrint.setBackground(Color.GREEN);
		btnPrint.setForeground(Color.BLACK);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
	            	Class.forName("com.mysql.jdbc.Driver");
	                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","");
	                Statement st = con.createStatement();
	                ResultSet rs = st.executeQuery("select * from employee where emp_id = '"+e_id+"'");
	                if(rs.next()){
	                    byte[] img = rs.getBytes("Image");


	                    
	                    
	                    ImageIcon image = new ImageIcon(img);
	                    Image im = image.getImage();
	                  //  System.out.println(im);
	                    Image myImg = im.getScaledInstance(limg.getWidth(), limg.getHeight(),Image.SCALE_SMOOTH);
	                   // System.out.println(myImg);
	                    ImageIcon newImage = new ImageIcon(myImg);
	                    limg.setIcon(newImage);
	                }
	                
	                else{
	                    JOptionPane.showMessageDialog(null, "No Data");
	                }
	            }catch(Exception ex){
	                ex.printStackTrace();
	            }
				
				
				
				
				
				
				
				
				
				
				
				JOptionPane.showMessageDialog(null, "Printing Sucessfully");
				View_Employee v=new View_Employee();
				setVisible(false);
			}
		});
		btnPrint.setBounds(203, 423, 127, 30);
		panel_1.add(btnPrint);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(Color.RED);
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				details d=new details();
				setVisible(false);
			}
		});
		btnCancel.setBounds(430, 423, 127, 30);
		panel_1.add(btnCancel);
		
		JLabel limg = new JLabel("");
		limg.setIcon(null);
		limg.setBounds(430, 40, 212, 118);
		panel_1.add(limg);
		
		JButton btnView = new JButton("view");
		btnView.setForeground(Color.WHITE);
		btnView.setBackground(Color.DARK_GRAY);
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
	            	Class.forName("com.mysql.jdbc.Driver");
	                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","");
	                Statement st = con.createStatement();
	                ResultSet rs = st.executeQuery("select * from employee where emp_id = '"+e_id+"'");
	                if(rs.next()){
	                    byte[] img = rs.getBytes("Image");


	                    ImageIcon image = new ImageIcon(img);
	                    Image im = image.getImage();
	                    //System.out.println(im);
	                    Image myImg = im.getScaledInstance(limg.getWidth(), limg.getHeight(),Image.SCALE_SMOOTH);
	                   // System.out.println(myImg);
	                    ImageIcon newImage = new ImageIcon(myImg);
	                    limg.setIcon(newImage);
	                }
	                
	                else{
	                    JOptionPane.showMessageDialog(null, "No Data");
	                }
	            }catch(Exception ex){
	                ex.printStackTrace();
	            }
				
			}
		});
		btnView.setBounds(487, 11, 89, 23);
		panel_1.add(btnView);
		
		
	}
}
