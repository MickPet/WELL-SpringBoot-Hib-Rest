package com.example.springbootrest.service;

import com.example.springbootrest.dao.WellDao;
import com.example.springbootrest.entity.Well;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WellServiceImpl implements WellService {

    private WellDao wellDao;

    @Autowired
    public WellServiceImpl(WellDao wellDao) {
        this.wellDao = wellDao;
    }

    @Override
    public List<Well> getAllWellsService() {
        return wellDao.getAllWells();
    }

    @Override
    public Well getWellByIdService(long id) {
        return wellDao.getWellById(id);
    }

    @Override
    public List<Well> getAllWellsInTheEasternHemisphereService() {
        return wellDao.getAllWellsInTheEasternHemisphere();
    }

    @Override
    public List<Well> getAllWellsInTheNorthernHemisphereService() {
        return wellDao.getAllWellsInTheNorthernHemisphere();
    }
}
