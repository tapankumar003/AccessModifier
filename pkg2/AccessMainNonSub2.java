package AccessModifier.pkg2;
import AccessModifier.pkg1.*;

public class AccessMainNonSub2 {

	public static void main(String[] args) {
//		Default can't access in different pkg non sub
		Default d = new Default();
		//d.defultAccess();
		Protected ptt = new Protected();
//		ptt.protectedAccess();
		Public pb = new Public();
		pb.publicAccess();

	}

}
