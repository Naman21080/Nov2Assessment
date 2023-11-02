import java.util.*;

class Nov2Assessment
{
  public static void main (String[] args){
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    for(String i:cars){
      System.out.println(i);
    }
    System.out.println(cars);
    
    cars.set(3,"Audi");
    System.out.println(cars);
    
   System.out.println(cars.get(0));
   System.out.println(cars.get(3));
   
    System.out.println(cars);

    System.out.println(cars.size());
    System.out.println(cars.contains("BMW"));
    
    System.out.println(cars.isEmpty());
    
    System.out.println(cars.indexOf("Audi"));
  }
}