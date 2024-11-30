import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Automobil> automobilSet = new HashSet<>();

        automobilSet.add(new Automobil(2013, "BMW"));
        automobilSet.add(new Automobil(2022, "Audi"));
        automobilSet.add(new Automobil(2020, "Mercedes"));
        automobilSet.add(new Automobil(2007, "Ford"));

        System.out.println("Inainte de sortare:");
        for (Automobil automobil : automobilSet) {
            System.out.println(automobil);
        }
        List<Automobil> automobilList = new ArrayList<>(automobilSet);
        Collections.sort(automobilList);
        System.out.println("\nDupa sortare:");
        for (Automobil automobil : automobilList) {
            System.out.println(automobil);
        }

        Set<Automobil> automobilTreeSet = new TreeSet();
        automobilTreeSet.add(new Automobil(2013, "BMW"));
        automobilTreeSet.add(new Automobil(2022, "Audi"));
        automobilTreeSet.add(new Automobil(2020, "Mercedes"));
        automobilTreeSet.add(new Automobil(2007, "Ford"));

        System.out.println("Tree Set:");
        for (Automobil automobil : automobilTreeSet) {
            System.out.println(automobil);
        }
    }
}
