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
@Table(name = "\"MetaLink\"")
public class MetaLink extends BaseTzEntity {
    @Column(name = "principle_type")
    private String principleType;

    @Column(name = "principle_id")
    private UUID principleId;

    @Column()
    private String name;

    public MetaLink() { }

    public MetaLink(String name, String principleType, UUID principleId) {
        this.name = name;
        this.principleId = principleId;
        this.principleType = principleType;
    }
}
