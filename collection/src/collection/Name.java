package collection;
import java.util.*;
public class Name implements Comparable<Name> {
	String firstname;
	String lastname;
	public Name(String firstname,String lastname){
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public String getFirstname(){
		return firstname;
		
	}
	public String getLastname(){
		return lastname;
	}
	public String toString(){
		return firstname+" "+lastname;
	}
	public boolean equals(Name obj){
		if(obj instanceof Name){
			
			return (firstname.equals(obj.firstname)&&lastname.equals(obj.lastname));
		} 
		return super.equals(obj);	
	}
	public int hashCode(){
		return firstname.hashCode();
	}
	public int compareTo(Name o){
		int lastcom=lastname.compareTo(o.lastname);
		return (lastcom!=0?lastcom:firstname.compareTo(o.firstname));
	}
	

}
