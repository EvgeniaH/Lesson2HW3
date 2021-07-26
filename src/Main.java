import java.util.*;

public class Main {
    public static void main(String[] args) {
        SetWords();
        PhoneBook();
    }

    private static void SetWords() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Java", "Man", "Phone", "Book", "Gold", "Robot",
                "Man", "Animal", "Java", "Tea", "Rock", "City",
                "Dog", "One", "List", "Cat", "Java", "Book", "Word"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void PhoneBook() {

        Phonebook phonebook = new Phonebook();

        phonebook.add("Ivanov", "2582218");
        phonebook.add("Ivanov", "4998558");
        phonebook.add("Petrov", "3222551");
        phonebook.add("Petrov", "2558841");
        phonebook.add("Smirnov", "8999991");
        phonebook.add("Sidorov", "2511111");
        phonebook.add("Smirnov", "8992329");
        phonebook.add("Antonov", "8123113");
        phonebook.add("Antonov", "1125234");


        System.out.println("Телефонный справочник");
        System.out.println("Ivanov");
        System.out.println(phonebook.get("Ivanov"));
        System.out.println("Petrov");
        System.out.println(phonebook.get("Petrov"));
        System.out.println("Smirnov");
        System.out.println(phonebook.get("Smirnov"));
        System.out.println("Sidorov");
        System.out.println(phonebook.get("Sidorov"));
        System.out.println("Antonov");
        System.out.println(phonebook.get("Antonov"));
    }
}

class Phonebook {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
}
