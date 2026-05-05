public class MenuCar implements Menu {
    private String a;
    private String b;
    private Integer num;

    public MenuCar(String a, String b, Integer num) {
        this.a = a;
        this.b = b;
        this.num = num;
    }

    @Override
    public void openMenu() {
        CarValidator carValidator = new CarValidator();
        switch (num) {
            case (1):
                System.out.printf(a + b);
                num = carValidator.validation();
            case (2):
                System.out.printf(a + b);
                num = carValidator.validation2();
                break;
            case (3):
                System.out.printf(a + b);
                num = carValidator.validation3();
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