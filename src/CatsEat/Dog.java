package CatsEat;

public class Dog extends Animal{
    private static int countDog;
    public Dog(){
        countDog++;
    }
    @Override
    void run(int longRun){
        if(longRun<=500)
            System.out.println("����� �������� "+longRun+"�");
        else System.out.println("������� ������� ��������");
    }
    @Override
    void swimm(int longSwimm){
        if(longSwimm<=100)
            System.out.println("����� ������� "+longSwimm+"�");
        else System.out.println("������� ������� ��������");
    }

    public int getCountDog(){
        return countDog;
    }
}
