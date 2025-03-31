package annotation.json_field;

public class Main {
	public static void main(String[]args) throws IllegalAccessException {
		User user = new User("Ashu",23);
		String jsonString = JsonSerializer.serialize(user);
		System.out.print(jsonString);
	}
}
