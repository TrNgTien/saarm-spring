package com.trngtien.saarm_be.models;

import com.trngtien.saarm_be.base.BaseTzEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Data
@Table(name = "\"UserRole\"")
public class UserRole extends BaseTzEntity {
    @Column()
    private String name;

    @Column()
    @ColumnDefault("100_ACTIVATED")
    private String status;

    public UserRole() {
    }

    public UserRole(String name, String status) {
        this.name = name;
        this.status = status;
    }
}
