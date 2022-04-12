package com.springapp.app.indoorturfbooking.Exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {

    private Date timeStamp;
    private String message;
    private String request;

}
