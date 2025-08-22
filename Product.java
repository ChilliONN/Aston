class Product {
    private String name;
    private String date; // например, дата производства или срок годности
    private String manufacturer;
    private String countryFrom;
    private int price;
    private boolean available;

    public Product(String name, String date, String manufacturer, String countryFrom, int price, boolean available) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.countryFrom = countryFrom;
        this.price = price;
        this.available = available;
    }

    public void info() {
        System.out.println("Название: " + name);
        System.out.println("Дата: " + date);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна: " + countryFrom);
        System.out.println("Цена: " + price + " рублей");
        System.out.println("В наличии: " + (available ? "Да" : "Нет"));
        System.out.println();
    }
}
