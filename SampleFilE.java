//import java.io.FileWriter;

import java.io.FileReader;

class SampleFilE
{ 
 public static void main(String[] args)
  {
   FileReader fr=new FileReader("SampleFilE.java");
  // FileWriter fw=new FileWriter("myprogram.txt");
   int i;
   while((i=fr.read())!=-1)
   {
    System.out.print((char)i);
   }
  // fw.close();
   fr.close();




  }

}
