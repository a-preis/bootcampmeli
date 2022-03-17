package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import static com.example.demo.NumerosRomanos.converterEmRomanos;


@Controller
public class MyController {

    @GetMapping("/romanos")
    @ResponseBody
    public String transformaParaRomano(@RequestParam String tipo) {
        int decimal = Integer.parseInt(tipo);
        return converterEmRomanos(decimal);
    }
}
