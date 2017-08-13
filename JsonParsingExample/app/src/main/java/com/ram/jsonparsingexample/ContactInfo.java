package com.ram.jsonparsingexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ram.jsonparsingexample.Contact;

import java.util.List;

public class ContactInfo {

    @SerializedName("contacts")
    @Expose
    private List<Contact> contacts = null;

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

}

