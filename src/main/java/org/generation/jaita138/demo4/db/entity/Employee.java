package org.generation.jaita138.demo4.db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 64)
    private String name;

    @Column(length = 64)
    private String lastname;

    @Column(columnDefinition = "TEXT")
    private String bio;

    @Column(columnDefinition = "DECIMAL(10,2)")
    private float salary;

    public Long getId() {

        return this.id;
    }
    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return this.name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public String getLastname() {

        return this.lastname;
    }
    public void setLastname(String lastname) {

        this.lastname = lastname;
    }

    public String getBio() {

        return this.bio;
    }
    public void setBio(String bio) {

        this.bio = bio;
    }

    public float getSalary() {

        return this.salary;
    }
    public void setSalary(float salary) {

        this.salary = salary;
    }

    @Override
    public String toString() {
        
        return "Employee [\n"
            + "  id: " + this.id + ",\n"
            + "  name: " + this.name + ",\n"
            + "  lastname: " + this.lastname + ",\n"
            + "  bio: " + this.bio + ",\n"
            + "  salary: " + this.salary + "\n"
        + "]";
    }
}
