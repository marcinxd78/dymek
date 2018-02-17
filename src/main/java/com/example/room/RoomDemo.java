package com.example.room;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import org.springframework.http.ResponseEntity;
import java.util.Collections;


/**
 *Klasa pobierajaca pokoje.
 */


@SpringBootApplication
public class RoomDemo implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RoomDemo.class, args);
                
	}
        
        @Override
        public void run(String... args) throws Exception
        {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
             //DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
            headers.set("APIKey","");
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            String resourceURL = "http://dymek.utp.edu.pl:8097/api/v1/room/all";
            HttpEntity<String> entity = new HttpEntity<>(headers);
           //ResponseEntity<String> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, String.class);
            ResponseEntity<RoomLabel[]> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, RoomLabel[].class);
            if (response.getStatusCode()==HttpStatus.OK){
                
                for (RoomLabel roomlabel :response.getBody())
                {
                  
                   System.out.println(roomlabel.roomId+"|"+roomlabel.campus+"|"+roomlabel.building+"|"+roomlabel.roomName+"|"+roomlabel.roomType+"|"+roomlabel.cellId+"|"+roomlabel.cellName);
                
                       
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
