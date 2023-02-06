package com.vehicle.model.dto;

import javax.persistence.Embeddable;

@Embeddable
public class VehicleDetails {

    String vehicleNumber;

    String vehicleName;

    String vehicleMainAddress;

    String enginePower;

    VehicleType type;

    Color color;

    public VehicleDetails(String vehicleNumber, String vehicleName, String vehicleMainAddress, String enginePower, VehicleType type, Color color) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleName = vehicleName;
        this.vehicleMainAddress = vehicleMainAddress;
        this.enginePower = enginePower;
        this.type = type;
        this.color = color;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getVehicleMainAddress() {
        return vehicleMainAddress;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public VehicleType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }
}
