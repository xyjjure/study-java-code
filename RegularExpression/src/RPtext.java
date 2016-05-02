import java.util.regex.*;
public class RPtext {

	public static void main(String[] args) {
		p("abc".matches("..."));
		p("av65637b".replaceAll("\\d", "-"));
		Pattern p=Pattern.compile("[a-z]{4}");
		Matcher m=p.matcher("adds");
		p(m.matches());
		p("asds".matches("[a-z]{3}"));
        p(" \n\r\t".matches("\\s{4}"));
        p(" ".matches("\\s"));
        p("df_a".matches("\\w{4}"));
        p("13445".matches("\\d{5}"));
        p("sdfr346_*&^".matches("[a-z]{4}\\d{3}[_*&^]+"));
        p("\\".matches("\\\\"));
        p("hello sir".matches("^h.*"));
        p("hello sir".matches(".*ir$"));
        p("hello sir".matches("^h[a-z]{1,3}o\\b.*"));
        p("hellosir".matches("^h[a-z]{1,3}o\\b.*"));
        p(" \n".matches("^[\\s&&[^\\n]]*\\n$"));
        p("1_w@163.com".matches("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+"));

	}
	public static void p(Object o){
		System.out.println(o);
	}

}
