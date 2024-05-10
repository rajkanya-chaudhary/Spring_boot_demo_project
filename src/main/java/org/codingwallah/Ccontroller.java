package org.codingwallah;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class Ccontroller {
    @GetMapping("/get")
    public String doGet() {
        return "hello i am dimpal chaudhary this is a first deno project";
    }
    @PostMapping("/get")
    public String dopost() {
        return "hello i am dimpal chaudhary this is a first deno project";
    }
    
     
}
