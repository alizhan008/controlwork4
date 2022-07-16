import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Random r = new Random();
        Cat Cat1 = new Cat("Tom", 5, r.nextInt(0, 101), r.nextInt(0, 101), r.nextInt(0, 101));
        Cat Cat2 = new Cat("Jasper", 8, r.nextInt(0, 101), r.nextInt(0, 101), r.nextInt(0, 101));
        Cat Cat3 = new Cat("Black", 10, r.nextInt(0, 101), r.nextInt(0, 101), r.nextInt(0, 101));

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

        Scanner scn = new Scanner(System.in);
        System.out.printf("Выберите действие:%n 1: Кормить%n 2: Поиграть%n 3: К ветеринару%n :");
        switch (scn.nextInt()) {
            case 1:
                System.out.println("Кормить кота");
                System.out.print("Выберите какого хотите покормить (1-4): ");
                Scanner sc = new Scanner(System.in);
                switch (sc.nextInt()) {
                    case 1:
                        if (Cat1.getAge() <= 5){
                            Cat1.setSatietyLevel(7);
                            Cat1.setMoodLevel(7);
                        }
                        if (Cat1.getAge() >= 6 && Cat1.getAge() <= 10){
                            Cat1.setSatietyLevel(5);
                            Cat1.setMoodLevel(5);
                        }
                        if (Cat1.getAge() >= 11){
                            Cat1.setSatietyLevel(4);
                            Cat1.setMoodLevel(4);
                        }

                        Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);
                        System.out.printf("Вы покормили кота: %s%n", Cat1.getName());
                        break;
                    case 2:
                        if (Cat1.getAge() <= 5){
                            Cat1.setSatietyLevel(7);
                            Cat1.setMoodLevel(7);
                        }
                        if (Cat1.getAge() >= 6 && Cat1.getAge() <= 10){
                            Cat1.setSatietyLevel(5);
                            Cat1.setMoodLevel(5);
                        }
                        if (Cat1.getAge() >= 11){
                            Cat1.setSatietyLevel(+4);
                            Cat1.setMoodLevel(+4);
                        }
                        Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);
                        System.out.printf("Вы покормили кота: %s%n", Cat2.getName());
                        break;
                    case 3:
                        if (Cat1.getAge() <= 5){
                            Cat1.setSatietyLevel(7);
                            Cat1.setMoodLevel(7);
                        }
                        if (Cat1.getAge() >= 6 && Cat1.getAge() <= 10){
                            Cat1.setSatietyLevel(5);
                            Cat1.setMoodLevel(5);
                        }
                        if (Cat1.getAge() >= 11){
                            Cat1.setSatietyLevel(+4);
                            Cat1.setMoodLevel(+4);
                        }
                        Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);
                        System.out.printf("Вы покормили кота: %s%n", Cat3.getName());
                        break;
                    case 4:
                        if (Cat1.getAge() <= 5){
                            Cat1.setSatietyLevel(7);
                            Cat1.setMoodLevel(7);
                        }
                        if (Cat1.getAge() >= 6 && Cat1.getAge() <= 10){
                            Cat1.setSatietyLevel(5);
                            Cat1.setMoodLevel(5);
                        }
                        if (Cat1.getAge() >= 11){
                            Cat1.setSatietyLevel(+4);
                            Cat1.setMoodLevel(+4);
                        }
                        Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);
                        System.out.printf("Вы покормили кота: %s%n", Cat4.getName());
                    default:
                        System.out.println("Вы не выбрали кота!");
                }
                break;
            case 2:
                System.out.println("Играть с котом");
                System.out.print("Выберите с кем хотите поиграть (1-4): ");
                Scanner scr = new Scanner(System.in);
                switch (scr.nextInt()) {
                    case 1:
                        if (Cat1.getAge() <= 5){
                            Cat1.setMoodLevel(7);
                            Cat1.setHealthLevel(7);
                            Cat1.setSatietyLevel1(3);
                        }
                        if (Cat1.getAge() >= 6 && Cat1.getAge() <= 10){
                            Cat1.setMoodLevel(5);
                            Cat1.setHealthLevel(5);
                            Cat1.setSatietyLevel1(3);
                        }
                        if (Cat1.getAge() >= 11){
                            Cat1.setMoodLevel(4);
                            Cat1.setHealthLevel(4);
                            Cat1.setSatietyLevel1(3);
                        }
                        Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);
                        System.out.printf("Вы поиграли с котом: %s%n", Cat1.getName());
                        break;
                    case 2:
                        if (Cat1.getAge() <= 5){
                            Cat1.setMoodLevel(7);
                            Cat1.setHealthLevel(7);
                            Cat1.setSatietyLevel1(3);
                        }
                        if (Cat1.getAge() >= 6 && Cat1.getAge() <= 10){
                            Cat1.setMoodLevel(5);
                            Cat1.setHealthLevel(5);
                            Cat1.setSatietyLevel1(3);
                        }
                        if (Cat1.getAge() >= 11){
                            Cat1.setMoodLevel(4);
                            Cat1.setHealthLevel(4);
                            Cat1.setSatietyLevel1(3);
                        }
                        Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);
                        System.out.printf("Вы поиграли с котом: %s%n", Cat2.getName());
                        break;
                    case 3:
                        if (Cat1.getAge() <= 5){
                            Cat1.setMoodLevel(7);
                            Cat1.setHealthLevel(7);
                            Cat1.setSatietyLevel1(3);
                        }
                        if (Cat1.getAge() >= 6 && Cat1.getAge() <= 10){
                            Cat1.setMoodLevel(5);
                            Cat1.setHealthLevel(5);
                            Cat1.setSatietyLevel1(3);
                        }
                        if (Cat1.getAge() >= 11){
                            Cat1.setMoodLevel(4);
                            Cat1.setHealthLevel(4);
                            Cat1.setSatietyLevel1(3);
                        }
                        Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);
                        System.out.printf("Вы поиграли с котом: %s%n", Cat3.getName());
                        break;
                    case 4:
                        if (Cat1.getAge() <= 5){
                            Cat1.setMoodLevel(7);
                            Cat1.setHealthLevel(7);
                            Cat1.setSatietyLevel1(3);
                        }
                        if (Cat1.getAge() >= 6 && Cat1.getAge() <= 10){
                            Cat1.setMoodLevel(5);
                            Cat1.setHealthLevel(5);
                            Cat1.setSatietyLevel1(3);
                        }
                        if (Cat1.getAge() >= 11){
                            Cat1.setMoodLevel(4);
                            Cat1.setHealthLevel(4);
                            Cat1.setSatietyLevel1(3);
                        }
                        Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);
                        System.out.printf("Вы поиграли с котом: %s%n", Cat4.getName());
                    default:
                        System.out.println("Вы не выбрали кота!");
                }
                break;
            case 3:
                System.out.println("Лечить кота");
                System.out.print("Выберите кого хотите лечить (1-4): ");
                Scanner sca = new Scanner(System.in);
                switch (sca.nextInt()) {
                    case 1:
                        if (Cat1.getAge() <= 5){
                            Cat1.setHealthLevel(7);
                            Cat1.setMoodLevel1(3);
                            Cat1.setSatietyLevel1(3);
                        }
                        if (Cat1.getAge() >= 6 && Cat1.getAge() <= 10){
                            Cat1.setHealthLevel(5);
                            Cat1.setMoodLevel1(5);
                            Cat1.setSatietyLevel1(5);
                        }
                        if (Cat1.getAge() >= 11){
                            Cat1.setHealthLevel(4);
                            Cat1.setMoodLevel1(6);
                            Cat1.setSatietyLevel1(6);
                        }
                        Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);
                        System.out.printf("Вы вылечили кота: %s%n", Cat1.getName());
                        break;
                    case 2:
                        if (Cat1.getAge() <= 5){
                            Cat1.setHealthLevel(7);
                            Cat1.setMoodLevel1(3);
                            Cat1.setSatietyLevel1(3);
                        }
                        if (Cat1.getAge() >= 6 && Cat1.getAge() <= 10){
                            Cat1.setHealthLevel(5);
                            Cat1.setMoodLevel1(5);
                            Cat1.setSatietyLevel1(5);
                        }
                        if (Cat1.getAge() >= 11){
                            Cat1.setHealthLevel(4);
                            Cat1.setMoodLevel1(6);
                            Cat1.setSatietyLevel1(6);
                        }
                        Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);
                        System.out.printf("Вы вылечили кота:: %s%n", Cat2.getName());
                        break;
                    case 3:
                        if (Cat1.getAge() <= 5){
                            Cat1.setHealthLevel(7);
                            Cat1.setMoodLevel1(3);
                            Cat1.setSatietyLevel1(3);
                        }
                        if (Cat1.getAge() >= 6 && Cat1.getAge() <= 10){
                            Cat1.setHealthLevel(5);
                            Cat1.setMoodLevel1(5);
                            Cat1.setSatietyLevel1(5);
                        }
                        if (Cat1.getAge() >= 11){
                            Cat1.setHealthLevel(4);
                            Cat1.setMoodLevel1(6);
                            Cat1.setSatietyLevel1(6);
                        }
                        Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);
                        System.out.printf("Вы вылечили кота: %s%n", Cat3.getName());
                        break;
                    case 4:
                        if (Cat1.getAge() <= 5){
                            Cat1.setHealthLevel(7);
                            Cat1.setMoodLevel1(3);
                            Cat1.setSatietyLevel1(3);
                        }
                        if (Cat1.getAge() >= 6 && Cat1.getAge() <= 10){
                            Cat1.setHealthLevel(5);
                            Cat1.setMoodLevel1(5);
                            Cat1.setSatietyLevel1(5);
                        }
                        if (Cat1.getAge() >= 11){
                            Cat1.setHealthLevel(4);
                            Cat1.setMoodLevel1(6);
                            Cat1.setSatietyLevel1(6);
                        }
                        Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);
                        System.out.printf("Вы вылечили кота: %s%n", Cat4.getName());
                    default:
                        System.out.println("Вы не выбрали кота!");
                }
                break;
            default:
                System.out.println("Вы не выбрали кота!");

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы выбрать следующий день нажмите: 1");
        if (scanner.nextInt() == 1){
            Random random = new Random();
            Cat1.setSatietyLevel1(random.nextInt(2,6));
            Cat1.setMoodLevelEquals(random.nextInt(4)-random.nextInt(4));
            Cat1.setHealthLevelEquals(random.nextInt(4)- random.nextInt(4));


            Cat2.setSatietyLevel1(random.nextInt(2,6));
            Cat2.setMoodLevelEquals(random.nextInt(4)-random.nextInt(4));
            Cat2.setHealthLevelEquals(random.nextInt(4)- random.nextInt(4));

            Cat2.setSatietyLevel1(random.nextInt(2,6));
            Cat2.setMoodLevelEquals(random.nextInt(4)-random.nextInt(4));
            Cat2.setHealthLevelEquals(random.nextInt(4)- random.nextInt(4));

            Cat3.setSatietyLevel1(random.nextInt(2,6));
            Cat3.setMoodLevelEquals(random.nextInt(4)-random.nextInt(4));
            Cat3.setHealthLevelEquals(random.nextInt(4)- random.nextInt(4));

            Cat.printNewCat(Cat1, Cat2, Cat3, Cat4);
        }



    }

}