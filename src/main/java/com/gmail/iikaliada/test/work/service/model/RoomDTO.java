package com.gmail.iikaliada.test.work.service.model;

import java.math.BigDecimal;

public class RoomDTO {
    private String id;
    private String name;
    private String numberOfBed;
    private BigDecimal price;
    private Boolean isEmpty;
    private String bookingDateFrom;
    private String bookingDateTo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(String numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getFree() {
        return isEmpty;
    }

    public void setEmpty(Boolean isFree) {
        this.isEmpty = isFree;
    }

    public String getBookingDateFrom() {
        return bookingDateFrom;
    }

    public void setBookingDateFrom(String bookingDateFrom) {
        this.bookingDateFrom = bookingDateFrom;
    }

    public String getBookingDateTo() {
        return bookingDateTo;
    }

    public void setBookingDateTo(String bookingDateTo) {
        this.bookingDateTo = bookingDateTo;
    }
}
