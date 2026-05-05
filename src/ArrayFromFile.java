import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayFromFile {

    public Bus[] readBusesFile() {
        List<Bus> b = new ArrayList<>();
        String inputFileName = "Buses.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String str;
            String a;
            int d, c;
            while ((str = reader.readLine()) != null) {
                String[] p = str.split(",");
                a = p[0];
                c = Integer.parseInt(p[1]);
                d = Integer.parseInt(p[2]);
                b.add(new Bus.Builder().setModel(a).setNumber(d).setMileage(c).build());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Bus[] buses = new Bus[b.size()];
        for (int i = 0; i < buses.length; i++) {
            buses[i] = b.get(i);
        }
        return buses;
    }

    public User[] readUsersFile() {
        List<User> u = new ArrayList<>();
        String inputFileName = "Users.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String str;
            String a, c;
            int b;
            while ((str = reader.readLine()) != null) {
                String[] p = str.split(",");
                a = p[0];
                b = Integer.parseInt(p[1]);
                c = p[2];
                u.add(new User.Builder().setName(a).setPassword(b).setEmail(c).build());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        User[] users = new User[u.size()];
        for (int i = 0; i < users.length; i++) {
            users[i] = u.get(i);
        }
        return users;
    }

    public Student[] readStudentsFile() {
        List<Student> s = new ArrayList<>();
        String inputFileName = "Students.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String str;
            int a, b, c;
            while ((str = reader.readLine()) != null) {
                String[] p = str.split(",");
                a = Integer.parseInt(p[0]);
                b = Integer.parseInt(p[1]);
                c = Integer.parseInt(p[2]);
                s.add(new Student.Builder().setGroupNumber(a).setAverageScore(b).setCardNumber(c).build());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Student[] students = new Student[s.size()];
        for (int i = 0; i < students.length; i++) {
            students[i] = s.get(i);
        }
        return students;
    }

    public Car[] readCarsFile() {
        List<Car> c = new ArrayList<>();
        String inputFileName = "Cars.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String str;
            int a, d;
            String b;
            while ((str = reader.readLine()) != null) {
                String[] p = str.split(",");
                a = Integer.parseInt(p[0]);
                b = p[1];
                d = Integer.parseInt(p[2]);
                c.add(new Car.Builder().setPower(a).setModel(b).setYearOfProduction(d).build());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Car[] cars = new Car[c.size()];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = c.get(i);
        }
        return cars;
    }

    public Barrel[] readBarrelsFile() {
        List<Barrel> b = new ArrayList<>();
        String inputFileName = "Barrels.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String str;
            int a;
            String d, c;
            while ((str = reader.readLine()) != null) {
                String[] p = str.split(",");
                a = Integer.parseInt(p[0]);
                d = p[1];
                c = p[2];
                b.add(new Barrel.Builder().setVolume(a).setStoredMaterial(d).setMaterialIsMade(c).build());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Barrel[] barrels = new Barrel[b.size()];
        for (int i = 0; i < barrels.length; i++) {
            barrels[i] = b.get(i);
        }
        return barrels;
    }
}