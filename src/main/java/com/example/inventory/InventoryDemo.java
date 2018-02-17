/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.inventory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import org.springframework.http.ResponseEntity;
import java.util.Collections;
/**
 *
 * @author Mateusz
 */

/**
 *Klasa która pobiera inwentarz.
 */
@SpringBootApplication
public class InventoryDemo {//implements CommandLineRunner {
    
    public static void main(String[] args) {
		SpringApplication.run(InventoryDemo.class, args);       
	}
    
        public void run(String... args) throws Exception
        {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set("APIKey","");
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            String resourceURL = "http://dymek.utp.edu.pl:8097/api/v1/inventory/all";
            HttpEntity<String> entity = new HttpEntity<String>(headers);
           //ResponseEntity<String> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, String.class);
            ResponseEntity<InventoryLabel[]> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, InventoryLabel[].class);
            if (response.getStatusCode()==HttpStatus.OK){
                for (InventoryLabel inventoryLabel :response.getBody())
                {
                    System.out.println(inventoryLabel.inventoryNumber+"|"+inventoryLabel.status+"|"+inventoryLabel.name+"|"+inventoryLabel.description+"|"+inventoryLabel.incomeDate+"|"+inventoryLabel.symbol+"|"+inventoryLabel.vatNumber+"|"+inventoryLabel.unitPrice+"|"+inventoryLabel.incomeNumber+"|"+inventoryLabel.outcomeNumber+"|"+inventoryLabel.incomePrice+"|"+inventoryLabel.outcomePrice+"|"+inventoryLabel.cellId+"|"+inventoryLabel.cellName+"|"+inventoryLabel.employeeId+"|"+inventoryLabel.employeeName);
                    //DefaultTableModel model= (DefaultTableModel) Tabela.jTable1.getModel();
            
            
                }
            }
            else
                {
            System.out.println("Error");
                }
            }
    
    
    
    
    
    
}
