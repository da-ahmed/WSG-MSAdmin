/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.worldsoft.MSAdmin.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author barkouti
 */
@Entity
@Table(name="VehicleCategorie")

public class VehicleCategorie implements Serializable {
  
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long   id_categorie;
    private String type;
    private int    min_passengers;
    private int    max_passengers;
    private int    max_luggage;

    public VehicleCategorie() {
    }

    public VehicleCategorie(String Type, int Min_passengers, int Max_passengers, int Max_luggage) {
        this.type = Type;
        this.min_passengers = Min_passengers;
        this.max_passengers = Max_passengers;
        this.max_luggage = Max_luggage;
    }

    public long getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(long id_categorie) {
        this.id_categorie = id_categorie;
    }

    
    
    
    public String getType() {
        return type;
    }

    public void setType(String Type) {
        this.type = Type;
    }

    public int getMin_passengers() {
        return min_passengers;
    }

    public void setMin_passengers(int Min_passengers) {
        this.min_passengers = Min_passengers;
    }

    public int getMax_passengers() {
        return max_passengers;
    }

    public void setMax_passengers(int Max_passengers) {
        this.max_passengers = Max_passengers;
    }

    public int getMax_luggage() {
        return max_luggage;
    }

    public void setMax_luggage(int Max_luggage) {
        this.max_luggage = Max_luggage;
    }
    
    
    
    
}
