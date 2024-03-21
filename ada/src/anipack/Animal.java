package anipack;

public class Animal {
    private String name;

    Animal() {
        this.name = "Animal";
    }

    public String getName() {
        return name;
    }
    
    protected void setName(String name) {
        this.name = name;
    }
}
