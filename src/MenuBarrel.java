public class MenuBarrel implements Menu {
    private String a;
    private String b;
    private Integer num;

    public MenuBarrel(String a, String b, Integer num) {
        this.a = a;
        this.b = b;
        this.num = num;
    }

    @Override
    public void openMenu() {
        BarrelValidator barrelValidator = new BarrelValidator();
        switch (num) {
            case (1):
                System.out.printf(a + b);
                num = barrelValidator.validation();
            case (2):
                System.out.printf(a + b);
                num = barrelValidator.validation2();
                break;
            case (3):
                System.out.printf(a + b);
                num = barrelValidator.validation3();
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