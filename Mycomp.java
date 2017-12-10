import java.util.Comparator;
import java.util.TreeSet;
public class Mycomp {
public static void main(String a[]){
TreeSet<String> ts = new TreeSet<String>(new MyCompp());
ts.add("RED");
ts.add("ORANGE");
ts.add("BLUE");
ts.add("GREEN");
System.out.println(ts);
}
}
class MyCompp implements Comparator<String>{
@Override
public int compare(String str1, String str2) {
return str1.compareTo(str2);
}
}
