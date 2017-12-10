import java.io.*;
class FILE
{
 public static void main(String[] args)
{
 FileReader f=new FIleReader("FILE.java");
 FileWriter w=new FileWriter("myprog.txt");
 int i;
while((i=fr.read())!=-1)
 {
  fr.write((char)i);
 }
 
} 
}
