public class Main {
    public static void main(String[] args) {

    }

    public static boolean metodOne(int one,int two){
        return 10<=(one+two) && (one+two)<=20;
    }

    public static String metodTwo(int value){
        return  value>=0?"Число положительное":"Число отрицательное";
    }

    public static boolean metodTree(int value){
        return value<0;
    }

    public static void metodFour(String line, int value){
        for(int i=0;i<value;i++) System.out.println(line);
    }
    public static boolean metodFive(int year){
        if(year%400==0) return true;
        if(year%100==0) return false;
        if(year%4==0) return true;
        return false;
    }
    public static void metodSix(){
        int[] array = {1,0,1,0,1,0,1,0};
        for(int i=0;i<array.length;i++)
            array[i]=array[i]==0?1:0;
        printArray(array);
    }

    public static void metodSeven(){
        int[ ] array = new int[100];
        for(int i=0;i<100;i++) array[i]=i+1;
        printArray(array);
    }
    public static void metodEight(){
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1} ;
        for(int i=0;i<array.length;i++)
            if(array[i]<6)array[i]*=2;
        printArray(array);
    }

    public static void metodNine(){
        int [][] array = new int[9][9];
        for(int row=0;row<array.length;row++)
            for(int column=0;column<array[0].length;column++)
                if(column==row || column==array[0].length-row-1) array[row][column]=1;
        printArray(array);
    }
    public static int[] metodTen(int len, int initialValue){
        int array[] = new int[len];
        for(int i=0;i<array.length;i++)array[i]=initialValue;
        return  array;
    }

    private static void printArray(int array[]){
        System.out.println();
        for(int i=0;i<array.length;i++) System.out.print(array[i]+" ");
    }
    private static void printArray(int array[][]) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++)
                System.out.print(array[row][column] + " ");
            System.out.println();
        }
    }

}
