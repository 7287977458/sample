class superr{

 public void disp()
  {
     System.out.println("this is parent class method");
  }
}

class Super extends superr{

public  void disp()
  {
   super.disp();
   System.out.println("this derived class method");
  }
public static void main(String[] args)
  {
    superr s=new Super();
    s.disp();


  }


}

