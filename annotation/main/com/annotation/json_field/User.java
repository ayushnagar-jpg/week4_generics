package annotation.json_field;

//user class with custom json field

public class User {
	@JsonField(name="User_name")
	private String name;
	
	@JsonField(name = "User_age")
	private int age;
	
	public User(String name,int age) {
		this.name = name;
		this.age = age;
	}
}
