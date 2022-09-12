 class over 
{   double r=5, l=4, b=6;

  double circle()
   {
    return 3.14*r*r;
   }
   double rectangle()
   {
     return l*b;
   }
  public static void main(String args[])
  {
   over a= new over();
   System.out.println("Area of Circle");
   System.out.println(a.circle());
   System.out.println("Area of Rectangle");
   System.out.println(a.rectangle());
   
}
} 
