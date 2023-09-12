public class Tarelka {
    private int food;
    public int getFood(int valueFood){
        if(food>valueFood&&food>0){
            food-=valueFood;
            return valueFood;
        }
        return food;
    }
    public void addFood(int newFood){
        if(newFood>0)food+=newFood;
    }
}
