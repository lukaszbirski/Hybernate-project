package com.example.HibernateProject.model.forms;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservationForm {

    @Getter
    @Setter
    @NotBlank
    @Size(min = 3, max = 15)
    private String firstname;
    @Setter
    @Getter
    @NotBlank
    @Size(min = 3, max = 15)
    private String lastname;
    @Getter
    @Setter
    @Pattern(regexp = "2[0-9][3]-[0-1][0-9]-[0-3][0-9]", message = "Write date in yyyy-mm-dd format")
    private String date;
    @Getter
    @Setter
    @NotBlank
    @Size(min = 3, max = 15)
    private String adres;

    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

   /*
   //stare podejscie
   public Date getFormatedDate(){

     try {
         //YYYY-MM-DD
         return new Date(format.parse(date).getTime())
     } catch (ParseException e){
         e.printStackTrace();
     }
     return null;
     } */

    public LocalDate getFormatedDate(){
        //YYYY-MM-DD
        return LocalDate.parse(date, format);
    }



}
