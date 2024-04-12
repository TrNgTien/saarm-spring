package com.trngtien.saarm_be.models;

import com.trngtien.saarm_be.base.BaseTzEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "\"User\"")
@Data
public class User extends BaseTzEntity {
    @Column()
    private String username;

    @Column()
    private String password;

    @Column()
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "last_login_at", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime lastLoginAt;

    @Column()
    private String status;


    public User() {
    }

    public User(String username, String email, String firstName, String lastName, LocalDateTime lastLoginAt, String status) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastLoginAt = lastLoginAt;
        this.status = status;
    }

}
