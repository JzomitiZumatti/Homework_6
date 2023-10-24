import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Solution solution = new Solution();

        //First method test
        List<String> inputWords = new ArrayList<>();
        inputWords.add("bird");
        inputWords.add("fox");
        inputWords.add("bird");
        inputWords.add("cat");
        inputWords.add("cat");
        inputWords.add("cat");
        inputWords.add("frog");
        inputWords.add("bird");
        inputWords.add("dog");
        inputWords.add("scorpion");
        inputWords.add("fox");
        inputWords.add("scorpion");
        inputWords.add("scorpion");
        inputWords.add("scorpion");
        inputWords.add("bird");
        inputWords.add("cat");
        inputWords.add("fox");
        inputWords.add("cat");
        inputWords.add("fox");

        /*System.out.println("Enter random words in quantity from 10 to 20.");
        inputWords.addAll(Arrays.asList(scanner.nextLine().split("\\s")));
        System.out.print("Enter the word, which you want to search int list and count occurrence: ");
        String searchingWord = scanner.nextLine();*/

        String searchingWord = "bird";

        System.out.println(inputWords);
        System.out.printf("Method countOccurance:\nYour word %s has %d occurrence", searchingWord,
                solution.countOccurance(inputWords, searchingWord));

        //Second method test
        /*System.out.println("Enter the length of array:");
        int arrayLength = scanner.nextInt();
        Integer[] numbers = new Integer[arrayLength];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(5) + 1;
        }*/
        Integer[] numbers = new Integer[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(5) + 1;
        }
        System.out.println("\n\nArray " + Arrays.toString(numbers));
        System.out.println("Method toList:\nList " + solution.toList(numbers));

        //Third method test
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            randomNumbers.add(random.nextInt(5) + 1);
        }

        System.out.println("\nList " + randomNumbers);
        System.out.println("Method findUnique:\nUnique list " + solution.findUnique(randomNumbers));

        //Fourth method test
        System.out.println("\nList " + inputWords);
        System.out.println("Method calcOccurance:");
        solution.calcOccurance(inputWords);

        //Fifth method test
        System.out.println("\nList " + inputWords);
        Solution occurrence = new Solution("", 0);
        List<Solution> occurrencess = occurrence.findOccurance(inputWords);
        System.out.println("Method findOccurance:");
        for (Solution item : occurrencess) {
            System.out.println(item.toString());
        }
    }
}
