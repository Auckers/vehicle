package com.vehicle.model.domain;

import com.vehicle.model.dto.VehicleDetails;

import javax.persistence.*;

@Entity
public class Vehicle {
    @Id
    int vehicleId;

//    VehicleDetails vehicleDetails;
    String vehicleCurrentAddress;

    @ManyToOne
    @JoinColumn(name = "user_id")
    Owner ownerDetails;

    String imageName;

    public Vehicle() {}

    public Vehicle(int vehicleId, /*VehicleDetails vehicleDetails,*/ String vehicleCurrentAddress, String imageName) {
        this.vehicleId = vehicleId;
//        this.vehicleDetails = vehicleDetails;
        this.vehicleCurrentAddress = vehicleCurrentAddress;
        this.imageName=imageName;
    }

    public int getVehicleId() {
        return vehicleId;
    }

//    public VehicleDetails getVehicleDetails() {
//        return vehicleDetails;
//    }

    public String getVehicleCurrentAddress() {
        return vehicleCurrentAddress;
    }

    public Owner getOwnerDetails() {
        return ownerDetails;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
