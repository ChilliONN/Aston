package Animals;

class Animal {
    public String name;
    private final int maxRunDistance;
    private final int maxSwimDistance;
    public static int count = 0;
    public static int catCount = 0;
    public static int dogCount = 0;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public void printStatus() {
        System.out.println("Животное: " + name);
    }

    public void run(int runDistance) {
        if (runDistance < maxRunDistance) {
            System.out.println(name + " пробежал(а) " + runDistance + " метров");
        } else {
            System.out.println(name + " не может пробежать больше, чем " + maxRunDistance + " метров");
        }
    }

    public void swim(int swimDistance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать");
        } else if (swimDistance < maxSwimDistance) {
            System.out.println(name + " проплыл(а) " + swimDistance + " метров");
        } else {
            System.out.println(name + " не может проплыть больше, чем " + maxSwimDistance + " метров");
        }
    }
}
