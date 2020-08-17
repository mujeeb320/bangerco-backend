package com.example.bangerco.controller;

import com.example.bangerco.model.Vehicle;
import com.example.bangerco.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {
    @Autowired
    private VehicleService service;

    @PostMapping("/addVehicle")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle)
    { return service.saveVehicle(vehicle);}

    @PostMapping("/addVehicles")
    public List<Vehicle> addVehicle(@RequestBody List<Vehicle> vehicles)
    { return service.saveVehicles(vehicles);}

    @GetMapping("/vehicles")
    public List<Vehicle> findAllVehicles() {return service.getVehicles(); }

    @GetMapping("/vehicleById/{id}")
    public Vehicle findVehicleById(@PathVariable int id) {return service.getVehiclesById(id); }

//    @GetMapping("/vehicleByName/{name}")
  //  public Vehicle findVehicleByName(@PathVariable String name) {return service.getVehiclesByName(name); }

    @PutMapping("/update")
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle) {
        return service.updateVehicle(vehicle);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVehicle(@PathVariable int id) {
        return service.deleteVehicle(id);
    }
}
