public class MenuUser implements Menu {
    private String a;
    private String b;
    private Integer num;

    public MenuUser(String a, String b, Integer num) {
        this.a = a;
        this.b = b;
        this.num = num;
    }

    @Override
    public void openMenu() {
        UserValidator userValidator = new UserValidator();
        switch (num) {
            case (1):
                System.out.printf(a + b);
                num = userValidator.validation();
                break;
            case (2):
                System.out.printf(a + b);
                num = userValidator.validation2();
                break;
            case (3):
                System.out.printf(a + b);
                num = userValidator.validation3();
                break;
            case (4):
                break;
            case (0):
                break;
            default:
                System.out.println("Неверно введено значение");
                break;
        }
    }
}