/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.inventory;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *
 * @author Mateusz
 */

/**
 *Klasa przetwarzająca nagłowki z REST.
 */
public class InventoryLabel {
    @JsonProperty("inventoryNumber")
    public String inventoryNumber;
    @JsonProperty("status")
    public String status;
    @JsonProperty("name")
    public String name;
    @JsonProperty("description")
    public String description;
    @JsonProperty("incomeDate")
    public String incomeDate;
    @JsonProperty("symbol")
    public String symbol;
    @JsonProperty("vatNumber")
    public String vatNumber;
    @JsonProperty("unitPrice")
    public float unitPrice;
    @JsonProperty("incomeNumber")
    public int incomeNumber;
    @JsonProperty("outcomeNumber")
    public int outcomeNumber;   
    @JsonProperty("incomePrice")
    public float incomePrice; 
    @JsonProperty("outcomePrice")
    public float outcomePrice;   
    @JsonProperty("cellId")
    public long cellId;    
    @JsonProperty("cellName")
    public String cellName; 
    @JsonProperty("employeeId")
    public int employeeId;    
    @JsonProperty("employeeName")
    public String employeeName;   
}
