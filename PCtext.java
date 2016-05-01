package thread;

public class PCtext {

	public static void main(String[] args) {
		ArrStack as=new ArrStack();
		Producer p=new Producer(as);
		Consumer c=new Consumer(as);
		new Thread(p).start();
		new Thread(c).start();

	}

}
class Mantou {
	int id;
	Mantou(int id){
		this.id=id;
	}
   public String toString(){
	   return "mantou:"+id;
   }
	
}
class ArrStack{
    int index=0;
	public Mantou[] arr=new Mantou[6];
	public synchronized void push(Mantou mt){
		while(index==arr.length){
			try{
				this.wait();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		this.notify();
		arr[index]=mt;
		index++;
	}
	public synchronized Mantou pop(){
	while(index==0){
		try{
			this.wait();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	this.notify();
	index--;
	return arr[index];
	
	}
}
class Producer implements Runnable {
	ArrStack as=null;
	public Producer(ArrStack a){
		this.as=a;
	}
	public void run(){
		for(int i=0;i<20;i++){
		Mantou mt=new Mantou(i);
		as.push(mt);
		System.out.println("生产了："+mt);
		try{
			Thread.sleep((int)(Math.random()*1000));
		}catch(Exception e){}
		}
	}
}
class Consumer implements Runnable{
	ArrStack as=null;
	public Consumer(ArrStack a){
		this.as=a;
	}
	public void run(){
		for(int i=0;i<20;i++){
			Mantou mt=as.pop();
			System.out.println("消费了："+mt);
			try{
				Thread.sleep((int)(Math.random()*1000));
			}catch(Exception e){}
		}
	}
}