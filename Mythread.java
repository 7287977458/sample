//Multi threading example using runnable and Thread

class Mythread  implements Runnable
{
 public void run()
 {
  for(int i=0;i<10;i++)
{
  try{
  Thread.sleep(100);
  System.out.println("thread is running...."+i);
 }
catch(Exception e){ System.out.println(e);}
}
}
 public static void main(String[] args)
 {
  Mythread mt1=new Mythread();
  Mythread mt2=new Mythread();
  Thread t1=new Thread(mt1);
  Thread t2=new Thread(mt2);
  t1.start();
  t2.start();

 }


}
