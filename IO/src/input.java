import java.io.*;
import java.util.*;
public class input {

	public static void main(String[] args) {
		int b=0;
		FileInputStream in=null;
		try{
			in=new FileInputStream("E:\\Eclipse\\IO\\src\\input.java");				
			}
		catch(FileNotFoundException e){
			System.out.println("找不到指定文件");
			System.exit(-1);
		}
		try{
			long num=0;
			while((b=in.read())!=-1){
				System.out.print((char)b);
				num=num+1;
			}
			in.close();
			System.out.println();
			System.out.println("总共"+num+"个字节");
		}
		catch(IOException e1){
			System.out.println("文件读取错误");
			System.exit(-1);
		}  
		
	}

}
