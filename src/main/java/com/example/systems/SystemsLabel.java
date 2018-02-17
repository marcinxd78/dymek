/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.systems;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Mateusz
 */

/**
 *Klasa przetwarzająca nagłowki z REST.
 */
public class SystemsLabel {
    @JsonProperty("id")
    public int id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("description")
    public String description;
    @JsonProperty("administratorId")
    public int administratorId;
    @JsonProperty("administratorName")
    public String administratorName;
}
