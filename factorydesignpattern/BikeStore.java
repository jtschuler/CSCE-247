package factorydesignpattern;

public class BikeStore {
    public Bike orderBike(String bikeType) {
        Bike bike = createBike(bikeType);
        if (bike != null) {
            bike.createBike();
            System.out.println("Price $" + bike.getPrice());
        }
        return bike;
    }

    private Bike createBike(String bikeType) {
        switch (bikeType) {
            case "tricycle":
                return new Tricycle();
            case "strider":
                return new Strider();
            case "kids bike":
                return new KidsBike();
            default:
                return null;
        }
    }
}
