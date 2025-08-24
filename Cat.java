package Animals;

public class Cat extends Animal {

    private static final int CATMAXRUNDIST = 200;
    private static final int CATMAXSWIMDIST = 0;

    private Bowl bowl;
    ;
    boolean foody;

    public Cat(String name) {
        super(name, CATMAXRUNDIST, CATMAXRUNDIST);
        this.name = name;
        this.foody = false;
        catCount++;

    }
        public static int getCount() {
            return count;
        }

        public static int getCatCount () {
            return catCount;
        }
        public void eat(Bowl bowl, int foodNeeded) {
            if (foody) System.out.println(name + " уже сытый.");
            else {
                if (bowl.eat(foodNeeded)) {
                    foody = true;
                    System.out.println(name + " покушал и стал сытым.");
                } else {
                    System.out.println(name + " не смог покушать, еды недостаточно.");
                }
            }
        }
        public void printStatus() {
            System.out.println("Кот " + name + " сытый: " + (foody ? "да" : "нет"));
        }
    }
