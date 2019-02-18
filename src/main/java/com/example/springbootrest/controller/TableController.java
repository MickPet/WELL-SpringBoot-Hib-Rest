package com.example.springbootrest.controller;

import com.example.springbootrest.entity.Well;
import com.example.springbootrest.service.WellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TableController {

    private WellService wellService;

    @Autowired
    public TableController(WellService wellService) {
        this.wellService = wellService;
    }

    @GetMapping(value = "/api")
    public ResponseEntity<List<Well>> returnAllWells() {
        List<Well> list = wellService.getAllWellsService();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/api/{id}")
    public ResponseEntity<Well> returnWellById(@PathVariable("id") String id) {
        Well well = wellService.getWellByIdService(Long.parseLong(id));
        return ResponseEntity.ok(well);
    }

    @GetMapping(value = "/api/east")
    public ResponseEntity<List<Well>> returnWellsInTheEasternHemisphere() {
        List<Well> list = wellService.getAllWellsInTheEasternHemisphereService();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/api/north")
    public ResponseEntity<List<Well>> returnWellsInTheNorthernHemisphere() {
        List<Well> list = wellService.getAllWellsInTheNorthernHemisphereService();
        return ResponseEntity.ok(list);
    }
}
