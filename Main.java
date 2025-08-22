public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Apple iPhone 15", "15.09.2023", "Apple Inc.", "USA", 99999, true);
        productsArray[2] = new Product("Xiaomi Redmi Note 12", "10.11.2024", "Xiaomi", "China", 19999, false);
        productsArray[3] = new Product("Dell XPS 13", "20.03.2024", "Dell", "USA", 120000, true);
        productsArray[4] = new Product("Sony WH-1000XM5", "05.07.2023", "Sony", "Japan", 35000, true);

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].info();
        }
    }
}