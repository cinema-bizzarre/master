package LevelTwoHomeWorkLessonThree;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TelephoneDirectory implements PhoneBook {

   private final Map<String, Set<String>>  phonesBySurname;

           public TelephoneDirectory(){
               phonesBySurname = new TreeMap<>();

           }
           @Override
        public void add(String surname, String phoneNumber){
               Set<String> phones = getPhones(surname);
               phones.add(phoneNumber);
        }

    @Override
    public Set<String> get(String surname) {
        return getPhones(surname);
    }

    private Set<String> getPhones(String surname){

        return phonesBySurname.computeIfAbsent(surname,key -> new HashSet<>());
    }
}
