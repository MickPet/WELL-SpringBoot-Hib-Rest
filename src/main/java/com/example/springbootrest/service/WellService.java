package com.example.springbootrest.service;

import com.example.springbootrest.entity.Well;

import java.util.List;

public interface WellService {

    List<Well> getAllWellsService();

    Well getWellByIdService(long id);

    List<Well> getAllWellsInTheEasternHemisphereService();

    List<Well> getAllWellsInTheNorthernHemisphereService();
}
