public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }
    public static void checkSumSign(){
        int a=7;
        int b=-10;
        System.out.println(a+b>=0?"����� �������������":"����� �������������");
    }

    public static void  printColor(){
        int value = 101;
        if (value<=0) System.out.println("�������");
        else if(value>0&&value<=100) System.out.println("������");
        else System.out.println("�������");
    }

    public static void compareNumbers(){
        int a=7;
        int b=8;
        System.out.println(a>=b?"a >= b":"a < b");
    }
}
