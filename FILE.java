import java.io.*;
class FILE
{
 public static void main(String[] args)
{
 try{
      FileReader f=new FileReader("FILE.java");
      FileWriter w=new FileWriter("myprog.txt");
      int i;
       while((i=f.read())!=-1)
        {
         w.write(i);
         System.out.print((char)i);
        }

      f.close();
      w.close();
  
    }
catch(Exception e)
   {
      System.out.println(e);
   }



}
}   
