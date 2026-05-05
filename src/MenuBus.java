public class MenuBus implements Menu {
    private String a;
    private String b;
    private Integer num;

    public MenuBus(String a, String b, Integer num) {
        this.a = a;
        this.b = b;
        this.num = num;
    }

    @Override
    public void openMenu() {
        BusValidator busValidator = new BusValidator();
        switch (num) {
            case (1):
                System.out.printf(a + b);
                num = busValidator.validation();
                break;
            case (2):
                System.out.printf(a + b);
                num = busValidator.validation2();
                break;
            case (3):
                System.out.printf(a + b);
                num = busValidator.validation3();
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