class Callbval{
int data=50;

void change(Callbval c)
{
c.data=c.data+50;
}
public static void main(String[] args)
{
Callbval c=new Callbval();
System.out.println(c.data);
c.change(c);
System.out.println(c.data);




}









}
