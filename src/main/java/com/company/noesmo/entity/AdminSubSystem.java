package com.company.noesmo.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "NOESMO_ADMIN_SUB_SYSTEM")
@Entity(name = "noesmo_AdminSubSystem")
public class AdminSubSystem {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADMIN_ORGANIZATION_ID")
    private AdminOrganization adminOrganization;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUB_SYSTEM_ID")
    private SubSystem subSystem;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public AdminOrganization getAdminOrganization() {
        return adminOrganization;
    }

    public void setAdminOrganization(AdminOrganization adminOrganization) {
        this.adminOrganization = adminOrganization;
    }

    public SubSystem getSubSystem() {
        return subSystem;
    }

    public void setSubSystem(SubSystem subSystem) {
        this.subSystem = subSystem;
    }

}