package lesson5;

class Mobile {
    private String owner;
    private String name;
    private String color;
    private String number;
    private String model;

    public Mobile(String owner, String name, String color, String number, String model) {
        this.owner = owner;
        this.name = name;
        this.color = color;
        this.number = number;
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Mobile Info:\n" +
                "Owner: " + owner + "\n" +
                "Name: " + name + "\n" +
                "Color: " + color + "\n" +
                "Number: " + number + "\n" +
                "Model: " + model;
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile("John Doe", "Samsung Galaxy", "Black", "123-456-7890", "S21");
        System.out.println(mobile);

        mobile.setColor("Blue");
        mobile.setNumber("987-654-3210");
        System.out.println(mobile);
    }
}
