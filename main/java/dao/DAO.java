package dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialBlob;

import dto.User;

public class DAO {
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		
		return conn;
	}
	
	public static int saveUser(User user) throws  SQLException, ClassNotFoundException {
		
		Connection con=getConnection();
				
		PreparedStatement pst = con.prepareStatement("insert into user values(?,?,?,?,?,?)");
		pst.setInt(1,user.getUserid());
		pst.setString(2, user.getUsername());
		pst.setString(3, user.getUseremail());
		pst.setLong(4, user.getUsercontact());
		pst.setString(5, user.getUserpassword());
		Blob imageblob = new SerialBlob(user.getUserimage());
		pst.setBlob(6, imageblob);
		
		
		int res=pst.executeUpdate();
		System.out.println(res);
		
		return res;
		
	}
	
	 public  User findByEmail(String email) throws ClassNotFoundException, SQLException
	 {
		 Connection conn = getConnection();
		 PreparedStatement pst = conn.prepareStatement("Select * from user where useremail = ? ");
	     pst.setString(1, email);
	     
	     ResultSet rs = pst.executeQuery();
	     if (rs.next()) {
	    	 User u = new User();
	    	 u.setUserid(rs.getInt(1));
	    	 u.setUsername(rs.getString(2));
	    	 u.setUseremail(rs.getString(3));
	    	 u.setUsercontact(rs.getLong(4));
	    	 u.setUserpassword(rs.getString(5));
	    	 //convert to blob  object to byte[]
	    	 Blob blobImage = rs.getBlob(6);
	    	 
	    	 byte[] image = blobImage.getBytes(1, (int)blobImage.length());
	    	 
	    	 u.setUserimage(image);
	    	 
	    	 return u;
	    	 
			
		} else {
           return null;
		}
	}
	
}
