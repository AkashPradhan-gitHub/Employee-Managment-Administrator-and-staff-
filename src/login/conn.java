package login;

/*import java.sql.*;  


class conn{  
	
	public Statement s;
	public Connection con;
public void con(){  
	
try{  
	
Class.forName("com.mysql.jdbc.Driver");  

con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/project1","root","");  

//here sonoo is database name, root is username and password  
System.out.println("Connetion established");
s=con.createStatement();  

//ResultSet rs=s.executeQuery("select * from employee");  

 	}
catch(Exception e){ System.out.println(e);}  
}
public static void main(String args[])
{
	conn c=new conn();
	c.con();
}
}  */




import java.sql.*;

public class conn{
  
    public Connection c;
    public Statement s;

    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "");
            s = c.createStatement();
           
            
            
            
            
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    ResultSet executeQuery(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        new conn();
    }
}

 