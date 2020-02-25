package AddEmployee;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.mysql.jdbc.PreparedStatement;

import login.conn;


class main{
public static void main(String args[])
	{
		Add_Employee e=new Add_Employee();

	}
}
public class Add_Employee extends JFrame implements ActionListener{
	
String ph=null;
File a;
JFrame f;
JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id16,id17;
JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
JButton b,b1,b2,b3;
private JPanel panel;
private JLabel lblPhoto;
private JPanel panel_2;
public JLabel photo;
private JLabel lblEmail;
private JLabel lblNewLabel_1;
private JLabel lblNewLabel_2;
String imagepath=null;



public ImageIcon ResizeImage(String ImagePath,byte[] pic)
{
			ImageIcon MyImage =new ImageIcon(ImagePath);
			Image img=MyImage.getImage();
			Image newImg=img.getScaledInstance(photo.getWidth(),photo.getHeight(),Image.SCALE_SMOOTH);
			
			ImageIcon image=new ImageIcon(newImg);
			
			//String nm="akash";
			//String photo=null,nam=null;
			return image;
			
	
}




Add_Employee(int i){}

public Add_Employee(){
f = new JFrame("Add Employee");
f.setBackground(Color.white);
//Image Icon img = new ImageIcon(ClassLoader.getSystemResource("G:\\Eclipse\\Employee\\src\\icon\\emp.jpg"));
f.getContentPane().setLayout(null);


id1 = new JLabel("Name");
id1.setForeground(new Color(255, 255, 255));
f.getContentPane().add(id1);
id1.setBounds(53,141,100,30);
id1.setFont(new Font("serif",Font.BOLD,20));

id12= new JLabel("Employee Id");
id12.setForeground(new Color(255, 255, 255));
f.getContentPane().add(id12);
id12.setBounds(53,488,150,30);
id12.setFont(new Font("serif",Font.BOLD,20));

t11=new JTextField();
f.getContentPane().add(t11);
t11.setBounds(203,488,150,30);


b = new JButton("Submit");
f.getContentPane().add(b);
b.setBackground(Color.BLACK);
b.setForeground(Color.WHITE);
b.setBounds(180,592,150,40);

b1=new JButton("Cancel");
f.getContentPane().add(b1);
b1.setBackground(Color.BLACK);
b1.setForeground(Color.WHITE);
b1.setBounds(454,592,150,40);


id10= new JLabel("Job Post");
id10.setForeground(new Color(255, 255, 255));
f.getContentPane().add(id10);
id10.setBounds(53,428,100,30);
id10.setFont(new Font("serif",Font.BOLD,20));

t9=new JTextField();
f.getContentPane().add(t9);
t9.setBounds(203,432,150,30);

t7=new JTextField();
f.getContentPane().add(t7);
t7.setBounds(203,369,150,30);


id5= new JLabel("Address");
id5.setForeground(new Color(255, 255, 255));
f.getContentPane().add(id5);
id5.setBounds(53,316,100,30);
id5.setFont(new Font("serif",Font.BOLD,20));

t5=new JTextField();
f.getContentPane().add(t5);
t5.setBounds(203,310,150,30);

t1=new JTextField();

id3= new JLabel("Age");
id3.setForeground(new Color(255, 255, 255));
f.getContentPane().add(id3);
id3.setBounds(53,261,100,30);
id3.setFont(new Font("serif",Font.BOLD,20));

t3=new JTextField();
f.getContentPane().add(t3);
t3.setBounds(203,261,150,30);



f.getContentPane().add(t1);

t1.setBounds(203,145,150,30);



id2 = new JLabel("Father's Name");
id2.setForeground(new Color(255, 255, 255));

f.getContentPane().add(id2);

id2.setBounds(53,201,200,30);

id2.setFont(new Font("serif",Font.BOLD,20));


t2=new JTextField();

f.getContentPane().add(t2);

t2.setBounds(203,205,150,30);


id8 = new JLabel("New Employee Details");

id8.setBackground(Color.BLACK);

f.getContentPane().add(id8);

id8.setBounds(54,20,368,50);
id8.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
id8.setForeground(Color.black);

panel = new JPanel();
panel.setBackground(Color.ORANGE);
panel.setBounds(0, 0, 884, 87);
f.getContentPane().add(panel);
panel.setLayout(null);
lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setIcon(new ImageIcon("G:\\icons\\Back.jpg"));
lblNewLabel_1.setBounds(0, 0, 874, 87);
panel.add(lblNewLabel_1);

JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(71, 235, 224));
panel_1.setBounds(-12, 85, 896, 576);
f.getContentPane().add(panel_1);
panel_1.setLayout(null);


id11= new JLabel("Aadhar No");
id11.setForeground(new Color(255, 255, 255));
id11.setBounds(431, 396, 100, 30);
panel_1.add(id11);
id11.setFont(new Font("serif",Font.BOLD,20));

t10=new JTextField();
t10.setBounds(590, 396, 150, 30);
panel_1.add(t10);

id9= new JLabel("Education");
id9.setForeground(new Color(255, 255, 255));
id9.setBounds(431, 341, 100, 30);
panel_1.add(id9);
id9.setFont(new Font("serif",Font.BOLD,20));

t8=new JTextField();
t8.setBounds(590, 341, 150, 30);
panel_1.add(t8);

id6= new JLabel("Phone");
id6.setForeground(new Color(255, 255, 255));
id6.setBounds(431, 275, 100, 30);
panel_1.add(id6);
id6.setFont(new Font("serif",Font.BOLD,20));

t6=new JTextField();
t6.setBounds(590, 275, 150, 30);
panel_1.add(t6);

id4= new JLabel("Date Of Birth");
id4.setForeground(new Color(255, 255, 255));
id4.setBounds(423, 210, 186, 30);
panel_1.add(id4);
id4.setFont(new Font("serif",Font.BOLD,20));

t4=new JTextField();
t4.setBounds(590, 214, 150, 30);
panel_1.add(t4);

lblPhoto = new JLabel("Photo");
lblPhoto.setForeground(new Color(204, 204, 204));
lblPhoto.setFont(new Font("Serif", Font.BOLD, 20));
lblPhoto.setBounds(629, 11, 91, 27);
panel_1.add(lblPhoto);

JButton btnBrowser = new JButton("Browser");
btnBrowser.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent arg0) {
		
		JFileChooser file=new JFileChooser();
		file.setCurrentDirectory(new File(System.getProperty("user.home")));
		FileNameExtensionFilter filter=new FileNameExtensionFilter("*.image","jpj","gif","png");
		file.addChoosableFileFilter(filter);
		int result=file.showSaveDialog(null);
		
		if(result==JFileChooser.APPROVE_OPTION)
		{
			File selectedFile=file.getSelectedFile();
			String path=selectedFile.getAbsolutePath();
			photo.setIcon(ResizeImage(path,null));
			imagepath=path;
		}
		else if(result==JFileChooser.CANCEL_OPTION)
		{
			System.out.println("no file selected");
		}
		
		
	}
	
	
});



btnBrowser.setBounds(618, 153, 89, 23);
panel_1.add(btnBrowser);
panel_2 = new JPanel();
panel_2.setBackground(new Color(0, 0, 0));
panel_2.setBounds(590, 46, 150, 97);


panel_1.add(panel_2);
panel_2.setLayout(null);
photo = new JLabel("photo");


photo.setIcon(new ImageIcon(new ImageIcon("a").getImage().getScaledInstance(130, 80, Image.SCALE_DEFAULT)));

photo.setBounds(0, 0, 150, 97);
panel_2.add(photo);
lblEmail = new JLabel("Email");
lblEmail.setForeground(new Color(255, 255, 255));
lblEmail.setFont(new Font("Serif", Font.BOLD, 20));
lblEmail.setBounds(67, 275, 100, 35);
panel_1.add(lblEmail);
lblNewLabel_2 = new JLabel("");
lblNewLabel_2.setForeground(new Color(255, 255, 255));
lblNewLabel_2.setIcon(new ImageIcon("G:\\icons\\b4.jpg"));
lblNewLabel_2.setBounds(10, 0, 886, 576);
panel_1.add(lblNewLabel_2);

b1.addActionListener(this);
b.addActionListener(this);




f.setVisible(true);
f.setSize(900,700);
f.setLocation(400,150);
//f.setUndecorated(true);

}






@Override
public void actionPerformed(ActionEvent ae){
    
//    String a = t1.getText();
//    String bb = t2.getText();
//    String c = t3.getText();
//    String d = t4.getText();
//    String e = t5.getText();
//    String ff = t6.getText();
//    String g = t7.getText();
//    String h = t8.getText();
//    String i = t9.getText();
//    String j = t10.getText();
//    String k = t11.getText();
//    
    
    if(ae.getSource() == b){
        try{
        	
            //conn cc = new conn();
        	 Class.forName("com.mysql.jdbc.Driver");
             
             Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "");
           // System.out.println(imagepath);
             
            File file=new File(imagepath);
            String s=file.getPath();
        
            FileInputStream fis=new FileInputStream(file);
            byte b[] = new byte[fis.available()];
			fis.read(b);  
			fis.close();

            java.sql.PreparedStatement ps=cc.prepareStatement("insert into employee (name,fname,age,dob,address,phone,email,education,post,aadhar,emp_id,image) values (?,?,?,?,?,?,?,?,?,?,?,?)");
            
            
          
            ps.setString(1,t1.getText());
            ps.setString(2,t2.getText());
            ps.setString(3, t3.getText());
            ps.setString(4, t4.getText());
            ps.setString(5, t5.getText());
            ps.setString(6, t6.getText());
            ps.setString(7, t7.getText());
            ps.setString(8, t8.getText());
            ps.setString(9, t9.getText());
            ps.setString(10, t10.getText());
            ps.setString(11, t11.getText());
            ps.setBytes(12, b);                    
            
            int x=ps.executeUpdate();
            if (x >= 1)
				JOptionPane.showMessageDialog(this, "Succesfully Stored...");
			else
				JOptionPane.showMessageDialog(this, "Error in storage...");
            
            
        
            f.setVisible(false);
            new details();
        }catch(Exception ee){
            System.out.println("The error is:"+ee);
        }
    }else if(ae.getSource() == b1){
        f.setVisible(false);
        new details();
    }
}

public static void main(String[ ] arg){
    new Add_Employee();
}


}


