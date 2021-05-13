import java.io.*;
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Анастасия Крот";
        e.address = "Москва, Россия";
        e.SSN = 11122333;
        e.number = 101;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/temp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Сериализованные данные сохраняются в /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

