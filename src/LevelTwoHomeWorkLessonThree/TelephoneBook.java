package LevelTwoHomeWorkLessonThree;

import java.util.Set;

public class TelephoneBook {

    public static void main (String[] args){
        TelephoneDirectory book = new TelephoneDirectory();
        book.add("Ким", " 385-94-82");
        book.add( " Иванов", "298-58-39");
        book.add("Петров", "485-93-45");
        book.add("Иванов", "593-83-58");
        book.add("Ким", "489-29-59");
        book.add("Голикова", "583-85-38");
        book.add("Сидоров","384-28-63");

        Set<String> phones = book.add(surname);
        System.out.println("%s:%s%n", surname,phoneNumber);

        }
    }

