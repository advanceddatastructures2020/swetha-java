class Methodoverloading
{
 void sum (int a, int b)
 {
  System.out.println("sum is "+(a+b)) ;
 }
 void sum (float a, float b)
 {
  System.out.println("sum is "+(a+b));
 }
 public static void main (String a[])
 {
  Methodoverloading cal = new Methodoverloading();
   cal.sum(8,5); 
   cal.sum(4.6f, 3.8f);
 }
}