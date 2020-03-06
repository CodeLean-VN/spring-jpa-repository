package com.codelean.model;

import javax.persistence.*;
import java.util.Set;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "provinces")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "name", length = 6000, columnDefinition = "NVARCHAR(6000) CHARACTER SET utf-8 COLLATE utf-8")
    private String name;

    //private String name;

    @OneToMany(mappedBy = "province")
    private Set<Customer> customers;

    public Province() {
    }

    public Province(String name) {
        this.name = name;
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

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}