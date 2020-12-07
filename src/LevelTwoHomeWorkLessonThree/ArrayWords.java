package LevelTwoHomeWorkLessonThree;

import java.util.*;

public class ArrayWords {

    public static void main(String[] args) {

        List<String> array = Arrays.asList("orange", "melon", "kiwi", "lemon", "melon", "apple",
                "orange", "kiwi", "kiwi","grape", "lemon", "banana", "kiwi", "apple", "orange");
        int frequency = Collections.frequency(array, "orange");
        int frequency1 = Collections.frequency(array, "melon");
        int frequency2 = Collections.frequency(array, "lemon");
        int frequency3 = Collections.frequency(array, "apple");
        int frequency4 = Collections.frequency(array, "kiwi");
        int frequency5 = Collections.frequency(array, "banana");
        int frequency6 = Collections.frequency(array, "grape");
        System.out.println("orange:" + frequency +
                ", melon:" + frequency1 +
                ", lemon:" + frequency2 +
                ", apple:" + frequency3+
                ", kiwi:" + frequency4 +
                ", banana:" + frequency5 +
                ", grape:" + frequency6);


        Set<String> set = new HashSet<>();
        set.add("orange");
        set.add("melon");
        set.add("kiwi");
        set.add("lemon");
        set.add("melon");
        set.add("apple");
        set.add("orange");
        set.add("kiwi");
        set.add("kiwi");
        set.add("grape");
        set.add("lemon");
        set.add("banana");
        set.add("kiwi");
        set.add("apple");
        set.add("orange");
        System.out.println(set);



    }
}