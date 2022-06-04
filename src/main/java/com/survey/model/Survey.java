package com.survey.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Survey {


    private Long survey_id;
    private int user_id;
    private String survey_name;
    private String publish_state;
    private int required;
    private LocalDate publish_start;
    private LocalDate publish_end;

}
