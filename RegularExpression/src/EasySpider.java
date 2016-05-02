import java.io.*;
import java.util.regex.*;
public class EasySpider {

	public static void main(String[] args) {
		try {
		     BufferedReader br=new BufferedReader(new FileReader("F:\\Ñ¸À×ÏÂÔØ\\xxx.html"));
		    String line="";
		    while((line=br.readLine())!=null){
		    	parse(line);
		    }
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void parse(String s) {
		Pattern p=Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+");
		Matcher m=p.matcher(s);
		while(m.find()){
			System.out.println(m.group());	
		}
		
	}

}
