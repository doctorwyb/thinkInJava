package ch20.dabase;

@DBTable(name = "MEMBER")
public class Member {
	@SqlString(30) String firstName;
	@SqlString(30) String lastName;
	@SQLInteger Integer age;
	@SqlString(value = 30, constraints = @Constraints(primaryKey = true)) String handle;
	static int memberCount;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Integer getAge() {
		return age;
	}
	public String getHandle() {
		return handle;
	}
	
	 
}
