import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Date;


public class input1 {

	public static void main(String[] args) {
		int a=0;
		FileReader r=null;
		try{
			r=new FileReader("E:\\Eclipse\\IO\\src\\input.java");
		FileWriter w= new FileWriter("D:\\java\\copy.txt");
		while((a=r.read())!=-1){
			w.write((char)a);
		}
		w.close();
		}
		catch(IOException e){
			System.out.println("error");
			System.exit(-1);
		
		}

	}

}
