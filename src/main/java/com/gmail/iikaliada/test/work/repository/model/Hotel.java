package com.gmail.iikaliada.test.work.repository.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;

@Document
public class Hotel {
    @Id
    private String id;
    private LocalTime workingTimeFrom;
    private LocalTime workingTimeTo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalTime getWorkingTimeFrom() {
        return workingTimeFrom;
    }

    public void setWorkingTimeFrom(LocalTime workingTimeFrom) {
        this.workingTimeFrom = workingTimeFrom;
    }

    public LocalTime getWorkingTimeTo() {
        return workingTimeTo;
    }

    public void setWorkingTimeTo(LocalTime workingTimeTo) {
        this.workingTimeTo = workingTimeTo;
    }
}
