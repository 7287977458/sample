import java.util.*;
class Test
 {
  int id;
  String name;
 Test(){}
 
 Test(int id,String name)
 {
  this.id=id;
  this.name=name;
 }
}
class CollArray
{
 public static void main(String[] args)
  {
   List<Object>l=new ArrayList<Object>();
   l.add(1);
   l.add(2);
   l.add(3);
   l.add(1);
  System.out.println(l);
  List<String>l1= new ArrayList<String>();
//  l1.add("latha");
  //l1.add("bijja");
//  System.out.println(l1);
 // l.addAll(l1);
 // System.out.println(l);
 
 ListIterator<Number>it=l.listIterator();
  while(it.hasNext())
  {
  System.out.println(it.next()); 
  } 

 while(it.hasPrevious())
  {
   System.out.println(it.previous);
  } 
 }
} 
  
