import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Thanos {
    public static void main(String[] args) {
     List<Hero> heroes = new ArrayList<>();
     heroes.add(new Hero("Hulk", 49));
     heroes.add(new Hero("Black Widow", 34));
     heroes.add(new Hero("Captain America", 100));
     heroes.add(new Hero("Thor", 1501));

     // Modify Hero to implements Comparable and sort by name (ascending)

     System.out.println("BEFORE SORT-----");
     showList(heroes);

     // Comparable here
     System.out.println();
     System.out.println("After SORT BY NAME-----");
     Collections.sort(heroes);
     showList(heroes);


     // Add a Comparator and sort by age (descending)
     // Sort the list using our ComparatorByAge
   
     System.out.println();
     System.out.println("After SORT BY AGE-----descending order");
     heroes.sort(new ComparatorByAge());
     showList(heroes);
    
    }
  

   private static void showList(List<Hero> heroes) {
      for (Hero heroe : heroes) {
       System.out.println(heroe.getName() + ", " + heroe.getAge());
      }
    }

    
    static class ComparatorByAge implements Comparator<Hero> {
      @Override
      public int compare(Hero ideal1, Hero ideal2) {
          // Compare Heroes by their age.
          if (ideal1.getAge() < ideal2.getAge()) return 1;
          if (ideal1.getAge() > ideal2.getAge()) return -1;
          return 0;
      }
    }
}