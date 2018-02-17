/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.systems;


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
 *Klasa pobierająca systemy informaytczne.
 */
@SpringBootApplication
public class SystemsDemo implements CommandLineRunner
{
    
    public static void main(String[] args) {
		SpringApplication.run(SystemsDemo.class, args);       
	}
    
    @Override
        public void run(String... args) throws Exception
        {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set("APIKey","");
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            String resourceURL = "http://dymek.utp.edu.pl:8097/api/v1/itsystem/all";
            HttpEntity<String> entity = new HttpEntity<String>(headers);
           //ResponseEntity<String> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, String.class);
            ResponseEntity<SystemsLabel[]> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, SystemsLabel[].class);
            if (response.getStatusCode()==HttpStatus.OK){
                for (SystemsLabel systemsLabel :response.getBody())
                {
                    System.out.println(systemsLabel.id+"|"+systemsLabel.name+"|"+systemsLabel.description+"|"+systemsLabel.administratorId+"|"+systemsLabel.administratorName);
                    //DefaultTableModel model= (DefaultTableModel) Tabela.jTable1.getModel();
            
            
                }
            }
            else
                {
            System.out.println("Error");
                }
            }
}

        
    
    
    
    
    
    
    
    
    

