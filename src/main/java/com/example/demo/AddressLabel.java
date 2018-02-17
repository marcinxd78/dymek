/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *
 * @author Mateusz
 */

/**
 *Klasa przetwarzająca nagłowki z REST.
 */
public class AddressLabel {
    @JsonProperty("cellId")
    public long cellId;
    @JsonProperty("cellName")
    public String cellName;
    @JsonProperty("overridingCellId")
    public long overridingCellId;
    @JsonProperty("overridingCellName")
    public String overridingCellName;
}
