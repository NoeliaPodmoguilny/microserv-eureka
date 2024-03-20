
package com.miApp.metersConverter.controller;

import com.miApp.metersConverter.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
public class ConverterController {
    
    @Autowired
    private ConverterService convertServ;
    
    @GetMapping("/meters/{meters}")
    public Double converterCentimeters(@PathVariable Double meters){
        return convertServ.converterCentimeters(meters);
    }
    
}
