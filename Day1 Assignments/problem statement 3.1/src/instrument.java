abstract class instrument
{
abstract public void play();
}
class piano extends instrument
{
public void play()
{
System.out.println("Piano is playing tan tan tan tan");
}
}
class flute extends instrument
{
public void play()
{
System.out.println("Flute is playing toot toot toot toot");
}
}
class guitar extends instrument
{
public void play()
{
System.out.println("Guitar is playing tin tin tin tin");
}
}
