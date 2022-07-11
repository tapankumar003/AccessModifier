package AccessModifier.pkg1;

public class Private {
//	private access modifier only access in same class not anywhere
	
		static private void privateAccess() {
			System.out.println("Hi, I'm private access Modifier");
		}
		public static void main(String[] args) {
			privateAccess();
		}

	}

