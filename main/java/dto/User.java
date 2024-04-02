package dto;

import java.util.Arrays;

public class User {
	  private int userid ;
	  private String username;
	  private String useremail;
	  private Long usercontact;
	  private String userpassword;
	  private byte[] userimage;
	  
	  
	  
	  
	
	public User() {	}
	public User(int userid, String username, String useremail, Long usercontact, String userpassword,
			byte[] userimage) {
		super();
		this.userid = userid;
		this.username = username;
		this.useremail = useremail;
		this.usercontact = usercontact;
		this.userpassword = userpassword;
		this.userimage = userimage;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public Long getUsercontact() {
		return usercontact;
	}
	public void setUsercontact(Long usercontact) {
		this.usercontact = usercontact;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public byte[] getUserimage() {
		return userimage;
	}
	public void setUserimage(byte[] userimage) {
		this.userimage = userimage;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", useremail=" + useremail + ", usercontact="
				+ usercontact + ", userpassword=" + userpassword + ", userimage=" + Arrays.toString(userimage) + "]";
	}
  
	

}
