package com.silver.ofo.domain.model;

import lombok.Data;
import java.time.LocalDate;
import java.util.Set;

@Data
// @Entity
public class Event {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventId;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    private Set<User> users;
    private Set<Suggestion> suggestions;
    private Set<Vote> votes;


}
