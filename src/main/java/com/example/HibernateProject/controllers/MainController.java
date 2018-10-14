package com.example.HibernateProject.controllers;

import com.example.HibernateProject.model.ReservationModel;
import com.example.HibernateProject.model.forms.ReservationForm;
import com.example.HibernateProject.model.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.transaction.Transactional;


@Controller
public class MainController {

    @Autowired
    ReservationRepository reservationRepository;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("reservationForm", new ReservationForm());
        model.addAttribute("reservations", reservationRepository.findAll());
        return "index";

    }

    @PostMapping("/")
    public String index(@ModelAttribute("reservationForm") ReservationForm form, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()){
            return "index";
        }
        reservationRepository.save(new ReservationModel(form));

        model.addAttribute("reservationForm", new ReservationForm());
        model.addAttribute("reservations", reservationRepository.findAll());

        return "index";
    }

//    @PostMapping
//    public String index(@ModelAttribute("reservationForm") @Valid ReservationForm form,
//                        BindingResult bindingResult,
//                        Model model,
//                        ModelMap modelMap) {
//
//        if (bindingResult.hasErrors()) {
//            return "index";
//        }
//
//        reservationRepository.save(new ReservationModel(form));
//
//        List<ReservationModel> reservations = reservationRepository.findAll();
//
//        modelMap.put("reservations", reservations);
//
//        return "index";
//    }

    @GetMapping("/test")
    @ResponseBody
    public String test(){

        //ReservationModel model = reservationRepository.
        //ReservationModel model = reservationRepository.;
        //return reservationRepository.findByLastname("Nowak").toString();
        //return reservationRepository.findById(2).toString();
        //te które są starsze niż 2017
        //return reservationRepository.findByIdGreaterThan(2).toString();
        //return reservationRepository.findByDateBefore(LocalDate.of(2017,01,01)).toString();
        return reservationRepository.findByLastnameContaining("a").toString();

    }

    @GetMapping("/deletebylastname/{lastname}")
    @Transactional
    public String index3(@PathVariable String lastname) {
        reservationRepository.deleteByLastname(lastname);

        return "index";
    }

}
