package br.com.adote.controller;

import br.com.adote.domain.ResponseTeste;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AdoteController {


    @GetMapping(value = "/adote")
    public ResponseEntity adote() {
        var response = new ResponseTeste("Adote funciona");
        return ResponseEntity.ok(response);
    }

}
