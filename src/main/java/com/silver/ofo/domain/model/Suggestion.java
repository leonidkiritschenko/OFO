package com.silver.ofo.domain.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;

@Data
@Component
public class Suggestion {

    private ArrayList<LocalDate> availableDays;
    private String title;
    private String description;
    private String location;
    private Vote vote;

}
