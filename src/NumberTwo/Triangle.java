package NumberTwo;

public interface Triangle {
    default double Perimetr(int a,int b,int c){
        return a+b+c;
    }

    default double Ploshad(int a,int b,int c){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
