/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

import java.util.ArrayList;
import model.Feature;

/**
 *
 * @author  varananavadiya
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ArrayList<Feature> features;
    
    private static int count = 0;
    
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.features = new ArrayList<>(); 
   }

    public Product() {
        count++;
        id = count;
        
        features = new ArrayList<Feature>();
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    // Method to get the list of features
    public ArrayList<Feature> getFeatures() {
        return features;
    }

    // Method to add a new feature to the product and return the feature object
    public Feature addNewFeature() {
        Feature newFeature = new Feature(this);  // Create a new feature with the product as its owner
        features.add(newFeature);  // Add the new feature to the list
        return newFeature;  // Return the new feature object
    }

    
    @Override
    public String toString() {
        return name;
    }
}
