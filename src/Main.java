import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(myLiambda.forIntCoolections.metod(createRandomIntArraList()));
        System.out.println("____________________________");
        ArrayList<String> words = new ArrayList<>();
        words.add("Highload");
        words.add("High");
        words.add("Load");
        words.add("Highload");
        System.out.println(myLiambda.countHigh.metod(words));
        System.out.println(myLiambda.firstElement.metod(words));
        System.out.println(myLiambda.lastElement.metod(words));
        System.out.println("__________________________");
        words.clear();
        words.add("f10");
        words.add("f15");
        words.add("f2");
        words.add("f4");
        words.add("f4");
        String [] arraString = myLiambda.sortStrings.metod(words).split(" ");
        for(String word : words) System.out.print(word+" ");
        System.out.println("__________________________");

    }

    private static ArrayList<Integer> createRandomIntArraList() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int size = random.nextInt(10);
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(100);
            list.add(randomNumber);
        }
        System.out.println(list);
        return list;

    }
}

class myLiambda {
    static ForIntCoolections forIntCoolections = (ArrayList<Integer> array) -> {
        int countChetn = 0;
        for (int value : array)
            if (value % 2 == 0) countChetn++;
        return countChetn;
    };
    static ForStringCollections countHigh = (ArrayList<String> words) -> {
        int count = 0;
        for (String value : words)
            if (value.equals("High")) count++;
        return "" + count;
    };
    static ForStringCollections firstElement = (ArrayList<String> words) -> {
        return words.size() != 0 ? words.get(0) : "0";
    };
    static ForStringCollections lastElement = (ArrayList<String> words) -> {
        return words.size() != 0 ? words.get(words.size() - 1) : "0";
    };
    static ForStringCollections sortStrings = (ArrayList<String> words) -> {
        Collections.sort(words);
        String line="";
        for(String word : words)
            line+=word+" ";
        return line.trim();
    };
//    static ForMan averageAgeOfMen = (StudentsGroup studentsGroup) -> {
//
//    };
}
