package com.example.HibernateProject.controllers;

import com.example.HibernateProject.model.ReservationModel;
import com.example.HibernateProject.model.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.Calendar;

@Controller
public class MainCOntroller {

    @Autowired

    ReservationRepository reservationRepository;

    @GetMapping("/")
    @ResponseBody
    public String index(){
        ReservationModel model = new ReservationModel();
        model.setAdres("Warszawa");
        model.setDate(new Date(Calendar.getInstance().getTimeInMillis()));
        model.setFirstName("Łukasz");
        model.setLastName("Kowalski");

        reservationRepository.save(model);

        return "Hej, zapisałem dane";

    }
}
