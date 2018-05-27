/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.worldsoft.MSAdmin.controller;

import com.worldsoft.MSAdmin.entities.Vehicle;
import com.worldsoft.MSAdmin.services.VehicleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author barkouti
 */
@RestController
@RequestMapping("vehicle")
public class VehicleController {
    
    
    @Autowired
    private VehicleService vehicleservice;
    
    
    @RequestMapping(value = "/liste", method = RequestMethod.GET)
    public List<Vehicle> vehicles()
       {
        return vehicleservice.findAll(); 
       }
    
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Vehicle addvehicle(@RequestBody Vehicle c  )
    {
      return vehicleservice.save(c) ;  
    }
    
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void deletevehicule(@RequestBody Vehicle c  )
    {
     vehicleservice.delete(c);
    }
           
      @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Vehicle up(@RequestBody Vehicle c   )
    {
      return vehicleservice.update(c);
    }
}
