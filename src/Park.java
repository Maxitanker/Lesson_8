public class Park {
    private String parkName;
    public class Attraction {
        private String name;
        private String hours;
        private int price;
        public Attraction(String name, String hours, int price) {
            this.name = name;
            this.hours = hours;
            this.price = price;
        }
        public void displayInfo() {
            System.out.println("Attraction Name: " + name);
            System.out.println("Working Hours: " + hours);
            System.out.println("Price: " + price);
            System.out.println();
        }
    }
    public Park(String parkName) {
        this.parkName = parkName;
    }
}
