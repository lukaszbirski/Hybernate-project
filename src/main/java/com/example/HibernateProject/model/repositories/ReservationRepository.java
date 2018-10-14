package com.example.HibernateProject.model.repositories;

import com.example.HibernateProject.model.ReservationModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationModel, Integer> {



}
