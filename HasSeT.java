import java.util.*;
class HashSeT{
 public static void main(String[] args)
  {
   Set<Object> s=new HashSet<Object>();
   s.add("g");
   s.add("d");
   s.add("a");
   s.add("z");
   s.add("s");
System.out.println(s.first());
 Iterator<Object> it=s.iterator();
  while(it.hasNext())
  {
   System.out.println(it.next());
  }





 }
}

