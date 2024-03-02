package com.restapi.crud;

import com.restapi.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiCrudExampleApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository repository;

    public static void main(String[] args) {

        System.out.println("Started...");
        SpringApplication.run(RestApiCrudExampleApplication.class, args);
        System.out.println("hello 27 Jan");
        System.out.println("End...");
        int port = 8080;
        System.out.println("running on port : " + port);
        System.out.println("-------------------------------------------------------------");

    }

    // there we can add data to my app :
    @Override
    public void run(String... args) throws Exception {
        // data inserting :-
   /*     Product product1 = new Product(1, "Earphone", 10, 4000);
        repository.save(product1);
        Product product2 = new Product(2, "Mobile", 3, 67000);
        repository.save(product2);
        Product product3 = new Product(3, "Charger", 5, 3000);
        repository.save(product3);
*/

        System.out.println("Student Updated...");
    }
}
