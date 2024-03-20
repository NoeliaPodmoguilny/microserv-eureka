
package com.miApp.metersConverter.service;

import org.springframework.stereotype.Service;

@Service
public class ConverterService {

    public Double converterCentimeters(Double meters) {
        return  meters*100;
    }
    
}
