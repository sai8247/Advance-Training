 import java.io.*;
	public class Rectangle1
	{
	float len;
	float breadth;
	public Rectangle1()
	{
	len = 0;
	breadth = 0;
	}
	public Rectangle1(float l,float b)
	{
	len = l;
	breadth = b;
	}
	public void setLength(float l)
	{
	len = l;
	}
	public void setBreadth(float b)
	{
	breadth = b;
	}
	public float Area()
	{
	return len*breadth;
	}
	public String display()
	{
	return ("\n Length : "+len+"\t Breadth : "+breadth+"\n Area of Rectangle : "+Area());
	}
	}
	class TestRectangle1
	{
	public static void main(String[] args) 
	throws IOException
	{
	Rectangle1 Rect[] = new Rectangle1[5];
	for (int i=0; i<Rect.length ; i++ )
	{
	Rect[i] = new Rectangle1();
	System.out.println("\n Enter the length and breadth of rectangle["+i+"] : ");
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	String str=b.readLine();
	float f = Float.parseFloat(str);
	Rect[i].setLength(f);
	BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
	String str1=b1.readLine();
	float f1 = Float.parseFloat(str1);
	Rect[i].setBreadth(f1);
	System.out.println("\n RECTANGLE ["+i+"] : "+Rect[i].display());
	//Rect[i].display();
	}
	}
}
