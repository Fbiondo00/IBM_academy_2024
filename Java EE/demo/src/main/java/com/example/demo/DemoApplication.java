package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


class Contatore {
    static int contatore = 0;

    Contatore() {
        contatore++;
    }
}

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Contatore c1 = new Contatore();
        Contatore c2 = new Contatore();
        Contatore c3 = new Contatore();
        System.out.println(Contatore.contatore); // Output: 3
    }

}
