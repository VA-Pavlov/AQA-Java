public class Cat extends Animal{
    static int countOsob;
    boolean sitost = false;
    public Cat(){
        countOsob++;
    }
    void run(int longRun){
        if(longRun<=200)
            System.out.println("Мурка пробежала "+longRun);
        else System.out.println("Слишком большая скорость");
    }
    void eat()

}
