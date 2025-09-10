package com.Kohaku.EulerSpring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @Autowired
    private Euler8 euler8;
    @Autowired
    private Euler7 euler7;
    @Autowired
    private Euler6 euler6;


    @GetMapping(value="/euler6/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> euler6(){
        System.out.println(euler6.sumSquareDifference());
        return ResponseEntity.ok(euler6.sumSquareDifference());
    }
    @GetMapping(value="/euler7/{euler}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> test(@PathVariable(value = "euler") int euler){
        System.out.println(euler7.getPrimeNumber(euler));
        return ResponseEntity.ok(euler7.getPrimeNumber(euler));
    }
    @GetMapping(value="/euler8/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> euler8(){
        System.out.println(euler8.getLargestProduct());
        return ResponseEntity.ok(euler8.getLargestProduct());
    }





}
