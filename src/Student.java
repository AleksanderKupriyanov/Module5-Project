public class Student {
    private Integer groupNumber;
    private Integer averageScore;
    private Integer cardNumber;

    private Student(Integer groupNumber, Integer averageScore, Integer cardNumber) {
        this.groupNumber = groupNumber;
        this.averageScore = averageScore;
        this.cardNumber = cardNumber;
    }

    public static Student.Builder builder(Integer groupNumber) {
        return new Student.Builder();
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public Integer getAverageScore() {
        return averageScore;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupNumber=" + groupNumber +
                ", averageScore=" + averageScore +
                ", cardNumber=" + cardNumber +
                '}';
    }

    public static class Builder {
        private Integer groupNumber;
        private Integer averageScore;
        private Integer cardNumber;

        public Builder setGroupNumber(Integer groupNumber) {
            this.groupNumber = groupNumber;
            return this;
        }

        public Builder setAverageScore(Integer averageScore) {
            this.averageScore = averageScore;
            return this;
        }

        public Builder setCardNumber(Integer cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Student build() {
            return new Student(groupNumber, averageScore, cardNumber);
        }
    }
}