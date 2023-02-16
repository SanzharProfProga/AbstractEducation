import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;
    private  int year;

    public Student(String firstName, String lastName, char gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.year = Period.between(dateOfStart,LocalDate.now()).getYears();
        this.educationCenter = educationCenter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    @Override
    public String toString() {
        return "\n\n\nStudent " +
                "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nGender: " + gender +
                "\nYear: " + year+
                "\n\nEducation center: " + educationCenter;
    }
}
