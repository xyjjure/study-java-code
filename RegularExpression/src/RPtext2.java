import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RPtext2 {

	public static void main(String[] args) {
		  Pattern p=Pattern.compile("[\\d]{3,5}");
		  Matcher m=p.matcher("134-35563-4556-66");
		  p(m.matches());
		  m.reset();
		  p(m.find());
		  p(m.start()+"-"+m.end());
		  p(m.find());
		  p(m.start()+"-"+m.end());
		  p(m.find());
		  p(m.start()+"-"+m.end());
		  p(m.find());
		  p(m.lookingAt());
		  p(m.lookingAt());
		  p(m.lookingAt());
		  p(m.lookingAt());

	}
	public static void p(Object o){
		System.out.println(o);
	}


}
