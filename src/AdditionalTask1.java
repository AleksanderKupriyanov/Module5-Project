public class AdditionalTask1 {

    public Bus[] sortedBuses(Bus[] buses, String str) {
        switch (str) {
            case ("number"):
                for (int i = 0; i < buses.length; i++) {
                    if (buses[i].getNumber() % 2 == 0) {
                        for (int j = i + 1; j < buses.length; j++) {
                            if (buses[j].getNumber() % 2 == 0 && buses[i].getNumber() > buses[j].getNumber()) {
                                Bus a = buses[i];
                                buses[i] = buses[j];
                                buses[j] = a;
                            }
                        }
                    }
                }
                break;
            case ("mileage"):
                for (int i = 0; i < buses.length; i++) {
                    if (buses[i].getMileage() % 2 == 0) {
                        for (int j = i + 1; j < buses.length; j++) {
                            if (buses[j].getMileage() % 2 == 0 && buses[i].getMileage() > buses[j].getMileage()) {
                                Bus a = buses[i];
                                buses[i] = buses[j];
                                buses[j] = a;
                            }
                        }
                    }
                }
                break;
            default:
                System.out.println("Указано неверное значение");
                break;
        }
        return buses;
    }

    public User[] sortedUsers(User[] users, String str) {
        switch (str) {
            case ("password"):
                for (int i = 0; i < users.length; i++) {
                    if (users[i].getPassword() % 2 == 0) {
                        for (int j = i + 1; j < users.length; j++) {
                            if (users[j].getPassword() % 2 == 0 && users[i].getPassword() > users[j].getPassword()) {
                                User a = users[i];
                                users[i] = users[j];
                                users[j] = a;
                            }
                        }
                    }
                }
                break;
            default:
                System.out.println("Указано неверное значение");
                break;
        }
        return users;
    }

    public Student[] sortedStudents(Student[] students, String str) {
        switch (str) {
            case ("gruopNumber"):
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getGroupNumber() % 2 == 0) {
                        for (int j = i + 1; j < students.length; j++) {
                            if (students[j].getGroupNumber() % 2 == 0 && students[i].getGroupNumber() > students[j].getGroupNumber()) {
                                Student a = students[i];
                                students[i] = students[j];
                                students[j] = a;
                            }
                        }
                    }
                }
                break;
            case ("averageScore"):
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getAverageScore() % 2 == 0) {
                        for (int j = i + 1; j < students.length; j++) {
                            if (students[j].getAverageScore() % 2 == 0 && students[i].getAverageScore() > students[j].getAverageScore()) {
                                Student a = students[i];
                                students[i] = students[j];
                                students[j] = a;
                            }
                        }
                    }
                }
                break;
            case ("cardNumber"):
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getCardNumber() % 2 == 0) {
                        for (int j = i + 1; j < students.length; j++) {
                            if (students[j].getCardNumber() % 2 == 0 && students[i].getCardNumber() > students[j].getCardNumber()) {
                                Student a = students[i];
                                students[i] = students[j];
                                students[j] = a;
                            }
                        }
                    }
                }
                break;
            default:
                System.out.println("Указано неверное значение");
                break;
        }
        return students;
    }

    public Car[] sortedCars(Car[] cars, String str) {
        switch (str) {
            case ("power"):
                for (int i = 0; i < cars.length; i++) {
                    if (cars[i].getPower() % 2 == 0) {
                        for (int j = i + 1; j < cars.length; j++) {
                            if (cars[j].getPower() % 2 == 0 && cars[i].getPower() > cars[j].getPower()) {
                                Car a = cars[i];
                                cars[i] = cars[j];
                                cars[j] = a;
                            }
                        }
                    }
                }
                break;
            case ("yearOfProduction"):
                for (int i = 0; i < cars.length; i++) {
                    if (cars[i].getYearOfProduction() % 2 == 0) {
                        for (int j = i + 1; j < cars.length; j++) {
                            if (cars[j].getYearOfProduction() % 2 == 0 && cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                                Car a = cars[i];
                                cars[i] = cars[j];
                                cars[j] = a;
                            }
                        }
                    }
                }
                break;
            default:
                System.out.println("Указано неверное значение");
                break;
        }
        return cars;
    }

    public Barrel[] sortedBarrels(Barrel[] barrels, String str) {
        switch (str) {
            case ("volume"):
                for (int i = 0; i < barrels.length; i++) {
                    if (barrels[i].getVolume() % 2 == 0) {
                        for (int j = i + 1; j < barrels.length; j++) {
                            if (barrels[j].getVolume() % 2 == 0 && barrels[i].getVolume() > barrels[j].getVolume()) {
                                Barrel a = barrels[i];
                                barrels[i] = barrels[j];
                                barrels[j] = a;
                            }
                        }
                    }
                }
                break;
            default:
                System.out.println("Указано неверное значение");
                break;
        }
        return barrels;
    }
}