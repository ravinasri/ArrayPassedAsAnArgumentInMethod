abstract class Names
{
 abstract void names();
 public void namesList(String[] names)
 {
	
	 for(String name:names)
	 {
		 System.out.println(name);
	 }
	 
 }
}

class NamesList extends Names
{
	void names()
{
System.out.println("name");
}

static String[] names = {"Ravina","vikram"};
public static void main(String args[])
{
 
NamesList ns = new NamesList();
ns.names();
ns.namesList(names);
}
}
