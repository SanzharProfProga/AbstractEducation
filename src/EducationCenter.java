import java.time.LocalDate;

public abstract class EducationCenter {
    private String name;
    private String locationCountry;
    private LocalDate foundationYear;

    public EducationCenter(String name, String locationCountry, LocalDate foundationYear) {
        this.name = name;
        this.locationCountry = locationCountry;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nLocation country: " + locationCountry +
                "\nFoundation year:" + foundationYear ;
    }
}
