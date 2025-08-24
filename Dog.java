package Animals;

public class Dog extends Animal {

    private static final int DOGMAXRUNDIST = 500;
    private static final int DOGMAXSWIMDIST = 10;

    public static int getCount() {
        return count;
    }


    public Dog(String name) {
        super(name, DOGMAXRUNDIST, DOGMAXSWIMDIST);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
