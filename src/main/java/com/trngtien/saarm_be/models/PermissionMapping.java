package com.trngtien.saarm_be.models;

import com.trngtien.saarm_be.base.BaseTzEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "\"PermissionMapping\"")
@Data
public class PermissionMapping extends BaseTzEntity {
    @Column(name = "permission_id")
    private UUID permissionId;

    @Column(name = "role_id")
    private UUID roleId;

    public PermissionMapping() {
    }

    public PermissionMapping(UUID roleId, UUID permissionId) {
        this.roleId = roleId;
        this.permissionId = permissionId;
    }
}
