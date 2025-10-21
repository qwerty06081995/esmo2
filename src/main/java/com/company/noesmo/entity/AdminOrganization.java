package com.company.noesmo.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

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

    @Column(name = "PARENT_ID")
    private UUID parentId;

    @Column(name = "ORG_NAME")
    private String orgName;

    @Column(name = "ORG_NAME_SHORT")
    private String orgNameShort;

    @JoinColumn(name = "REGION_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Region region;

    @JoinColumn(name = "REGION_AREA_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private RegionArea regionArea;



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