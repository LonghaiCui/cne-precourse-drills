package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable{

    private String name;

    private ArrayList<Address> addresses;

    public Business(String name) {
        this.name = name;
        this.addresses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public void addAddress(Address address) {
        addresses.add(address);
    }
}
