package Animals;

public class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        if (initialFood < 0) {
            this.foodAmount = 0;
        } else {
            this.foodAmount = initialFood;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
        }
    }

    public boolean eat(int foodNeeded) {
        if (foodAmount >= foodNeeded) {
            foodAmount -= foodNeeded;
            return true; // еда есть и кот может поесть
        } else {
            return false; // еды недостаточно
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}