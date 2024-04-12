package com.trngtien.saarm_be.base;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import java.util.UUID;

@MappedSuperclass
@Data
public abstract class BaseIdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @ColumnDefault("uuid_generate_v4()")
    private UUID id;

    public BaseIdEntity() {}

    public BaseIdEntity(UUID id) {
        this.id = id;
    }
}
