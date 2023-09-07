public class Main {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer","ivivan@mailbox.com", "892312312", 100000, 69);
        persArray[1] = new Employee("Sergay Serg", "Tester","sargay@mailbox.com", "885312312", 60000, 20);
        persArray[2] = new Employee("Petrov Petr", "Disiner","pp@mailbox.com", "892389312", 50000, 70);
        persArray[3] = new Employee("Zvig Ivan", "DateEng","ivivan@mailbox.com", "896712312", 70000, 35);
        persArray[4] = new Employee("Ivanov Martin", "QA-Engineer","marti@mailbox.com", "892312562", 50000, 80);

        for(int i=0;i<persArray.length;i++){
            if(persArray[i].age>40) persArray[i].printInformationAboutEmployee();
        }
    }
}
