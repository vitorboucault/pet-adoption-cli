package model.enums;

public enum PetType {
    CAT(1, "Cat"), DOG(2, "Dog");

    private final int value;
    private final String type;

    PetType(int value, String type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return type;
    }
}
