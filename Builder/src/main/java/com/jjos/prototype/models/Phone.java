package com.jjos.prototype.models;

public class Phone {
    private String number;
    private String extension;
    private String phoneType;

    public Phone() {}
    public Phone(String number, String extension, String phoneType) {
        this.number = number;
        this.extension = extension;
        this.phoneType = phoneType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "\nPhone{" +
                "number='" + number + '\'' +
                ", extension='" + extension + '\'' +
                ", phoneType='" + phoneType + '\'' +
                "}\n";
    }
}
