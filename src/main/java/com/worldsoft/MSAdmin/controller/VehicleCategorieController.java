/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.worldsoft.MSAdmin.controller;

import com.worldsoft.MSAdmin.entities.VehicleCategorie;
import com.worldsoft.MSAdmin.services.VehicleCategorieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author barkouti
 */
@RestController
@RequestMapping("categorie")
public class VehicleCategorieController {
    
     @Autowired
    private VehicleCategorieService vehicleCategorieService;
    
     
     @RequestMapping(value = "/liste", method = RequestMethod.GET)
    public List<VehicleCategorie> vehiclesCategorie()
       {
        return vehicleCategorieService.findAll(); 
       }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public VehicleCategorie addcategorie (@RequestBody VehicleCategorie c  )
    {
      return vehicleCategorieService.save(c) ;  
    }
}
