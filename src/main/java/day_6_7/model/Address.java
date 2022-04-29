package day_6_7.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "address")
public class Address {

    //CREATE TABLE `aqa_3AT_21`.`address` (
    //                                        `id_address` INT NOT NULL,
    //                                        `country` VARCHAR(45) NULL,
    //                                        `city` VARCHAR(45) NULL,
    //                                        PRIMARY KEY (`id_address`));
    @Id
    private Integer id_address;
    private String country;
    private String city;

    // address_student
    @ManyToMany
    @JoinTable(
            name="address_student",
            joinColumns= @JoinColumn(name = "id_student"),
            inverseJoinColumns = @JoinColumn(name = "id_address")
    )
    private Set<Student> studentSet;


    public Integer getId_address() {
        return id_address;
    }

    public void setId_address(Integer id_address) {
        this.id_address = id_address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id_address=" + id_address +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", studentSet=" + studentSet +
                '}';
    }
}
