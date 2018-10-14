package com.example.HibernateProject.model.repositories;

import com.example.HibernateProject.model.ReservationModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationModel, Integer> {

//    ReservationModel findByLastname(String name);
//    List<ReservationModel> findByIdGreaterThan(int id);
//    List<ReservationModel> findByDateBefore(LocalDate date);
//    List<ReservationModel> findByDateAfter(LocalDate date);
//    List<ReservationModel> findByDateBetween(LocalDate now, LocalDate date);
    List<ReservationModel> findByLastnameContaining(String character);
    List<ReservationModel> deleteByLastname(String name);


}
