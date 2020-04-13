package com.silver.ofo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vote {

    private String id;
    private int value;
    private String suggestionID;
    private String userID;
}
