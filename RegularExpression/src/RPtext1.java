import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RPtext1 {

	public static void main(String[] args) {
		  int n=Pattern.CASE_INSENSITIVE;
		  Pattern p=Pattern.compile("java",n);
		  Matcher m=p.matcher("java JAVA JAva JAVa Java IloveJAVA youhatejava etrgds");
		  StringBuffer buf=new StringBuffer();
		  int i=0;
		  while (m.find()){
			  i++;
			  if(i%2==0) m.appendReplacement(buf, "JAVA");
			  else m.appendReplacement(buf, "java");
		  }
		  m.appendTail(buf);
		  p(buf);
	}
	public static void p(Object o){
		System.out.println(o);
	}

}
