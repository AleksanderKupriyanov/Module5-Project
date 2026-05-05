import java.util.Arrays;

public class Sorter {

    public void sort(Bus[] buses, SortStrategyBus strategy) {
        for (int i = 0; i < buses.length - 1; ++i) {
            for (int j = 0; j < buses.length - i - 1; ++j) {
                if (strategy.compare(buses[j], buses[j + 1]) > 0) {
                    Bus temp = buses[j];
                    buses[j] = buses[j + 1];
                    buses[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(buses));
    }

    public  void sort(User[] users, SortStrategyUser strategy) {
        for (int i = 0; i < users.length - 1; ++i) {
            for (int j = 0; j < users.length - i - 1; ++j) {
                if (strategy.compare(users[j], users[j + 1]) > 0) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(users));
    }

    public  void sort(Student[] students, SortStrategyStudent strategy) {
        for (int i = 0; i < students.length - 1; ++i) {
            for (int j = 0; j < students.length - i - 1; ++j) {
                if (strategy.compare(students[j], students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(students));
    }

    public  void sort(Car[] cars, SortStrategyCar strategy) {
        for (int i = 0; i < cars.length - 1; ++i) {
            for (int j = 0; j < cars.length - i - 1; ++j) {
                if (strategy.compare(cars[j], cars[j + 1]) > 0) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(cars));
    }

    public  void sort(Barrel[] barrels, SortStrategyBarrel strategy) {
        for (int i = 0; i < barrels.length - 1; ++i) {
            for (int j = 0; j < barrels.length - i - 1; ++j) {
                if (strategy.compare(barrels[j], barrels[j + 1]) > 0) {
                    Barrel temp = barrels[j];
                    barrels[j] = barrels[j + 1];
                    barrels[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(barrels));
    }
}