class Table{
 
 public synchronized void dispN()
{
// for perfect nos between nos 1 to 100
for( int i=1;i<100;i++)
 {
  int  sum=0;
  for(int j=1;j<i;j++)
  {
   if(i%j==0)
   sum=sum+j;
  }
  if(sum==i)
   System.out.println("perfect no is"+i);
 }

}

public synchronized void dispC()
{
//for primenos between 1 to 100
/*int i,j;
for( i=2;i<100;i++)
 {
  for( j=2;j<i;j++)
  {
   if(i%j==0)
   break;
  }
  if(i==j)
   System.out.println("prime no is"+j);
 }*/

//for even and odd
int i,j;
for(i=2;i<=100;i+=2)
{
System.out.println("even no is"+i);
}

}
}
//class which extends thread class
class ex1 extends Thread
{
 Table t;
ex1(Table t)
{
this.t=t;
}
public void run()
{
  t.dispN();
//  t.dispC();
}

}
class ex2 extends Thread{
Table t;
ex2(Table t)
{
this.t=t;
}
public void run()
{
 t.dispC();
}



}




//class for creating threads
class MySync
{

public static void main(String[] args)
{

Table tb=new Table();

ex1 e=new ex1(tb);
ex2 e1=new ex2(tb);
e.start();
e1.start();


}

}
