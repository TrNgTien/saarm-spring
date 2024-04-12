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
@Table(name = "\"Room\"")
public class Room extends BaseTzEntity {
    @Column()
    private String name;

    @Column(name = "monthly_price")
    private String monthlyPrice;

    @Column(name = "total_people")
    private Integer totalPeople;

    public Room () {}

    public Room(String name,  String monthlyPrice) {
        this.name = name;
        this.monthlyPrice = monthlyPrice;
    }
}
