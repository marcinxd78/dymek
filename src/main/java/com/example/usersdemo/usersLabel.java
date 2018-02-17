
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.example.usersdemo;
import com.fasterxml.jackson.annotation.JsonProperty;




/**
 *
 * @author Marcin
 */

/**
 *Klasa przetwarzająca nagłowki z REST.
 */
public class usersLabel {
    @JsonProperty("login")
    public String login;
    @JsonProperty("name")
    public String name; 
    @JsonProperty("degree")
    public String degree;
    @JsonProperty("employeeId")
    public String employeeId;
    @JsonProperty("workplace")
    public String workplace;
    @JsonProperty("function")
    public String function;
    @JsonProperty("email")
    public String email;
    @JsonProperty("departmentName")
    public String departmentName;
    @JsonProperty("celllId")
    public String cellId;
    @JsonProperty("cellName")
    public String cellName;
    @JsonProperty("isManager")
    public String isManager;
    @JsonProperty("roomId")
    public String roomId;
    @JsonProperty("isAsi")
    public String isAsi;
    
}
