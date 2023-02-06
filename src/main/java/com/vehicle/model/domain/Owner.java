package com.vehicle.model.domain;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Owner {
    @Id
    String userId;

    @OneToMany(mappedBy = "ownerDetails", cascade = CascadeType.ALL)
    Set<Vehicle> vehicle;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date")
    private Date modifyDate;

    public Owner(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public Set<Vehicle> getVehicle() {
        return vehicle;
    }
}
