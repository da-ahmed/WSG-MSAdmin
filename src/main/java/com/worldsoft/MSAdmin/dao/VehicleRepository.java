/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.worldsoft.MSAdmin.dao;

import com.worldsoft.MSAdmin.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author barkouti
 */
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
    
    public Vehicle findOneByImmatricule(int immatricule);
}
