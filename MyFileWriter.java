import java.io.*;

class MyFileWriter
{
  public static void main(String[] args)
  {
    try{
         FileWriter fw=new FileWriter("lat.txt");
          fw.write("my name is latha.......");
          fw.flush(); 
          fw.close();
       }
    catch(Exception e)
      {
        System.out.println(e);
      }



  }

}
