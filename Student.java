class Student
{
int id;
String name;


Student()
   {
     System.out.println("this is default constructor");
   }
Student(int id,String name)
  {
   this.id=id;
   this.name=name;
   System.out.println("this is parameterized constructor");
  }
Student(Student s)
  {
   this.id=s.id;
   this.name=s.name;
   System.out.println("this is copy constructor");

  }
public static void main(String[] args)
{
  Student s=new Student();
  Student s1=new Student(1,"latha");
  Student s2=new Student(s1);
  
}













}
