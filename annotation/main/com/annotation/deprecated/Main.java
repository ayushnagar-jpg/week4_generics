package annotation.deprecated;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LegacyAPI legacyapi = new LegacyAPI();
		
		String oldMethod = legacyapi.oldMethod();
		String newMethod = legacyapi.newMethod();
		
		System.out.println(oldMethod);
		System.out.print(newMethod);
	}

}
