package com.example.demo;

import java.util.ArrayList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import org.springframework.http.ResponseEntity;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/emplo")
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
                
	}
        
        @Override
        public void run(String... args) throws Exception
        {
            ArrayList<AddressLabel> addresses = new ArrayList<AddressLabel>();
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set("APIKey","");
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            String resourceURL = "http://dymek.utp.edu.pl:8097/api/v1/cell/all";
            HttpEntity<String> entity = new HttpEntity<String>(headers);
           //ResponseEntity<String> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, String.class);
            ResponseEntity<AddressLabel[]> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, AddressLabel[].class);
            if (response.getStatusCode()==HttpStatus.OK){
                for (AddressLabel addressLabel :response.getBody())
                {
                   System.out.println(addressLabel.cellId+"|"+addressLabel.cellName+"|"+addressLabel.overridingCellId+"|"+addressLabel.overridingCellName);
                  //addresses.add(addressLabel);
                }
                
                //System.out.println(addresses.get(1).cellId);
            }
            else
            {
            System.out.println("Error");
        }
        }
}
