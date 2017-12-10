class MyThreaD extends Thread{
public void run()
{
System.out.println("child thread is running"+Thread.currentThread().getName());
System.out.println("priority of thread is"+Thread.currentThread().getPriority());
System.out.println("Daemon "+Thread.currentThread().isDaemon());
}


public static void main(String[] args)
{

MyThreaD d1=new MyThreaD();
MyThreaD d2=new MyThreaD();
 
d1.setPriority(MIN_PRIORITY);
d2.setPriority(MAX_PRIORITY);
d1.setDaemon(true);

d1.start();
d2.start();
//d2.setDaemon(true); //will throw illegalException in main thread



}








}
