package lab09.task03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("Tom"), 25);
        map.put(new User("Kate"), 30);
        map.put(new User("Mike"), 10);
        map.put(new User("Maria"), 28);

        System.out.println(score(map));
    }
    public static Integer score(Map<User, Integer> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя игрока: ");
        String name = scanner.next();
        Integer result = null;
        for (Map.Entry<User, Integer> pair: map.entrySet()){
            User key = pair.getKey();
            Integer value = pair.getValue();

            if (key.getName().equals(name)){
                result = value;
            }
        }
        return result;
    }
}
