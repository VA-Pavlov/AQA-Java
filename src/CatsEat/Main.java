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
                System.out.println("кот "+i+" сыт");
            else
                System.out.println("кот "+i+" голоден");
        }

        Dog dog = new Dog();
        System.out.println("Кол-ыо животных: " + dog.getCountAnimal()+"\nКол-во кошек: "+cats[0].getCountCat()
        +"\nКол-во собак: "+dog.getCountDog());
    }
}
