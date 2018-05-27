/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.worldsoft.MSAdmin.dao;

import com.worldsoft.MSAdmin.entities.VehicleCategorie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author barkouti
 */
public interface VehicleCategorieRepository extends JpaRepository<VehicleCategorie, Long> {
    
}
