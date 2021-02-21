package edu.wsb.modelingdataexercise.person;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true, length = 99)
    private String username;

    @Column (length = 100)
    private String firstName;

    private String lastName;


    @Column (nullable = false, length = 100)
    private String password;
    private Boolean enabled;

    @Column(nullable = false)
    @ColumnDefault("false")
    private  Boolean passwordExpired;
    private Date dataCreated;


    public Person(String username, String password, Boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.passwordExpired = false;
        this.dataCreated = new Date();
    }

    protected Person() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(Date dataCreated) {
        this.dataCreated = dataCreated;
    }


}
