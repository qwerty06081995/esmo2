package com.company.noesmo.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;

@JmixEntity
@Entity(name = "noesmo_AdminUser")
public class AdminUser extends User {
}