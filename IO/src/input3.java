import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Date;


public class input3 {

	public static void main(String[] args) {
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
		}

	}

}
