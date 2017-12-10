import java.util.Scanner;

class student
{
int id;
String name;
int age;
int avg;
int[] marks=new int[5];

 Scanner S=new Scanner(System.in);



void SetData()
{
   System.out.println("enter your id");
   this.id=S.nextInt();

   System.out.println("enter your name");
   this.name=S.next();

   System.out.println("enter your age");
   this.age=S.nextInt();

   System.out.println("enter marks of five subjects");
   for(int i=0;i<5;i++)
   {
    this.marks[i]=S.nextInt();
   }

     System.out.println("");
 }

 void avg()
 {
   int sum=0;
   for(int i=0;i<5;i++)
   {
    sum=sum+marks[i];
   }
   this.avg=sum/5;
  
 }


void GetData()
  {
   System.out.println("id is:"+this.id);
   System.out.println("name is:"+this.name);
   System.out.println("age is:"+this.age);

   System.out.println("marks are");
   for(int i=0;i<5;i++)
   {
    System.out.println("marks of "+i+" is:"+marks[i]);
   }
   System.out.println("avg marks are"+avg);

   System.out.println(" ");
  } 

public static void main(String[] args)
{
   student[] s=new student[5];
   for(int i=0;i<5;i++)
   {
    s[i]=new student();
   }
   
   for(int i=0;i<5;i++)
   {
    s[i].SetData();
    s[i].avg();
   }
  
  for(int i=0;i<5;i++)
  {
   System.out.println("object of array: "+i);
   s[i].GetData();
   
   }
  


}




}
