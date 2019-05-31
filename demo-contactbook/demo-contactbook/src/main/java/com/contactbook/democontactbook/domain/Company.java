package com.contactbook.democontactbook.domain;

import javax.persistence.*;

@Embeddable
public class Company {

    @Column(name = "COMPANY_NAME")
    private String name;

    @Column(name = "COMPANY_CATCHPHRASE")
    private String catchPhrase;

    @Column(name = "COMPANY_BS")
    private String bs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }
}
