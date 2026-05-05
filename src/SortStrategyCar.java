public interface SortStrategyCar {

    int compare(Car c1, Car c2);

    class SortByPower implements SortStrategyCar {

        @Override
        public int compare(Car c1, Car c2) {
            return Integer.compare(c1.getPower(), c2.getPower());
        }
    }

    class SortByModelCar implements SortStrategyCar {

        @Override
        public int compare(Car c1, Car c2) {
            return c1.getModel().compareTo(c2.getModel());
        }
    }

    class SortByYearOfProduction implements SortStrategyCar {

        @Override
        public int compare(Car c1, Car c2) {
            return Integer.compare(c1.getYearOfProduction(), c2.getYearOfProduction());
        }
    }
}