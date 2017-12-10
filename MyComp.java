import java.util.*;

class MyComp
{

  public static void main(String[] args)
  {
   Set<String>s1=new TreeSet<String>( new COMPP());
  
  s1.add("x");
  s1.add("a");
  s1.add("z");
  s1.add("q");
 System.out.println(s1);

  }

}
class COMPP  implements Comparator<String>
{
 public int compare(String s1,String s2)
 {
  return  s2.compareTo(s1);
 }
}
