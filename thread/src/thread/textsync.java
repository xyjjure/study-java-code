package thread;

public class textsync implements Runnable{
    timer t=new timer();
	public static void main(String[] args) {
	textsync text=new textsync();
	Thread t1=new Thread(text);
	Thread t2=new Thread(text);
	t1.setName("t1");
	t2.setName("t2");
	t1.start();
	t2.start();
	}
public void run(){
	t.add(Thread.currentThread().getName());
}
}
class timer {
	private static int num =0;
	public  void add(String name){
		synchronized(this){
			num++;
		try{
			Thread.sleep(1);
		}catch(InterruptedException e){}
		System.out.println(name+"第"+num+"个执行线程");
		}
		}
}