import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Sanzhar", "Abdymomunov", 'M', LocalDate.of(2019, 10, 7),
                         new University("Harvard", "USA", LocalDate.of(1636, 9, 8))),
                new Student("Nradil", "Zholdoshov", 'M', LocalDate.of(2020, 8, 9),
                        new University("Oxford", "Great Britain", LocalDate.of(1096, 6, 9))),
                new Student("Ishak", "Abduhamitov", 'M', LocalDate.of(2019, 7, 3),
                        new University("The California Institute of Technology", "USA", LocalDate.of(1891, 8, 23)))};

        for (int i = 0; i < students.length; i++) {
            System.out.println(getInfo(students[i].toString()));
        }

    }
    static String getInfo(String strings){


        return strings;
    }
}