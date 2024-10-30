package yj.nginx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class Controller {


    @GetMapping
    public ResponseEntity<?> test(){

        log.info("this server run ");
        return ResponseEntity.ok("GOOD");
    }


    @RequestMapping("/ts")
    public ResponseEntity<?> test2(@ModelAttribute Test test){
        log.info("Test={}",test.getIntval());
        log.info("Test={}",test.getStrval());
        log.info("this server run ");
        return ResponseEntity.ok("GOOD");
    }

}
