package com.contactbook.democontactbook.domain;

import javax.persistence.*;

@Embeddable
public class Geo {

    @Column(name = "GEO_LAT")
    private String lat;

    @Column(name = "GEO_LNG")
    private String lng;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
