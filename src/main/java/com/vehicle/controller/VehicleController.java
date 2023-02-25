package com.vehicle.controller;

import com.vehicle.model.domain.Vehicle;
import com.vehicle.service.VehicleRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleRegistrationService vehicleRegistrationService;

    String basePath="C:\\Users\\krish\\Desktop\\Rentler\\";

    @RequestMapping(value = "/addVehicle", method = RequestMethod.POST)
    public String addVehicle(@RequestBody Vehicle vehicle){
        try{
            vehicleRegistrationService.addVehicle(vehicle);
            return vehicle.toString() +"\nadded success";
        }
        catch (Exception e){
            return "Error in adding vehicle :"+e.getMessage();
        }
    }

    @RequestMapping(value = "/getAllVehicles", method = RequestMethod.POST)
    public List<Vehicle> getAllVehicles(){
        try{
            return vehicleRegistrationService.getAllVehicles();
        }
        catch (Exception e){
            return null;
        }
    }

    @RequestMapping(value = "/getVehicle", method = RequestMethod.GET)
    public Vehicle getVehicle(@RequestParam int id){
        try{
            return vehicleRegistrationService.getVehicleById(id);
        }
        catch (Exception e){
            return null;
        }
    }
    
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        String filename = file.getOriginalFilename();
        Path filepath = Paths.get(basePath + filename);
        try {
            Files.createDirectories(filepath.getParent());
            file.transferTo(filepath);
            return "File uploaded successfully "+filename;
        } catch (IOException e) {
            e.printStackTrace();
            return "Failed to upload file";
        }
    }

    @RequestMapping(value = "/getImage", method = RequestMethod.GET)
    public ResponseEntity<byte[]> getImage(@RequestParam("imageName") String imageName) throws IOException {
        System.out.println("Got image name to retrive "+imageName);
        String pathname=basePath+imageName;
        System.out.println(pathname+" created");
        File file = new File(pathname);
        byte[] bytes = Files.readAllBytes(file.toPath());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        return new ResponseEntity<>(bytes, headers, HttpStatus.OK);
    }
    /*TODO
     * Currently front end not able to handle the byte[] received
     * For now Get Mapping is used but need to change this to POST Mapping
     * And also handle the byte[] to display image
     * */
}
