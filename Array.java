//creating collection of user defined objects using Arraylist
import java.util.*;
class student
{
  int id;
  String name;
  String Address;

//default constructor
//  student(){}
//parametarized constructor
  student(int id,String name,String Address)
   {
     this.id=id;
     this.name=name;
    this.Address=Address;
   }
}

class Array
{
public static void main(String[] args)
 {
  List<student>al=new ArrayList<student>();
 student s1= new student(1,"latha","knr");
 student s2=new student(2,"bijja","warangal");
  al.add(s1);
  al.add(s2);
Iterator itr=al.iterator();
  while(itr.hasNext())
{
 student st=(student)itr.next();
  System.out.println("id is "+st.id+"    "+"name is "+st.name+"     "+"addrees is    "+st.Address);
}

 }





}


