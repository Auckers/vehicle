package com.vehicle.service;

import com.vehicle.model.domain.Vehicle;

import java.util.List;

public interface VehicleRegistrationService {
    public boolean addVehicle(Vehicle vehicle);
    public List<Vehicle> getAllVehicles();
    public Vehicle getVehicleById(String id);
    public Vehicle getVehicleByName(String vehicleName);
}
