package exception;

//custom Exception Example
import java.util.ArrayList;
import java.util.Arrays;

class languagecheckexception extends Exception {
	public languagecheckexception(String str) {
		super(str);
	}
}

public class CustomEx {
	ArrayList<String> language = new ArrayList<String>(Arrays.asList("eng", "Bengali", "tamil"));

	public void check(String a) throws languagecheckexception {
		if (language.contains(a)) {
			throw new languagecheckexception(a + " language allready exist");
		} else
			language.add(a);
		System.out.println("language added in list +language");
	}

	public static void main(String[] args) throws Exception {
		CustomEx c = new CustomEx();
		c.check("telgu");
		c.check("tamil");

	}

}
