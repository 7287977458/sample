import java.util.*;
class treeset
{
public static void main(String[] args)
{
List<Object> li=new ArrayList<Object>();
li.add(1);
li.add(2);
li.add(3);
String[] strarr={"latha","bijja", "latha","mahi","laxman"};
//li.add(null);
//li.add("latha");
//li.add("bijja");
System.out.println("list is "+li);
List<String>s=Arrays.asList(strarr);
System.out.println(s);
Set<String> t=new TreeSet<String>(s);
System.out.println(t);

ListIterator<Object>it=li.listIterator();
System.out.println("iterating forward to backward");
while(it.hasNext())
{
System.out.println(it.next());
}
System.out.println("iterator list into backward to forward");
while(it.hasPrevious())
{
System.out.println(it.previous());
}

System.out.println("checking how many duplicate entryset are there in sting array");
for(String str:strarr)
{
 if(!(t.add(str)))
 System.out.println("duplicate entreis are"+str);
}



}




}
