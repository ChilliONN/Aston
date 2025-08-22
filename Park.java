public class Park {
    class Attraktion {
        String name;
        String workHours;
        double cost;

        Attraktion(String name, String workHours, double cost) {
            this.name = name;
            this.workHours = workHours;
            this.cost = cost;
        }

        void displayInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workHours);
            System.out.println("Стоимость: " + cost + " рублей");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Park park = new Park();

        Attraktion rollerCoaster = park.new Attraktion("Американские горки", "10:00 - 18:00", 300);
        Attraktion ferrisWheel = park.new Attraktion("Колесо обозрения", "09:00 - 21:00", 150);
        Attraktion bumperCars = park.new Attraktion("Батуты", "11:00 - 19:00", 200);

        rollerCoaster.displayInfo();
        ferrisWheel.displayInfo();
        bumperCars.displayInfo();
    }
}