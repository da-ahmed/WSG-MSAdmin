/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.worldsoft.MSAdmin.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author barkouti
 */

@Entity
@Table(name="vehicle")
public class Vehicle implements Serializable{
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long   id_vehicle ;
    @Column(unique=true)
    private String immatricule;
    private String model;
    private String contact_Info;
    @ManyToOne
    @JoinColumn(name = "id_categorie")
    private VehicleCategorie vehiculeCategorie;

    public Vehicle() {
    }

    
    
    
   

    public Vehicle(Long id_vehicle, String immatricule, String model, String contact_Info, VehicleCategorie vehiculeCategorie) {
        this.id_vehicle = id_vehicle;
        this.immatricule = immatricule;
        this.model = model;
        this.contact_Info = contact_Info;
        this.vehiculeCategorie = vehiculeCategorie;
    }

    public Long getId_vehicle() {
        return id_vehicle;
    }

    public void setId_vehicle(Long id_vehicle) {
        this.id_vehicle = id_vehicle;
    }

    
    public String getImmatricule() {
        return immatricule;
    }

    public void setImmatricule(String immatricule) {
        this.immatricule = immatricule;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getContact_Info() {
        return contact_Info;
    }

    public void setContact_Info(String Contact_Info) {
        this.contact_Info = Contact_Info;
    }

    public VehicleCategorie getVehiculeCategorie() {
        return vehiculeCategorie;
    }

    public void setVehiculeCategorie(VehicleCategorie vehiculeCategorie) {
        this.vehiculeCategorie = vehiculeCategorie;
    }

   

  
  
    

   
    
    
}
