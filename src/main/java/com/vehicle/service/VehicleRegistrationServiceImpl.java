package com.vehicle.service;

import com.vehicle.model.domain.Vehicle;
import com.vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VehicleRegistrationServiceImpl implements VehicleRegistrationService {

    @Autowired
    VehicleRepository vehicleRepository;

    /**
     * @param vehicle
     * @return
     */
    @Override
    public boolean addVehicle(Vehicle vehicle) {
        try{
            vehicleRepository.save(vehicle);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    /**
     * @return
     */
    @Override
    public List<Vehicle> getAllVehicles() {
        try{
            return vehicleRepository.findAll();
        }
        catch (Exception e){
            return null;
        }
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Vehicle getVehicleById(String id) {
        try{
            return vehicleRepository.findById(id).get();
        }
        catch (Exception e){
            return null;
        }
    }

    /**
     * @param vehicleName
     * @return
     */
    @Override
    public Vehicle getVehicleByName(String vehicleName) {
        return null;
    }
}
