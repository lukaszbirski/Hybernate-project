package com.example.HibernateProject.model;


import com.example.HibernateProject.model.forms.ReservationForm;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "reservations")
@NoArgsConstructor
public class ReservationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String adres;
    private LocalDate date;

    public ReservationModel (ReservationForm form){
        firstname = form.getFirstname();
        lastname = form.getLastname();
        date = form.getFormatedDate();
        adres = form.getAdres();

    }

}
