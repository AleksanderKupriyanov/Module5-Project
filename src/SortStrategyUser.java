public interface SortStrategyUser {

    int compare(User u1, User u2);

    class SortByName implements SortStrategyUser {

        @Override
        public int compare(User u1, User u2) {
            return u1.getName().compareTo(u2.getName());
        }
    }

    class SortByPassword implements SortStrategyUser {

        @Override
        public int compare(User u1, User u2) {
            return Integer.compare(u1.getPassword(), u2.getPassword());
        }
    }

    class SortByEmail implements SortStrategyUser {

        @Override
        public int compare(User u1, User u2) {
            return u1.getEmail().compareTo(u2.getEmail());
        }
    }
}