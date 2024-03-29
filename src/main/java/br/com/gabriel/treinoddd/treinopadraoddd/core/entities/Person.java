package br.com.gabriel.treinoddd.treinopadraoddd.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "PERSON")
public class Person extends DomainEntity implements Serializable {

    @Column(name = "prn_name")
    private String name;

    @Column(name = "prn_age")
    private Integer age;

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", active=" + active +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
