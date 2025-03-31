package annotation.suppress;

import java.util.ArrayList;

public class SuppressUncheckedWarning {
	
	@SuppressWarnings("unchecked")
	public ArrayList<Object> addElement() {
		ArrayList ar = new ArrayList<>();
		
		//adding element to list
		ar.add("Hello");
		ar.add(23);
		ar.add(2.2);
		
		//printing list
		
		return ar;
		
	}
}
