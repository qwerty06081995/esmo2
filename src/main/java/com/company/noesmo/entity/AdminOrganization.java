package com.company.noesmo.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "NOESMO_ADMIN_ORGANIZATION", indexes = {
        @Index(name = "IDX_NOESMO_ADMIN_ORGANIZATION_REGION", columnList = "REGION_ID"),
        @Index(name = "IDX_NOESMO_ADMIN_ORGANIZATION_REGION_AREA", columnList = "REGION_AREA_ID")
})
@Entity(name = "noesmo_AdminOrganization")
public class AdminOrganization {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @OneToMany(mappedBy = "adminOrganization")
    private List<AdminSubSystem> subSystems;

    @Column(name = "PARENT_ID")
    private UUID parentId;

    @Column(name = "ORG_NAME")
    private String orgName;

    @InstanceName
    @Column(name = "ORG_NAME_SHORT")
    private String orgNameShort;

    @JoinColumn(name = "REGION_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Region region;

    @JoinColumn(name = "REGION_AREA_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private RegionArea regionArea;

    @Column(name = "ROW_STATUS")
    private Integer rowStatus;

    public UUID getParentId() {
        return parentId;
    }

    public void setParentId(UUID parentId) {
        this.parentId = parentId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgNameShort() {
        return orgNameShort;
    }

    public void setOrgNameShort(String orgNameShort) {
        this.orgNameShort = orgNameShort;
    }

    public Integer getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(Integer rowStatus) {
        this.rowStatus = rowStatus;
    }

    public List<AdminSubSystem> getSubSystems() {
        return subSystems;
    }

    public void setSubSystems(List<AdminSubSystem> subSystems) {
        this.subSystems = subSystems;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public RegionArea getRegionArea() {
        return regionArea;
    }

    public void setRegionArea(RegionArea regionArea) {
        this.regionArea = regionArea;
    }

}