package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {
    @JsonProperty
    private String city;

    // Default constructor required for Jackson deserialization
    public Search() {
    }

    // Constructor with city field
    public Search(String city) {
        this.city = city;
    }

    // Getter method
    public String getCity() {
        return city;
    }

    // Optional: Setter method (only if needed)
    public void setCity(String city) {
        this.city = city;
    }
}
