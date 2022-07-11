package AccessModifier.pkg1;

public class Public {
	//public access modifier can access anywhere
	static public void publicAccess() {
		System.out.println("Hi, I'm public access Modifier");
	}
	public static void main(String[] args) {
		publicAccess();
	}

}