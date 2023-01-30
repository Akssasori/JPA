package com.padawan.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    private Long id;
    @Column(name = "email_user")
    private String email;
//    @Column(columnDefinition = "varchar(50) default 'John Snow'")
    @Column(columnDefinition = "varchar(50)")
    private String name;
    @Column(length = 11)
    private String cpf;
    private LocalDate createUser;
    private Float salary;


    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getCreateUser() {
        return createUser;
    }

    public void setCreateUser(LocalDate createUser) {
        this.createUser = createUser;
    }
}
