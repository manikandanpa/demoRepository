import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		
		ArrayList<String> ListName = new ArrayList<String>();
		ListName.add("amit");
		ListName.add("vijay");
		ListName.add("Rahul");
		
		System.out.println(ListName.get(2));
		
		for(String a : ListName ) {
			
			System.out.println("The list of name is "+ a);
		}
		

	}

}
