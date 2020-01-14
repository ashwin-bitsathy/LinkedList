import java.util.Objects;

public class Employeee {
    public Employeee(String firstname, String lastname, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    private String firstname;
    private  String lastname;
    private int id;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Arraylistds{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                '}';
    }


    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employeee employeee = (Employeee) o;
        return id == employeee.id &&
                Objects.equals(firstname, employeee.firstname) &&
                Objects.equals(lastname, employeee.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, id);
    }
}
