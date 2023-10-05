public class Main {
    public static void main(String[] args) {
        Box<Orange> boxWithOrangeOne = new <Orange>Box();
        makeOrangeBox(5, boxWithOrangeOne);

        Box<Orange> boxWithOrangeTwo = new <Orange>Box();
        makeOrangeBox(5, boxWithOrangeOne);

        Box<Apple> boxWithAppleOne = new Box();
        makeAppleBox(4, boxWithAppleOne);

        Box<Apple> boxWithAppleTwo = new Box();
        makeAppleBox(5, boxWithAppleTwo);

        System.out.println(boxWithAppleOne.compare(boxWithOrangeOne));
        System.out.println(boxWithOrangeOne.compare(boxWithOrangeTwo));

        boxWithAppleOne.sprinkle(boxWithAppleTwo);
        System.out.println(boxWithAppleOne.getWeight()+" "+ boxWithAppleTwo.getWeight());

    }

    static void makeOrangeBox(int count, Box<Orange> box) {

        for (int i = 0; i < count; i++) {
            box.addFruit(new Orange());
        }
    }

    static void makeAppleBox(int count, Box<Apple> box) {

        for (int i = 0; i < count; i++) {
            box.addFruit(new Apple());
        }
    }
}
