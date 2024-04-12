package com.trngtien.saarm_be.models;

import com.trngtien.saarm_be.base.BaseTzEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "\"Apartment\"")
public class Apartment extends BaseTzEntity {
    @Column()
    private String name;

    @Column()
    private String status;

    public Apartment() {
    }

    public Apartment(String name, String status) {
        super();
        this.status = status;
        this.name = name;
    }


    @Override
    public String toString() {
        return "";
    }

}
