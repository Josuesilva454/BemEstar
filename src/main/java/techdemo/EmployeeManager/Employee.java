package techdemo.EmployeeManager;

import net.bytebuddy.implementation.bind.annotation.Empty;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column(nullable = false, updatable = false)

    private Long id;
    private String name;
    private String email;
    @Column(length = 20, nullable = false)
    private String Username;
    @Column(length = 100, nullable = false)
    private String password;
    private String age;
    private String County;
    private String address;
    private String City;
    private String phoner;
    private String Unit;
    @Column(nullable = false, updatable = false)
    private String patientcode;

    public Employee() {}

    public Employee (String name,String email, String Username, String password, String age, String County, String address,String City,  String phoner,String Unit,String patientcode ){
        this.name = name;
        this.email = email;
        this.Username = Username;
        this.password = password;
        this.age = age;
        this.County= County;
        this.address = address;
        this.City = City;
        this.phoner = phoner;
        this.Unit = Unit;
        this.patientcode = patientcode;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPhoner() {
        return phoner;
    }

    public void setPhoner(String phoner) {
        this.phoner = phoner;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getPatientcode() {
        return patientcode;
    }

    public void setPatientcode(String patientcode) {
        this.patientcode = patientcode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Username='" + Username + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                ", County='" + County + '\'' +
                ", address='" + address + '\'' +
                ", City='" + City + '\'' +
                ", phoner='" + phoner + '\'' +
                ", Unit='" + Unit + '\'' +
                ", patientcode='" + patientcode + '\'' +
                '}';
    }
}
