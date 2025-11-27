package com.example.examADFD.Controller;

import com.example.examADFD.model.Place;
import com.example.examADFD.Service.PlaceService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/place")
@CrossOrigin("*")
public class PlaceController {

    private final PlaceService service;

    public PlaceController(PlaceService service) {
        this.service = service;
    }

    @GetMapping("/getAllPlace")
    public List<Place> getAllPlace() {
        return service.getAllPlace();
    }
}
