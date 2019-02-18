package com.example.springbootrest.dao;

import com.example.springbootrest.entity.Well;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class WellDaoImpl implements WellDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Well> getAllWells() {
        List<Well> list = entityManager.createQuery("SELECT w FROM Well w").getResultList();
        return list;
    }

    @Override
    public Well getWellById(long id) {
        Query query = entityManager.createQuery("SELECT w FROM Well w WHERE w.id = ?1");
        query.setParameter(1, id);
        Well well = (Well) query.getSingleResult();
        return well;
    }

    @Override
    public List<Well> getAllWellsInTheEasternHemisphere() {
        List<Well> list = entityManager.createQuery("SELECT w FROM Well w WHERE w.longitude BETWEEN 65 AND 150" +
                "AND w.latitude BETWEEN 40 AND 80")
                .getResultList();
        return list;
    }

    @Override
    public List<Well> getAllWellsInTheNorthernHemisphere() {
        List<Well> list = entityManager.createQuery("SELECT w FROM Well w WHERE w.longitude BETWEEN 0 AND 180" +
                "AND w.latitude BETWEEN 0 AND 90")
                .getResultList();
        return list;
    }
}
