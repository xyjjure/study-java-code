package collection;
import java.util.*;
public class list {;
	public static void main(String[] args) {
		List l1=new LinkedList();
		for(int i=0;i<=5;i++){
			l1.add("a"+i);
		}
		System.out.println(l1);
		l1.add(3,"a100");
		System.out.println(l1);
		l1.set(5, "a200");
		System.out.println(l1);
		System.out.print((String)l1.get(2)+" ");
		System.out.println(l1.indexOf("a3"));
		l1.remove(1);
		System.out.println(l1);   

	}

}
 