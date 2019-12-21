package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public void progress() {
        doPerate(30, n->{
            System.out.println(30 + n);
            System.out.println(this);
        });
    }
    public static void main(String[] args) {
        int b = 90;
        DemoApplication.doPerate(b, n->{
            System.out.println(b + n);
            //System.out.println(this);
        });
        new DemoApplication().progress();
    }

    private static void doPerate(int i, Operation o) {
        o.operate(i);
    }
}
