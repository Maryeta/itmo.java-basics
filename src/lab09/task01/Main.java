package lab09.task01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("Java");
        collection.add("Java");
        collection.add("Cat");
        collection.add("Sun");
        collection.add("Java");
        System.out.println(noDublicate(collection));
        System.out.println(noDublicate2(collection));
    }

    public static Set<String> noDublicate (List<String> collection){
        Set<String> set = new HashSet<>();
        for(String string: collection){
            set.add(string);
        }
        return set;
    }

    public static Set<String> noDublicate2 (List<String> collection){
        return new HashSet<>(collection);
    }
}
