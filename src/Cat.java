import java.util.Random;

public class Cat {
    Random r = new Random();

    private String name;
    private Integer age;
    private Integer satietyLevel;
    private Integer moodLevel;
    private Integer healthLevel;
    private Integer mediumLevel;

    public Cat(String name, Integer age, Integer satietyLevel, Integer moodLevel, Integer healthLevel) {
        this.name = name;
        this.age = age;
        this.satietyLevel = satietyLevel;
        this.moodLevel = moodLevel;
        this.healthLevel = healthLevel;
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.satietyLevel = r.nextInt(20,80);
        this.moodLevel = r.nextInt(20,80);
        this.healthLevel = r.nextInt(20,80);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSatietyLevel() {
        return satietyLevel;
    }

    public void setSatietyLevel(Integer satietyLevel) {

        this.satietyLevel += satietyLevel;
    }
    public void setSatietyLevel1(Integer satietyLevel) {

        this.satietyLevel -= satietyLevel;
    }

    public Integer getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(Integer moodLevel) {
        this.moodLevel += moodLevel;
    }
    public void setMoodLevel1(Integer moodLevel) {
        this.moodLevel -= moodLevel;
    }

    public Integer getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(Integer healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getMediumLevel() {
        return mediumLevel;
    }

    public void setMediumLevel(int mediumLevel) {
        this.mediumLevel = mediumLevel;
    }

    public void satietyLevel(Cat cat){
       int sum = (cat.healthLevel + cat.moodLevel + cat.satietyLevel) / 2;
       setMediumLevel(sum);
    }
    public static void newCat(){

    }
    public static void printCat(Cat cat1,Cat cat2,Cat cat3){
        System.out.println("---+---------+---------+-----------+------------+---------+-----------------+");
        System.out.println(" # |   »Ãﬂ   | ¬Œ«–¿—“ | «ƒŒ–Œ¬‹≈  | Õ¿—“–Œ≈Õ»≈ | —€“Œ—“‹ | —–≈ƒÕ»… ”–Œ¬≈Õ‹ |");
        System.out.println("---+---------+---------+-----------+------------+---------+-----------------+");
        System.out.printf(" 1 |%8s |%9s|%11s|%12s|%9s|%17s|%n",
                cat1.getName(), cat1.getAge(),cat1.getHealthLevel(),cat1.getMoodLevel(),cat1.getSatietyLevel(),cat1.getMediumLevel());
        System.out.printf(" 2 |%8s |%9s|%11s|%12s|%9s|%17s|%n",
                cat2.getName(), cat2.getAge(),cat2.getHealthLevel(),cat2.getMoodLevel(),cat2.getSatietyLevel(),cat2.getMediumLevel());
        System.out.printf(" 3 |%8s |%9s|%11s|%12s|%9s|%17s|%n",
                cat3.getName(), cat3.getAge(),cat3.getHealthLevel(),cat3.getMoodLevel(),cat3.getSatietyLevel(),cat3.getMediumLevel());
        System.out.println("---+---------+---------+-----------+------------+---------+-----------------+");

    }

    public static void printNewCat(Cat cat1,Cat cat2,Cat cat3,Cat cat4){
        System.out.println("---+---------+---------+-----------+------------+---------+-----------------+");
        System.out.println(" # |   »Ãﬂ   | ¬Œ«–¿—“ | «ƒŒ–Œ¬‹≈  | Õ¿—“–Œ≈Õ»≈ | —€“Œ—“‹ | —–≈ƒÕ»… ”–Œ¬≈Õ‹ |");
        System.out.println("---+---------+---------+-----------+------------+---------+-----------------+");
        System.out.printf(" 1 |%8s |%9s|%11s|%12s|%9s|%17s|%n",
                cat1.getName(), cat1.getAge(),cat1.getHealthLevel(),cat1.getMoodLevel(),cat1.getSatietyLevel(),cat1.getMediumLevel());
        System.out.printf(" 2 |%8s |%9s|%11s|%12s|%9s|%17s|%n",
                cat2.getName(), cat2.getAge(),cat2.getHealthLevel(),cat2.getMoodLevel(),cat2.getSatietyLevel(),cat2.getMediumLevel());
        System.out.printf(" 3 |%8s |%9s|%11s|%12s|%9s|%17s|%n",
                cat3.getName(), cat3.getAge(),cat3.getHealthLevel(),cat3.getMoodLevel(),cat3.getSatietyLevel(),cat3.getMediumLevel());
        System.out.printf(" 4 |%8s |%9s|%11s|%12s|%9s|%17s|%n",
                cat4.getName(), cat4.getAge(),cat4.getHealthLevel(),cat4.getMoodLevel(),cat4.getSatietyLevel(),cat4.getMediumLevel());
        System.out.println("---+---------+---------+-----------+------------+---------+-----------------+");
    }
}
