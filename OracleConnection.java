import java.sql.*;
import oracle.jdbc.*;
import java.util.*;

class OracleConnection
{
	public static void main(String args[]) throws Exception
	{
		
		// STUDENT table has been created in oracle DB
		
			// dynamically load the driver class 
			Class.forName("oracle.jdbc.OracleDriver");
			
			// cfeate the connection object 
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:C##TDBUSER/testdb@localhost:1521:testpdb");
			// localhost: local server 						// url for database 
			// system: oracle user name
			// rkmr039: oracle password 
			// xe: xpress edition
			// 1521 : port
			// thin : driver completely coded in java and is independent 

			// create the statement object 
			Statement stmt = con.createStatement();
			String sql;

			sql = "create table STUDENT(id number(2), name varchar2(10), age number(3))";
			stmt.executeUpdate(sql);

			sql = "insert into STUDENT(id, name, age) values (001, 'Robin', 20)";
			stmt.executeQuery(sql);
			
			sql = "insert into STUDENT(id, name, age) values (002, 'Rishab', 22)";
			stmt.executeQuery(sql);

			sql = "insert into STUDENT(id, name, age) values (003, 'Sujal', 12)";
			stmt.executeQuery(sql);
			
			sql = "Select *from STUDENT"; 
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			System.out.println("========Old Records=========");
			// close the Connection object, ResultSet object and Statement ojbect
			sql = "insert into STUDENT(id, name, age) values (004, 'Rohit', 24)";
			stmt.executeUpdate(sql);
			sql = "Select *from STUDENT"; 
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			/*
			Example of PreparedStatement interface that updates the record
			PreparedStatement stmt=con.prepareStatement("update emp set name=? where id=?");  
			stmt.setString(1,"Sonoo");//1 specifies the first parameter in the query i.e. name  
			stmt.setInt(2,101);  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated");
			
			Example of PreparedStatement interface that deletes the record

			PreparedStatement stmt=con.prepareStatement("delete from emp where id=?");  
			stmt.setInt(1,101);  
  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records deleted");  

			Example of PreparedStatement interface that retrieve the records of a table

			PreparedStatement stmt=con.prepareStatement("select * from emp");  
			ResultSet rs=stmt.executeQuery();  
			while(rs.next()){  
			System.out.println(rs.getInt(1)+" "+rs.getString(2));  
		}  
Example of PreparedStatement to insert records until user press n


PreparedStatement ps=con.prepareStatement("insert into emp130 values(?,?,?)");  
  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
do{  
System.out.println("enter id:");  
int id=Integer.parseInt(br.readLine());  
System.out.println("enter name:");  
String name=br.readLine();  
System.out.println("enter salary:");  
float salary=Float.parseFloat(br.readLine());  
  
ps.setInt(1,id);  
ps.setString(2,name);  
ps.setFloat(3,salary);  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
  
System.out.println("Do you want to continue: y/n");  
String s=br.readLine();  
if(s.startsWith("n")){  
break;  
}  
}while(true);  
 
}}  */
		//finally
		{
			con.close();
			rs.close();
			stmt.close();
		}
	}
}