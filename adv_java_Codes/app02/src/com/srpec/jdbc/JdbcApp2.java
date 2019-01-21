package com.srpec.jdbc;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcApp2 {

	public static void main(String[] args) throws Exception {
 
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
		Statement st = con.createStatement();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("TABLE NAME  :");
	    String tname = br.readLine();
	    String query = "create table "+tname+"( ENO number(5) primary key, ENAME varchar2(10), ESAL number(10), EADDR varchar2(10))";
	    st.executeUpdate(query);
	    System.out.println(tname+ " CREATED SUCCESSULLY ");
	    br.close();
	    st.close();
	    con.close();
	    
}

}
