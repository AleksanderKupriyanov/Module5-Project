public class Car {
    private Integer power;
    private String model;
    private Integer yearOfProduction;

    private Car(Integer power, String model, Integer yearOfProduction) {
        this.power = power;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public static Car.Builder builder(String model) {
        return new Car.Builder();
    }

    public Integer getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public static class Builder {
        private Integer power;
        private String model;
        private Integer yearOfProduction;

        public Builder setPower(Integer power) {
            this.power = power;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYearOfProduction(Integer yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
            return this;
        }

        public Car build() {
            return new Car(power, model, yearOfProduction);
        }
    }
}