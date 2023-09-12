public class Dog extends Animal{
    static int countOsob;
    public Dog(){
        countOsob++;
    }
    @Override
    void run(int longRun){
        if(longRun<=500)
            System.out.println("Бобик пробежал "+longRun+"м");
        else System.out.println("Слишком большая скорость");
    }
    void swimm(int longSwimm){
        if(longSwimm<=100)
            System.out.println("Бобик проплыл "+longSwimm+"м");
        else System.out.println("Слишком большая скорость");
    }
}
