public class Bus {
    private Integer number;
    private String model;
    private Integer mileage;

    private Bus(Integer number, String model, Integer mileage) {
        this.number = number;
        this.model = model;
        this.mileage = mileage;
    }

    public static Builder builder(String model) {
        return new Builder();
    }

    public Integer getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public Integer getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Bus{" + "number=" + number + ", model=" + model + ", mileage=" + mileage + '}';
    }

    public static class Builder {
        private Integer number;
        private String model;
        private Integer mileage;

        public Builder setNumber(Integer number) {
            this.number = number;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setMileage(Integer mileage) {
            this.mileage = mileage;
            return this;
        }

        public Bus build() {
            return new Bus(number, model, mileage);
        }
    }
}