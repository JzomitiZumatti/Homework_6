package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Record> contacts = new ArrayList<>();

    public void add(Record record) {
        contacts.add(record);
    }

    public Record find(String searchingName) {
        int indexOfSearchingName = -1;
        for (Record record : contacts) {
            if (record.getName().equals(searchingName)) {
                indexOfSearchingName = contacts.indexOf(record);
                break;
            }
        }
        return indexOfSearchingName != -1 ? contacts.get(indexOfSearchingName) : null;
    }

    public List<Record> findAll(String searchingName) {
        List<Record> allOccureance = new ArrayList<>();
        for (Record record : contacts) {
            if (record.getName().equals(searchingName)) {
                allOccureance.add(record);
            }
        }
        return !allOccureance.isEmpty() ? allOccureance : null;
    }
}
