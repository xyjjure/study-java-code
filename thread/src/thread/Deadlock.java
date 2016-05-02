package thread;

public class Deadlock implements Runnable{
    public int flag=1;
    static Object o1=new Object(),o2=new Object();
    public void run(){
    System.out.println("flag="+flag);
    if(flag==0){
    	synchronized(o1){
    		try{
    			Thread.sleep(500);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	synchronized(o2){
    		System.out.println("0");
    	}
    	}
    }
    if(flag==1){
    	synchronized(o2){
    		try{
    			Thread.sleep(500);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	synchronized(o1){
    		System.out.println("1");
    	}
    	}
    }

    } 
	public static void main(String[] args) {
	Deadlock text1=new Deadlock();
	Deadlock text2=new Deadlock();
	text1.flag=1;
	text2.flag=0;
	Thread t1=new Thread(text1);
	Thread t2=new Thread(text2);
	t1.start();
	t2.start();

	}

}