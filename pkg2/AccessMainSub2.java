package AccessModifier.pkg2;
import AccessModifier.pkg1.*;

public class AccessMainSub2 extends Default{

	public static void main(String[] args) {
		//default can't access different pkg sub class
		AccessMainNonSub2 ams2 = new AccessMainNonSub2();
		//ams2.defaultAccess();

	}

}
