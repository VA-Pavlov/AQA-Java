package NumberTwo;

public interface Triangle {
    default double Perimetr(int a,int h){
        return 0.5*a*h;
    }

    default double Ploshad(int a,int b){
        return 2*a+b;
    }
}
