package Animals;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = createCats();
        Dog[] dogs = createDogs();

        System.out.println("Общее количество животных: " + Animal.getCount());
        System.out.println("Общее количество кошек: " + Animal.getCatCount());
        System.out.println("Общее количество собак: " + Animal.getDogCount());

        Bowl bowl = new Bowl(50);

        for (Cat cat : cats) {
            cat.eat(bowl, 15);
            cat.printStatus();
            System.out.println("Остаток еды в миске: " + bowl.getFoodAmount());
        }

        bowl.addFood(15);

        for (Cat cat : cats) {
            cat.printStatus();
        }

    }

    public static Cat[] createCats() {
        Cat[] cats = {
                new Cat("Мурка"),
                new Cat("Барсик"),
                new Cat("Киса"),
                new Cat("Мурзик"),
                new Cat("Пушок")
        };
        return cats;
    }

    public static Dog[] createDogs() {
        Dog[] dogs = {
                new Dog("Туз")
        };
        return dogs;
    }

}