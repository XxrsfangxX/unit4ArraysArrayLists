import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       System.out.println(names);
       System.out.println(names.size());
       names.set(0, "SPONGE");
       System.out.println(names);
       names.add(3, "Doug");
       for( String value:names){
           System.out.println(value);
        }
       ArrayList<String> name2= new ArrayList<String>(names);
       System.out.println(name2);
       names.remove(0);
       System.out.println(names);
       System.out.println(name2);
       
   }
} 