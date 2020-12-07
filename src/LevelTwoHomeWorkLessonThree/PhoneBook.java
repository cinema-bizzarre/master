package LevelTwoHomeWorkLessonThree;

import java.util.Set;

public interface PhoneBook {
    void add( String surname, String phoneNumber);
    Set<String> get (String surname);

}
