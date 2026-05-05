public class Barrel {
    private Integer volume;
    private String storedMaterial;
    private String materialIsMade;

    private Barrel(Integer volume, String storedMaterial, String materialIsMade) {
        this.volume = volume;
        this.storedMaterial = storedMaterial;
        this.materialIsMade = materialIsMade;
    }

    public static Barrel.Builder builder(Integer volume) {
        return new Barrel.Builder();
    }

    public Integer getVolume() {
        return volume;
    }

    public String getStoredMaterial() {
        return storedMaterial;
    }

    public String getMaterialIsMade() {
        return materialIsMade;
    }

    @Override
    public String toString() {
        return "Barrel{" + "volume=" + volume + ", storedMaterial='" + storedMaterial + '\'' + ", materialIsMade='" + materialIsMade + '\'' + '}';
    }

    public static class Builder {
        private Integer volume;
        private String storedMaterial;
        private String materialIsMade;

        public Builder setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }

        public Builder setMaterialIsMade(String materialIsMade) {
            this.materialIsMade = materialIsMade;
            return this;
        }

        public Builder setStoredMaterial(String storedMaterial) {
            this.storedMaterial = storedMaterial;
            return this;
        }

        public Barrel build() {
            return new Barrel(volume, storedMaterial, materialIsMade);
        }
    }
}