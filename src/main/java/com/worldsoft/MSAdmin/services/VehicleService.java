package com.worldsoft.MSAdmin.services;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.worldsoft.MSAdmin.dao.VehicleRepository;
import com.worldsoft.MSAdmin.entities.Vehicle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author barkouti
 */
@Service 
public class VehicleService {
    @Autowired
	VehicleRepository vehicleRepository;
    

  public Vehicle save(Vehicle vehicle)
    { 
      return vehicleRepository.saveAndFlush(vehicle);
    }
  public Vehicle update(Vehicle vehicle)
  
  {
     return vehicleRepository.save(vehicle);
  }
  
  public Vehicle find(int immatricule) {
        return vehicleRepository.findOneByImmatricule(immatricule);
  
  }
  public Vehicle find(Long id_vehicle) {
		return vehicleRepository.findById(id_vehicle).get();
	}
  
  public List<Vehicle> findAll ()
  {
      return vehicleRepository.findAll();
  }
  
  public void delete(Vehicle vehicle)
  {
     vehicleRepository.delete(vehicle);
  }
}
