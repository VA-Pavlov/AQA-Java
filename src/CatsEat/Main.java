package CatsEat;

public class Main {
    public static void main(String[] args) {
        Cat [] cats = {new Cat(10),new Cat(15),new Cat(5)};
        Tarelka tarelka = new Tarelka();
        tarelka.addFood(20);
        for(int i=0;i<cats.length;i++){
            cats[i].eat(tarelka);
        }
        for (int i=0;i<cats.length;i++){
            if(cats[i].satiety)
                System.out.println("��� "+i+" ���");
            else
                System.out.println("��� "+i+" �������");
        }

        Dog dog = new Dog();
        System.out.println("���-�� ��������: " + dog.getCountAnimal()+"\n���-�� �����: "+cats[0].getCountCat()
        +"\n���-�� �����: "+dog.getCountDog());
    }
}
