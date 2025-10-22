package com.company.noesmo.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "NOESMO_SUB_SYSTEM")
@Entity(name = "noesmo_SubSystem")
public class SubSystem {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @OneToMany(mappedBy = "subSystem")
    private List<AdminSubSystem> adminOrganizations;

    @Column(name = "CODE")
    private String code;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "ALT_NAME")
    private String altName;

    public List<AdminSubSystem> getAdminOrganizations() {
        return adminOrganizations;
    }

    public void setAdminOrganizations(List<AdminSubSystem> adminOrganizations) {
        this.adminOrganizations = adminOrganizations;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAltName() {
        return altName;
    }

    public void setAltName(String altName) {
        this.altName = altName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}