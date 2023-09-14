package NumberTwo;

public class Figure implements Circle,Triangle,Rectangle{
     String backColor;
     String borderColor;

     public Figure(String backColor,  String borderColor){
         this.backColor = backColor;
         this.borderColor = borderColor;
     }
}
