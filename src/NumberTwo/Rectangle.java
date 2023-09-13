package NumberTwo;

public interface Rectangle {
    default double Perimetr(int a,int b){
        return a*2+b*2;
    }

    default double Ploshad(int a,int b){
        return a*b;
    }
}
