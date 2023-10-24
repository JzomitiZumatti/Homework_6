package phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(new Record("Alex", 1234567890));
        phoneBook.add(new Record("Alex", 2031452876));
        phoneBook.add(new Record("Andrii", 1234567890));
        phoneBook.add(new Record("Sasha", 1234567890));
        phoneBook.add(new Record("Petia", 1234567890));
        phoneBook.add(new Record("Nastia", 1234567890));
        phoneBook.add(new Record("Alex", 9379992));

        System.out.println(phoneBook.find("Alex"));
        System.out.println(phoneBook.findAll("Alex"));
    }
}
