import java.io.*;
class Aa
{
//taking input from keyboard using console.

/* public static void main(String[] args)
  {
    Console c=System.console();
    System.out.println("enter your name");
    String name=c.readLine();
   System.out.println("Welcome "+name);
  }
}*/

//taking the input from keyboard using Bufferred reader
public static void main(String[] args)
{
try{
// InputStreamReader fin=new InputStreamReader(System.in);
 //OutputStreamWriter fout=new OutputStreamWriter("a.txt");

 BufferedReader br=new BufferedReader(new FileReader("Aa.java"));
 BufferedWriter bw=new BufferedWriter(new FileWriter("aaa.txt"));
 
 System.out.println("enter your name");
// String name=br.readLine();
  int i;
  while((i=br.read())!=-1)
  {
    bw.write(i);
  }
     // System.out.println("Welcome "+name);
   bw.close();
   br.close();
  }
 catch(Exception e)
 {
  System.out.println(e);
 }
}







}


