package kodlamaIODemo.entities;

public class Educator {
	
	private int educatorId;
	private String firstName;
	private String lastName;
	private String profilePicture;
	
	
	public Educator() {
		
	}


	public Educator(int educatorId, String firstName, String lastName, String profilePicture) {
		this.educatorId = educatorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profilePicture = profilePicture;
	}


	public int getEducatorId() {
		return educatorId;
	}


	public void setEducatorId(int educatorId) {
		this.educatorId = educatorId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getProfilePicture() {
		return profilePicture;
	}


	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	
}
