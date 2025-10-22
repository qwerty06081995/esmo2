package com.company.noesmo.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "NOESMO_REGION_AREA", indexes = {
        @Index(name = "IDX_NOESMO_REGION_AREA_REGION", columnList = "REGION_ID")
})
@Entity(name = "noesmo_RegionArea")
public class RegionArea {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @OneToMany(mappedBy = "regionArea")
    private List<AdminOrganization> adminOrganizations;

    @Column(name = "REGION_AREA_ID")
    private Integer regionAreaId;

    @JoinColumn(name = "REGION_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Region region;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "CLASSIFIED")
    private Integer classified;

    @Column(name = "ROW_STATUS")
    private Integer rowStatus;

    @Column(name = "DMED_ID")
    private String dmedId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region regions) {
        this.region = regions;
    }

    public Integer getRegionAreaId() {
        return regionAreaId;
    }

    public void setRegionAreaId(Integer regionAreaId) {
        this.regionAreaId = regionAreaId;
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

    public String getDmedId() {
        return dmedId;
    }

    public void setDmedId(String dmedId) {
        this.dmedId = dmedId;
    }

    public List<AdminOrganization> getAdminOrganizations() {
        return adminOrganizations;
    }

    public void setAdminOrganizations(List<AdminOrganization> adminOrganizations) {
        this.adminOrganizations = adminOrganizations;
    }
}