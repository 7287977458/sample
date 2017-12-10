class MyThread extends Thread{
 public void run()
 {
  for(int i=0;i<5;i++)
  {
   try{
     Thread.sleep(500);
    System.out.println("thread is running"+i);
  }


   catch(Exception e)
   {
    System.out.println(e);
   }
  }
 System.out.println(Thread.currentThread().getName());
}
 

public static void main(String[] args)
{
 MyThread m1=new MyThread();
 MyThread m2=new MyThread();
 MyThread m3=new MyThread();
 
 m1.start();
try{
 m1.join();
 m2.start();
 m3.start();
}
catch(Exception e){
System.out.println(e);
}
m1.setName("latha");
//getting the name of the thread
System.out.println("Thread name is"+m1.getName());

}}
