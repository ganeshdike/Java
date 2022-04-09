package Assignment26;

public class UserEntityClass
{
	private Integer id;
	private String firstName;
	private String lastName;
	private String city;
	private long mobileNo;
	
	public UserEntityClass() 
	{
	}

	public UserEntityClass(String firstName, String lastName, String city, long mobileNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.mobileNo = mobileNo;
	}

	public Integer getId() {
		return id;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "UserEntityClass [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", mobileNo=" + mobileNo + "]";
	}
	
}
