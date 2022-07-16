import java.util.Random;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Random r = new Random();
        Cat Tom = new Cat("Tom",5, r.nextInt(0,100),r.nextInt(0,100),r.nextInt(0,100));
        Cat Jasper = new Cat("Jasper",8, r.nextInt(0,100),r.nextInt(0,100),r.nextInt(0,100));
        Cat Black = new Cat("Black",10, r.nextInt(0,100),r.nextInt(0,100),r.nextInt(0,100));

        Tom.satietyLevel(Tom);
        Jasper.satietyLevel(Jasper);
        Black.satietyLevel(Black);
        Cat.printCat(Tom,Jasper,Black);



    }
}