import java.util.*;
class student{
int id;
String name;

student(int id,String name)
{
this.id=id;
this.name=name;
}
}
class LLcoll{

public static void main(String[] args)
{
List<student> ll=new LinkedList<student>();
ll.add(new student(1,"latha"));
ll.add(new student(2,"bijja"));
ll.add(new student(1,"mahi"));

ListIterator it=ll.listIterator();
while(it.hasNext())
{
student s=(student)it.next();
System.out.println("id id "+s.id+" "+"name is "+s.name);
}

while(it.hasPrevious())
{
student s2=(student)it.previous();
System.out.println(s2.id +s2.name);
}
for(student s1:ll)
System.out.println("id id "+s1.id+" "+"name is "+s1.name);

}
}

