import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> arrayList = new ArrayList<>();
        arrayList.add(new City(3, "Jalal-Abad"));
        arrayList.add(new City(2, "Osh"));
        arrayList.add(new City(5, "Batken"));
        arrayList.add(new City(4, "Talas"));
        arrayList.add(new City(1, "Chui"));
        TreeSet<City> set = new TreeSet<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getCode() % 2 == 1) {
                set.add(arrayList.get(i));
            }
        }
            for (City city : set) {
                System.out.println(city);


            }

        }
    }
