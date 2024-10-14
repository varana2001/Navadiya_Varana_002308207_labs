/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package model;

/**
 *
 * @author varananavadiya
 */
public class Feature {
    private Product owner;
    private String name;
    private Object value;
    
    public Feature (Product owner) {
        this.owner = owner;
    }

    public Feature(Product owner, String name, Object value) {
        this.owner = owner;  // Missing assignment fixed here
        this.name = name;
        this.value = value;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
