public interface SortStrategyStudent {

    int compare(Student s1, Student s2);

    class SortByGroupNumber implements SortStrategyStudent {

        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getGroupNumber(), s2.getGroupNumber());
        }
    }

    class SortByAverageScore implements SortStrategyStudent {

        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getAverageScore(), s2.getAverageScore());
        }
    }

    class SortByCardNumber implements SortStrategyStudent {

        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getCardNumber(), s2.getCardNumber());
        }
    }
}