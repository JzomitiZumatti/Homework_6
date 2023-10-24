import java.util.*;

public class Solution {

    private String name;
    private int occurrence;

    public Solution(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    public Solution() {
    }

    public int countOccurance(List<String> list, String string) {
        int counter = 0;
        for (String elementOfList : list) {
            if (elementOfList.equals(string)) {
                counter++;
            }
        }
        return counter;
    }

    public <E> List<E> toList(E[] array) {
        return Arrays.asList(array);
    }

    public List<Integer> findUnique(List<Integer> list) {
        Collections.sort(list);
        Integer currentElement = list.get(0);
        Iterator<Integer> iterator = list.iterator();
        iterator.next();

        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element.equals(currentElement)) {
                iterator.remove();
            } else {
                currentElement = element;
            }
        }
        return list;
    }

    public void calcOccurance(List<String> list) {
        Collections.sort(list);
        String currentElement = list.get(0);
        int counter = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(currentElement)) {
                counter++;
            } else {
                System.out.println(currentElement + ": " + counter);
                currentElement = list.get(i);
                counter = 1;
            }
        }
        System.out.println(currentElement + ": " + counter);
    }

    public List<Solution> findOccurance(List<String> list) {
        List<Solution> occurrences = new ArrayList<>();

        for (String elementOfList : list) {
            boolean found = false;
            for (Solution occurrence : occurrences) {
                if (occurrence.name.equals(elementOfList)) {
                    occurrence.occurrence++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                occurrences.add(new Solution(elementOfList, 1));
            }
        }

        return occurrences;
    }

    @Override
    public String toString() {
        return "{" +
                "name: \"" + name + "\"" +
                ", occurrence: " + occurrence +
                '}';
    }
}
