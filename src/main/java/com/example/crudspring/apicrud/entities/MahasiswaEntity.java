package com.example.crudspring.apicrud.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mhs")
public class MahasiswaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String name;
    private String email;
    private Date create_date;


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }


    @Override
    public String toString() {
        return "MahasiswaEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", create_date=" + create_date +
                '}';
    }
}
