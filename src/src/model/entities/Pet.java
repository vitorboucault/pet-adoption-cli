package model.entities;

import model.enums.BiologicalSex;
import model.enums.PetType;

public class Pet {

    public static final String NAO_INFORMADO = "NÃO INFORMADO";
    private String firstName;
    private String lastName;
    private PetType petType;
    private double age;
    private double weight;
    private String breed;
    private BiologicalSex biologicalSex;
    private Address address;

    public Pet(String firstName, String lastName, Address address, BiologicalSex biologicalSex, String breed, double weight, double age, PetType petType) {
        this.address = address;
        this.biologicalSex = biologicalSex;
        this.breed = breed;
        this.weight = weight;
        this.age = age;
        this.petType = petType;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PetType getPetType() {
        return petType;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public BiologicalSex getBiologicalSex() {
        return biologicalSex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public void setBiologicalSex(BiologicalSex biologicalSex) {
        this.biologicalSex = biologicalSex;
    }

    @Override
    public String toString() {
        return "==================== PET INFO ====================" +
                "\nFirst Name   : " + firstName +
                "\nLast Name    : " + lastName +
                "\nType         : " + petType +
                "\nSex          : " + biologicalSex +
                "\nBreed        : " + breed +
                "\nAge          : " + age + " year(s)" +
                "\nWeight       : " + weight + " kg" +
                "\nAddress      : " + address +
                "\n==================================================";
    }
}
