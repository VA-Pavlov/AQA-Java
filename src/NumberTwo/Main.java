package NumberTwo;

public class Main {
    public static void main(String[] args) {
        Figure treugolnik = new Figure("Red","Black");
        Figure priamougolnik = new Figure("Yellow","Pink");
        Figure circle = new Figure("Black","Black");

        System.out.println( treugolnik.backColor+" "+treugolnik.borderColor+" "+treugolnik.Ploshad(6,6,36)+" "+treugolnik.Perimetr(6,6,36) );
        System.out.println( priamougolnik.backColor+" "+priamougolnik.borderColor+" "+priamougolnik.Ploshad(6, 6)+" "+priamougolnik.Perimetr(6, 6) );
        System.out.println( circle.backColor+" "+circle.borderColor+" "+circle.Ploshad(6)+" "+circle.Perimetr(6) );
    }
}
