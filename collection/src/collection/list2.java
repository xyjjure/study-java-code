package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class list2 {
    private static final int one=1;
	public static void main(String[] args) {
		
        List l1=new LinkedList();
		l1.add(new Name("Kreil","M"));
		l1.add(new Name("Tom","M"));
		l1.add(new Name("Steven","Lee"));
		l1.add(new Name("John","o"));
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		Map<String,Integer> m=new HashMap<String,Integer>();
		for(int i=0;i<args.length;i++){
			int freq=m.get(args[i]) == null?0:m.get(args[i]);
			m.put(args[i], freq==0?one:freq+1);
		}
		System.out.println(m.size());
		System.out.println(m);



	}

}
