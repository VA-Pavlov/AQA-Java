public class Employee {
    String fullName;
    String jobTitle;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String fullNamem,String jobTitle,String email,String phoneNumber,int salary, int age){
        this.fullName = fullNamem;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void printInformationAboutEmployee(){
        System.out.println(fullName+" "+jobTitle+" "+email+" "+phoneNumber+" "+salary+" "+age);
    }
}
