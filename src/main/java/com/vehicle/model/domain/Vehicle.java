package com.vehicle.model.domain;

import com.vehicle.model.dto.User;

import javax.persistence.*;

@Entity
public class Vehicle {
    @Id
    String vehicleId;

    @Column(name = "VehicleName")
    String vehicleName;

    User userDetails;

    public Vehicle(){}

    public Vehicle(String vehicleId, String vehicleName) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                '}';
    }
}
