public class Main {
        public static void main(String[] args) {
                Bicycle cronus = new Bicycle("Кронус", 2);
                Bicycle crossM = new Bicycle("Кросс-М", 2);

                cronus.updateTyre();

                Car bmw = new Car("BMW", 4);
                Car volvo = new Car("VOLVO", 4);

                volvo.checkEngine();


                Truck ural = new Truck("Урал", 6);
                Truck iveco = new Truck("IVECO", 8);

                iveco.checkTrailer();

                ServiceStationImpl serviceStation = new ServiceStationImpl();
                serviceStation.check(crossM);
                serviceStation.check(bmw);
                serviceStation.check(ural);

        }
}