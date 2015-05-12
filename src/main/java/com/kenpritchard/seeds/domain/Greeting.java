package com.kenpritchard.seeds.domain;

public class Greeting {
    private String salutation;
    private String name;

    public String getSalutation() {
        return this.salutation;
    }

    public void setSalutation(final String theSalutation) {
        this.salutation = theSalutation;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String theName) {
        this.name = theName;
    }
}
