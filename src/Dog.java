public class Dog extends Animal{
    static int countOsob;
    public Dog(){
        countOsob++;
    }
    @Override
    void run(int longRun){
        if(longRun<=500)
            System.out.println("����� �������� "+longRun+"�");
        else System.out.println("������� ������� ��������");
    }
    void swimm(int longSwimm){
        if(longSwimm<=100)
            System.out.println("����� ������� "+longSwimm+"�");
        else System.out.println("������� ������� ��������");
    }
}
