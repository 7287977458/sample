//class comparator using treeset to compare to objects

import java.util.*;
class COMPARATOR
{
public static void main(String[] args)
{
Set<emp>s1=new TreeSet<emp>(new MyName());

s1.add(new emp(1,"latha",20,1000));
s1.add(new emp(2,"bijja",30,3000));

Iterator<emp>it=s1.iterator();
while(it.hasNext())
{
emp e=(emp)it.next();
System.out.println("id is  "+e.id+" "+" name is "+e.name);
}

Set<emp> s2=new TreeSet<emp>(new MySal());
s2.add(new emp(1,"latha",21,10000));
s2.add(new emp(2,"charu",34,1000));
 
Iterator itr=s2.iterator();
while(itr.hasNext())
{
emp E=(emp)itr.next();
System.out.println("id is "+E.id+" "+"salary is "+E.salary);

}
}
}




//class of comparing to objecets by name
class MyName implements Comparator<emp>
{
 
 @Override
 public int compare(emp e1,emp e2)
 {
   return e1.getName().compareTo(e2.getName());
 }

}


//class of comparing to objects by salary
class MySal implements Comparator<emp>
{
  public int compare(emp e1,emp e2)
  {
  if(e1.getSalary()<e2.getSalary())
   return 1;
  else
   return -1;
 
 }



}

//class of employee
class emp{

int id;
String name;
int age;
int salary;

//parametrized constructor
public emp(int id,String name,int age,int salary)
 {
  this.id=id;
  this.name=name;
  this.age=age;
  this.salary=salary;

 }

public void setId(int id)
  {
   this.id=id;
  }
 public int getId()
  { 
  return this.id;
  }

public void setName(String name)
  { 
    this.name=name;
  }
 public String getName()
  {
    return this.name; 
  }
 
public void setAge(int age)
 {
  this.age=age;
 }
 public int getage()
  {
    return this.age;
  }


public void setSalary(int salary)
 {
   this.salary=salary;
 }
 public int getSalary()
  {
   return this.salary;
  }

}
