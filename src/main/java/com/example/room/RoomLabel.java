/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.room;


import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *
 * @author Mateusz
 */

/**
 *Klasa przetwarzająca nagłowki z REST.
 */
public class RoomLabel {
   
    @JsonProperty("roomId")
    public String roomId;
    @JsonProperty("campus")
    public String campus;
    @JsonProperty("building")
    public String building;
    @JsonProperty("roomName")
    public String roomName;
    @JsonProperty("roomType")
    public String roomType;
    @JsonProperty("cellId")
    public String cellId;
    @JsonProperty("cellName")
    public String cellName;
}
