package NumberTwo;

public interface Circle {

    default double Perimetr(int r){
        return 2 * Math.PI * r;
    }

    default double Ploshad(int r){
        return 2 * Math.PI * Math.pow(r,2);
    }
}
