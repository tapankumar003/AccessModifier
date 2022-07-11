package AccessModifier.pkg1;

public class AccessMainNonSub1 {

	public static void main(String[] args) {
		//defult can access same pkg non sub class
		Default d = new Default();
		d.defaultAccess();
		Private p = new Private();
//		p.privateAccess();
		Protected pt = new Protected();
		pt.protectedAccess();

	}

}
