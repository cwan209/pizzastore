package com.luke.pizzastore.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

@Data
public class PizzaOrderRequest {

    @NotBlank(message = "Please provide a name")
    private String customerName;

    @NotBlank(message = "Please provide a mobile number")
    @Pattern(
        regexp="[\\d]+",
        message = "Please provide a mobile number"
    )
    private String mobile;

    @Positive(message = "Please provide a valid unit number")
    private int unitNo;

    @Positive(message = "Please provide a valid number")
    private int streetNo;

    @NotBlank(message = "Please provide a streetName")
    private String streetName;

    @NotBlank(message = "Please provide a suburb")
    private String suburb;

    @NotBlank(message = "Please provide a state")
    private String state;

    @Pattern(
        regexp="[\\d]+",
        message = "Please provide a valid postcode"
    )
    private String postcode;
}