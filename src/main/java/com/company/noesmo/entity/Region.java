package com.company.noesmo.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "NOESMO_REGION")
@Entity(name = "noesmo_Region")
public class Region {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Composition
    @OneToMany(mappedBy = "region")
    private List<RegionArea> regionAreas;

    @Composition
    @OneToMany(mappedBy = "region")
    private List<AdminOrganization> adminOrganizations;

    @Column(name = "REGION_ID")
    private Integer regionId;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "CLASSIFIED")
    private Integer classified;

    @Column(name = "ROW_STATUS")
    private Integer rowStatus;

    @Column(name = "CODE")
    private String code;

    @Column(name = "DMED_ID")
    private String dmedId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<AdminOrganization> getAdminOrganizations() {
        return adminOrganizations;
    }

    public void setAdminOrganizations(List<AdminOrganization> adminOrganizations) {
        this.adminOrganizations = adminOrganizations;
    }

    public List<RegionArea> getRegionAreas() {
        return regionAreas;
    }

    public void setRegionAreas(List<RegionArea> regionAreas) {
        this.regionAreas = regionAreas;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassified() {
        return classified;
    }

    public void setClassified(Integer classified) {
        this.classified = classified;
    }

    public Integer getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(Integer rowStatus) {
        this.rowStatus = rowStatus;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDmedId() {
        return dmedId;
    }

    public void setDmedId(String dmedId) {
        this.dmedId = dmedId;
    }
}