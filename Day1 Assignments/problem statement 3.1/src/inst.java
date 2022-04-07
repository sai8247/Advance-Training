public class inst
{
public static void main(String [] args)
{
instrument ins[]=new instrument[10];
for(int i=0;i<10;i++)
{
if(i==1 || i==5 || i==9)
ins[i]=new piano();
else if(i==3 || i==4 || i==7)
ins[i]=new flute();
else
ins[i]=new guitar();
ins[i].play();
if(ins[i] instanceof piano)
System.out.println("InstanceOf Piano");
else if(ins[i] instanceof flute)
System.out.println("InstanceOf Flute");
else
System.out.println("InstanceOf Guitar");
System.out.println();
}
}
}
