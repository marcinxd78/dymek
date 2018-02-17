/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.usersdemo;
import com.example.usersdemo.usersLabel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import org.springframework.http.ResponseEntity;
import java.util.Collections;
/**
 *
 * @author Marcin
 */

/**
 *Klasa umożliwiająca pobranie uzytkowników.
 */
@SpringBootApplication
public class UsersDemo implements CommandLineRunner{

	public static void main(String[] args) {
	         	
            SpringApplication.run(UsersDemo.class, args);
                   

	}
        
        @Override
        public void run(String... args) throws Exception
        {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
             //DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
            headers.set("APIKey","");
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            String resourceURL = "http://dymek.utp.edu.pl:8097/api/v1/employee/all";
            HttpEntity<String> entity = new HttpEntity<>(headers);
          // ResponseEntity<String> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, String.class);
            ResponseEntity<usersLabel[]> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, usersLabel[].class);
            if (response.getStatusCode()==HttpStatus.OK){
                
                for (usersLabel usersLabel :response.getBody())
                {
                   System.out.println( usersLabel.login+"|"+usersLabel.name+"|"+usersLabel.degree+"|"+usersLabel.employeeId+"|"+usersLabel.workplace+"|"+usersLabel.function+"|"+usersLabel.email+"|"+usersLabel.departmentName+"|"+usersLabel.cellId+"|"+usersLabel.cellName+"|"+usersLabel.isManager+"|"+usersLabel.roomId+"|"+usersLabel.isAsi);
                  
                       
               //  model.addRow(new Object[]{addressLabel.cellId});
               
                }
                
                //System.out.println(response);
            }
            else
            {
            System.out.println("Error");
        }
        }
}