package com.example.springbootrest.dao;

import com.example.springbootrest.entity.Well;

import java.util.List;

public interface WellDao {

    List<Well> getAllWells();

    Well getWellById(long id);

    List<Well> getAllWellsInTheEasternHemisphere();

    List<Well> getAllWellsInTheNorthernHemisphere();
}
