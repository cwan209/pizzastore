package com.luke.pizzastore.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

@Data
public class ContactDTO {


    @NotBlank(message = "Please provide a name")
    private String customerName;

    @NotBlank(message = "Please provide a mobile number")
    @Pattern(
            regexp="[\\d]+",
            message = "Please provide a mobile number"
    )
    private String mobile;

}
