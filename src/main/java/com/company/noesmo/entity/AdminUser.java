package com.company.noesmo.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@JmixEntity
@Entity(name = "noesmo_AdminUser")
public class AdminUser extends User {
    @Column(name = "PATRONYMIC")
    private String patronymic;

    @Column(name = "ROW_STATUS")
    private Integer rowStatus;

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Integer getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(Integer rowStatus) {
        this.rowStatus = rowStatus;
    }
}