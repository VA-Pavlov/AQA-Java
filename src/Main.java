import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Number 1:\n");
        numberOne();

        System.out.println("\nNumber 2:\n");
        Phonebook phonebook = new Phonebook();
        phonebook.add("Pavlov", "+7-956-422-12-34");
        phonebook.add(" Tringina ", "88005553535");
        phonebook.add("Muravleva", "+7-921-434-43-34 ");
        phonebook.add("Pavlov ", "8-9 66-422-32-34");

        System.out.println(phonebook);

        System.out.println();

        System.out.println(phonebook.get("Pavlov"));
    }

    public static void numberOne() {
        String[] words = {
                "apple", "banana", "cherry", "date", "apple",
                "fig", "grape", "banana", "honeydew", "kiwi",
                "lemon", "mango", "date", "orange", "papaya",
                "cherry", "quince", "strawberry", "watermelon", "kiwi"
        };
        HashSet<String> unicWords = new HashSet<String>(List.of(words));
        for (String word : unicWords)
            System.out.println(word);

        HashMap<String, Integer> countWordsInArray = new HashMap<>();

        for (String wordFromHashSet : unicWords) {
            int numberOfWordRepetitions = 0;
            for (String wordFromArray : words) {
                if (wordFromArray.equals(wordFromHashSet)) numberOfWordRepetitions++;
            }
            countWordsInArray.put(wordFromHashSet, numberOfWordRepetitions);
        }

        for (String word : unicWords)
            System.out.println(word + " - " + countWordsInArray.get(word));
    }

}
