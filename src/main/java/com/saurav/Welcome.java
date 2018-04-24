package com.saurav;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class Welcome {

//    @RequestMapping("/")
//    @ResponseBody
//    String home() {
//        return "Hello World!";
//    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Welcome.class, args);
    }
}