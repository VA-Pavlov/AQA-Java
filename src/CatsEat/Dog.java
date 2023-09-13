package CatsEat;

public class Dog extends Animal{
    private static int countDog;
    public Dog(){
        countDog++;
    }
    @Override
    void run(int longRun){
        if(longRun<=500)
            System.out.println("Бобик пробежал "+longRun+"м");
        else System.out.println("Слишком большая скорость");
    }
    @Override
    void swimm(int longSwimm){
        if(longSwimm<=100)
            System.out.println("Бобик проплыл "+longSwimm+"м");
        else System.out.println("Слишком большая скорость");
    }

    public int getCountDog(){
        return countDog;
    }
}
