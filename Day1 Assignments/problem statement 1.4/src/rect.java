
public class rect
{
public static void main(String[] args)
{
rect1 r1=new rect1();
rect1 r2=new rect1();
r1.set(9,3);
System.out.println("Length of r1 ="+r1.getl());
System.out.println("Breadth of r1="+r1.getb());
System.out.println("Area of r1 ="+r1.area());
System.out.println("Perimeter of r1="+r1.perimeter());
System.out.println();
r2.set(23,3);
System.out.println("Length of r2 ="+r2.getl());
System.out.println("Breadth of r2="+r2.getb());
System.out.println("Area of r2 ="+r2.area());
System.out.println("Perimeter of r2="+r2.perimeter());
}
}