package CatsEat;

public class Cat extends Animal{

    private static int countCat;
    boolean satiety = false;
    private int valueSatiety;

    public Cat( int valueSatiety) {
        countCat++;
        this.valueSatiety = valueSatiety;
    }
    @Override
    void run(int longRun){
        if( longRun <= 200 )
            System.out.println("����� ��������� " + longRun);
        else System.out.println("������� ������� ��������");
    }
    @Override
    void swimm( int longSwimm ){
        System.out.println("����� �� ����� �������");
    }
    public int getCountCat(){
        return countCat;
    }
    void eat(Tarelka tarelka){
        satiety = tarelka.getFood(valueSatiety)==valueSatiety;
    }

}
