/*
set "classpath" environment variable as C:\Oracle12C\app\DBUSER\product\12.1.0\dbhome_1\jdbc\lib 
*/



import java.sql.*;
import oracle.jdbc.*;
import oracle.jdbc.pool.OracleDataSource;
class Oracle12C
{
		/*public static void main (String args[]) throws SQLException
		{
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:C##TDBUSER/testdb@localhost:1521:TESTDB");
		Connection conn = ods.getConnection();
		// Create Oracle DatabaseMetaData object
		DatabaseMetaData meta = conn.getMetaData();
		// gets driver info:
		System.out.println("JDBC driver version is " + meta.getDriverVersion());
		}*/
	public static void main(String args[]) throws Exception
	{
		
		// STUDENT table has been created in oracle DB
		
			OracleDataSource ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:C##TDBUSER/testdb@localhost:1521:TESTDB");
			Connection con = ods.getConnection(); 

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
			con.close();
			rs.close();
			stmt.close();
			/*
				creck the created table using sqlplus in cmd
				1. 
			*/
	}
	
}