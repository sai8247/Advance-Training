
class medicine
{
String companyName;
String address;
medicine(String x,String y)
{
companyName=x;
address=y;
}
public void displayLabel()
{
System.out.println("Company Name:"+companyName);
System.out.println("Address:"+address);
}
}
class tablet extends medicine
{
tablet(String x,String y)
{
super(x,y);
}
public void displayLabel()
{
super.displayLabel();
System.out.println("Store in a cool place");
}
}
class syrup extends medicine
{
syrup(String x,String y)
{
super(x,y);
}
public void displayLabel()
{
super.displayLabel();
System.out.println("Use: As prescribed by the medical practitioner");
}
}
class ointment extends medicine
{
ointment(String x,String y)
{
super(x,y);
}
public void displayLabel()
{
super.displayLabel();
System.out.println("For external use only");
}
}
