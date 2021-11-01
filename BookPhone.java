package lesson4;
import java.util.*;

public class BookPhone {
    public static void main(String args[]) {

            Book pb = new Book();

            pb.add("Иванов", "87854231596");
            pb.add("Смирнов", "854215963542");
            pb.add("Попов", "81142596653");
            pb.add("Иванов", "811235426523");
            pb.add("Гагарин", "815854968752");
            pb.add("Смирнов", "822536854759");
            pb.add("Иванов", "852425325666");

            System.out.println("Иванов " + pb.get("Иванов"));
            System.out.println("Гагарин " + pb.get("Гагарин"));
            System.out.println("Смирнов " + pb.get("Смирнов"));
            System.out.println("Попов " + pb.get("Попов"));
        }

    static class Book {
        private Map<String, List<String>> mapBook = new HashMap<>();
        private List<String> phoneNumber;

        public void add(String lastName, String phone_number) {
            if (mapBook.containsKey(lastName)) {
                phoneNumber = mapBook.get(lastName);
                phoneNumber.add(phone_number);
                mapBook.put(lastName, phoneNumber);
            } else {
                phoneNumber = new ArrayList<>();
                phoneNumber.add(phone_number);
                mapBook.put(lastName, phoneNumber);
            }
        }
        public List<String> get(String lastName) {
            return mapBook.get(lastName);
        }
    }
}
