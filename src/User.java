public class User {
    private String name;
    private Integer password;
    private String email;

    private User(String name, Integer password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public static User.Builder builder(String name) {
        return new User.Builder();
    }

    public String getName() {
        return name;
    }

    public Integer getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password=" + password +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private Integer password;
        private String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPassword(Integer password) {
            this.password = password;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(name,password,email);
        }
    }
}