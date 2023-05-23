package com.devsuperior.dslearn.resources.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OAuthCustomError {

    private String error;
    @JsonProperty("error_description")
    private String errorDescription;
}
