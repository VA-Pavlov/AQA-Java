import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {
    private HashMap<String, String> phonebook = new HashMap<String, String>();

    public void add(String firstName, String pfoneNumber) {
        String correctPhoneNumber = pfoneNumber.replaceAll("[^0-9]", "");
        phonebook.put(correctPhoneNumber, firstName.trim());
    }

    public Phonebook get(String firstName) {
        Phonebook phonebook = new Phonebook();

        Set<String> numbers = this.phonebook.keySet();
        for (String number : numbers) {
            if (firstName.equals(this.phonebook.get(number)))
                phonebook.add(firstName, number);
        }
        return phonebook;
    }

    @Override
    public String toString() {
        String returnString = "";
        Set<String> numbers = phonebook.keySet();
        for (String number : numbers) {
            returnString += phonebook.get(number) + " - " + number + "\n";
        }
        return returnString;
    }
}
