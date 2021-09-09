package OechslePractica.demo.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Client {
    private Integer id;
    private String name;
    private String lastname;
    private Integer age;
    private Date dateBirth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    public Date getDateBirth() {
        return dateBirth;
    }
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    public void setDateBirth(Date dateBirth) {

        this.dateBirth = dateBirth;

    }
}
