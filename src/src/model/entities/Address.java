package model.entities;

public class Address {
    private String addressStreet;
    private String addressCity;
    private int addressNumber;

    public Address(String addressStreet, String addressCity, int addressNumber) {
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressNumber = addressNumber;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public int getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(int addressNumber) {
        this.addressNumber = addressNumber;
    }

    @Override
    public String toString() {
        return addressStreet + ", No. " + addressNumber + " - " + addressCity;
    }
}
