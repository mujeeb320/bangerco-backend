package com.example.bangerco.service;

import com.example.bangerco.model.Vehicle;
import com.example.bangerco.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VehicleService {
    @Autowired

    private VehicleRepository repository;

    public Vehicle saveVehicle(Vehicle vehicle){ return repository.save(vehicle); }

    public List<Vehicle> saveVehicles(List<Vehicle> vehicles){ return repository.saveAll(vehicles); }

    public List<Vehicle> getVehicles() { return repository.findAll(); }

    public Vehicle getVehiclesById(int id) { return repository.findById(id).orElse(null);}

//    public Vehicle getVehiclesByName(String name) { return repository.;}


    public String deleteVehicle(int id) {
        repository.deleteById(id);
        return "Product " + id +" Is Removed ! " ;
    }

    public Vehicle updateVehicle(Vehicle vehicle) {
        Vehicle existingProduct = repository.findById(vehicle.getVehicleId()).orElse(null);
        existingProduct.setVehicleName(vehicle.getVehicleName());
        existingProduct.setCategory(vehicle.getCategory());
        existingProduct.setFuelType(vehicle.getFuelType());
        existingProduct.setTransmissionType(vehicle.getTransmissionType());

        return repository.save(existingProduct);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Vehicle " + id+"  Removed !" ;
    }
}
