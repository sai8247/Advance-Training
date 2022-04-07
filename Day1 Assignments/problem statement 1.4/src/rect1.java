public class rect1
{
private float length;
private float breadth;
rect1()
{
length=1;
breadth=1;
}
public void set(float x,float y)
{
if(x<=0 || x>=20 || y<=0 || y>=20)
{
System.out.println("Length and breath should be > 0 and < 20");
length=1;
breadth=1;
}
else
{
length=x;
breadth=y;
}
}
public float getl()
{
return length;
}
public float getb()
{
return breadth;
} 
public float area()
{
return length*breadth;
}
public float perimeter()
{
return (2*length)+(2*breadth);
} 
}
