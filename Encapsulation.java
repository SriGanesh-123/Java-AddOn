package task;

import java.util.Date;

public class Encapsulation {
	private String username;
	private String password;
	private String email;
	private String address;
	private long mobileNumber;
	private Date createdAt;
	private Date updatedAt;
	private boolean isActive;
	
	public String getUsername() {
		return username;
	}
	public void setUsername( String username) {
		this.username=username;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword( String password) {
		this.password=password;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail( String email) {
		this.email=email;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress( String address) {
		this.address=address;
	}
	
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber( long mobileNumber) {
		this.mobileNumber=mobileNumber;
	}
	
	
	public Date getCreatedAt() {
		return createdAt;
		
	}
	public void setCreatedAt( Date createdAt) {
		this.createdAt=createdAt;
	}
	
	
	public Date getUpdatedAt() {
		return updatedAt;		
	}
	public void setUpdtedAt(Date updatedAt) {
		this.updatedAt=updatedAt;		
	}
	
	
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive( boolean isActive) {
		this.isActive=isActive;
	}

}
