package com.silver.ofo.domain.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class User {

    private String name;
    private String mail;
    private Suggestion suggestion;
}
