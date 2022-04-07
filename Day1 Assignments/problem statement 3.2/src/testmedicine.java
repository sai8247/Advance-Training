import java.util.Random;

public class testmedicine
{
public static void main(String [] args)
{
medicine med[]=new medicine[10];
Random rnd=new Random();
int num=0;
for(int i=0;i<10;i++)
{
num=rnd.nextInt(3);
if(num==0)
med[i]=new tablet("Tech Pharmaceuticals","Pune");
else if(num==1)
med[i]=new syrup("Mahindra Pharmaceuticals","Banglore");
else 
med[i]=new ointment("MBT Pharmaceuticals","Mumbai");
med[i].displayLabel();
System.out.println();
}
}
}