public class Cat extends Animal{
    static int countOsob;
    boolean sitost = false;
    public Cat(){
        countOsob++;
    }
    void run(int longRun){
        if(longRun<=200)
            System.out.println("����� ��������� "+longRun);
        else System.out.println("������� ������� ��������");
    }
    void eat()

}
