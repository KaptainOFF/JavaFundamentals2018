import java.io.Serializable;

public class FootballPlayer implements Serializable {
    private String name;
    private int age;
    private String club;
    private double salary;

    public FootballPlayer(String name, int age, String club, double salary) {
        this.name = name;
        this.age = age;
        this.club = club;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", club='" + club + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
