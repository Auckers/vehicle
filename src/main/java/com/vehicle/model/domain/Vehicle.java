package com.vehicle.model.domain;

import com.vehicle.model.dto.VehicleDetails;

import javax.persistence.*;

@Entity
public class Vehicle {
    @Id
    int vehicleId;

    VehicleDetails vehicleDetails;
    String vehicleCurrentAddress;

    @ManyToOne
    @JoinColumn(name = "user_id")
    Owner ownerDetails;

    public Vehicle() {}

    public Vehicle(int vehicleId, VehicleDetails vehicleDetails, String vehicleCurrentAddress) {
        this.vehicleId = vehicleId;
        this.vehicleDetails = vehicleDetails;
        this.vehicleCurrentAddress = vehicleCurrentAddress;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public VehicleDetails getVehicleDetails() {
        return vehicleDetails;
    }

    public String getVehicleCurrentAddress() {
        return vehicleCurrentAddress;
    }

    public Owner getOwnerDetails() {
        return ownerDetails;
    }
}
