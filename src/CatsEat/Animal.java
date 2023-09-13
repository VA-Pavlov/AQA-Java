package CatsEat;

public abstract  class Animal {
     private static int countAnimal;
     abstract void run(int longRun);
     abstract void swimm(int longSwimm);

     public Animal(){
          countAnimal++;
     }
     public int getCountAnimal(){
          return countAnimal;
     }
}
