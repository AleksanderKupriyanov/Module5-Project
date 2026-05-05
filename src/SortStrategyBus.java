public interface SortStrategyBus {

    int compare(Bus b1, Bus b2);


    class SortByNumber implements SortStrategyBus {

        @Override
        public int compare(Bus b1, Bus b2) {
            return Integer.compare(b1.getNumber(), b2.getNumber());
        }
    }

    class SortByModelBus implements SortStrategyBus {

        @Override
        public int compare(Bus b1, Bus b2) {
            return b1.getModel().compareTo(b2.getModel());
        }
    }

    class SortByMileage implements SortStrategyBus {

        @Override
        public int compare(Bus b1, Bus b2) {
            return Integer.compare(b1.getMileage(), b2.getMileage());
        }
    }
}