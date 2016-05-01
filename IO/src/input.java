import java.io.*;
import java.util.*;
public class input {

	public static void main(String[] args) {
		/*int b=0;
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
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s=null;
		try{
			s=br.readLine();
			while(s!=null){
				if(s.equalsIgnoreCase("exit")) break;
				System.out.println(s.toUpperCase());
				s=br.readLine();
			}
		}
		catch(IOException e){
			e.getStackTrace();
		}
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(baos);
		try{
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
			System.out.println(bais.available());
			DataInputStream dis=new DataInputStream(bais);
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			dos.close();dis.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}*/
		String s=null;
		BufferedReader br =new BufferedReader(new InputStreamReader (System.in));
		try{
			FileWriter fw=new FileWriter("D:\\java\\copy.txt",true);
			PrintWriter log=new PrintWriter(fw);
			while((s=br.readLine())!=null){
			if (s.equalsIgnoreCase("exit")) break;
			System.out.println(s.toUpperCase());
			log.println("-----");
			log.println(s.toUpperCase());
			log.flush();
			}
		log.println("==="+new Date()+"===");
		log.flush();
		log.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
