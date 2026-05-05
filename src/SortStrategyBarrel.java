public interface SortStrategyBarrel {

    int compare(Barrel b1, Barrel b2);

    class SortByVolume implements SortStrategyBarrel {

        @Override
        public int compare(Barrel b1, Barrel b2) {
            return Integer.compare(b1.getVolume(), b2.getVolume());
        }
    }

    class SortByStoredMaterial implements SortStrategyBarrel {

        @Override
        public int compare(Barrel b1, Barrel b2) {
            return b1.getStoredMaterial().compareTo(b2.getStoredMaterial());
        }
    }

    class SortByMaterialIsMade implements SortStrategyBarrel {

        @Override
        public int compare(Barrel b1, Barrel b2) {
            return b1.getMaterialIsMade().compareTo(b2.getMaterialIsMade());
        }
    }
}