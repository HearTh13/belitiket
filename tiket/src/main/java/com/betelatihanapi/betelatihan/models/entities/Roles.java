package com.betelatihanapi.betelatihan.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;  

    @Column(name = "role_name", nullable = false)
    private String roleName;  
    
    @Column(name = "role_description", nullable = false)
    private String roleDescription; 

    // Tambahkan getter dan setter
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
}
