package com.example.HibernateProject.controllers;

import com.example.HibernateProject.model.ReservationModel;
import com.example.HibernateProject.model.forms.ReservationForm;
import com.example.HibernateProject.model.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.Calendar;

@Controller
public class MainController {

    @Autowired
    ReservationRepository reservationRepository;

    @GetMapping("/")
    public String index(Model model){
//        ReservationModel model = new ReservationModel();
//        model.setAdres("Warszawa");
//        model.setDate(new Date(Calendar.getInstance().getTimeInMillis()));
//        //model.setFirstName("COś");
//        model.setFirstname("Łukasz");
//        model.setLastname("Kowalski");

        model.addAttribute("reservationForm", new ReservationForm());
        return "index";

        //reservationRepository.save(model);

        //return "Hej, zapisałem dane";

    }
}
