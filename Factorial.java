class Factorial{

 int fact(int n)
  {
    int i,fact=1;
   for(i=1;i<=n;i++)
    {
      fact=fact*i;
    }
  return fact;

   }
public static void main(String[] args)
   {
     System.out.println(new Factorial().fact(7));
   }
}
