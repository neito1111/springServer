package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @PostMapping("/grades")
    public ResponseEntity<Double> Average(@RequestBody List<Integer> rating){

        double Avarege= rating.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        return ResponseEntity.status(HttpStatus.OK).body(Avarege);

    }
}
