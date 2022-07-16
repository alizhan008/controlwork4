import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Random r = new Random();
        Cat Cat1 = new Cat("Tom", 5, r.nextInt(0, 100), r.nextInt(0, 100), r.nextInt(0, 100));
        Cat Cat2 = new Cat("Jasper", 8, r.nextInt(0, 100), r.nextInt(0, 100), r.nextInt(0, 100));
        Cat Cat3 = new Cat("Black", 10, r.nextInt(0, 100), r.nextInt(0, 100), r.nextInt(0, 100));

        Cat1.satietyLevel(Cat1);
        Cat2.satietyLevel(Cat2);
        Cat3.satietyLevel(Cat3);
        Cat.printCat(Cat1, Cat2, Cat3);


        Scanner s = new Scanner(System.in);
        System.out.println("Чтобы добавить нового кота, введите:");
        System.out.println("Имя:");
        String name = s.nextLine();
        System.out.println("Возраст:");
        int age = s.nextInt();
        Cat Cat4 = new Cat(name, age);
        Cat4.satietyLevel(Cat4);
        Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);





    }

}