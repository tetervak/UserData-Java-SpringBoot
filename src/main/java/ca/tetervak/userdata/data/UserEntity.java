package ca.tetervak.userdata.data;



import javax.persistence.*;


@Entity
@Table(name="app_user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id = 0;

    @Column(name="first_name")
    private String firstName = "";

    @Column(name="last_name")
    private String lastName = "";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
