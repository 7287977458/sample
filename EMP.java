import java.util.*;
class EMP
{
int eid;
String name;
int age;
int salary;
int avg;
int[] marks=new int[5];

Scanner S=new Scanner(System.in);

  public void SetId()
   { 
    System.out.println("enter your id");
    this.eid=S.nextInt();
   }

   public void getId()
   {
    System.out.println("id id:"+eid);
   }

 

   public void SetName()
   {
      System.out.println("enter your name");
      this.name=S.next();
   }
    public void getName()
   {
    System.out.println("name is:"+name);
   }


    public void SetAge()
     {
      System.out.println("enter your age");
      this.age=S.nextInt();
     }
   public void getAge()
   {
    System.out.println("age is:"+age);
   }

  public void SetSalary()
   {
    System.out.println("enter your salary");
    this.salary=S.nextInt();
   }

   public void getSalary()
   {
    System.out.println("salary is:"+salary);
   }

  public void SetMarks()

  {
   System.out.println("enter your marks");

   for(int i=0;i<5;i++)
   {
    this.marks[i]=S.nextInt();
   }
  }
  
  public void getMarks()
  {
    for(int i=0;i<5;i++)
    System.out.println("marks are:"+marks[i]);

  }
 
 public void SetAvg()
  { 
  int sum=0;
  for(int i=0;i<5;i++)
  {
   sum=sum+marks[i];
  }   
  this.avg=sum/5;
 }

public void getAvg()
 {

System.out.println("avg is"+avg);

 }
 
//main method
public static void main(String[] args)
{
 EMP[] e=new EMP[2];
 
 for(int i=0;i<2;i++)
 {
  e[i]=new EMP();
 }

 for(int i=0;i<2;i++)
 {
  e[i].SetId();
  e[i].SetName();
  e[i].SetAge();
  e[i].SetSalary();
  e[i].SetMarks();
  e[i].SetAvg();
 }

 for(int i=0;i<2;i++)
 {
  e[i].getId();
  e[i].getName();
  e[i].getAge();
  e[i].getSalary();
  e[i].getMarks();
  e[i].getAvg();
 }

//Set<EMP>s1=new TreeSet<EMP>(new MyName());


}


}
