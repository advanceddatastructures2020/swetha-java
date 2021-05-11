class Dogs
{
 String name;
 int age;
public Dogs(String name,int age)
{
this.name=name;
this.age=age;
}

public void getName()
{
System.out.println(name);
}
public void getAge()
{
System.out.println(age);
}

public static void main(String a[])
{ 
 Dogs tuffy = new Dogs("tuffy",5);
 Dogs tuffy1 = new Dogs("tuffy1",8);
 Dogs tuffy2 = new Dogs("tuffy2",45);

 tuffy.getName();
 tuffy.getAge();

 tuffy1.getName();
 tuffy1.getAge();

 tuffy2.getName();
 tuffy2.getAge();

}
}