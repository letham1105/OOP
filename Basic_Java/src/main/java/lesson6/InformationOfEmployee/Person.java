package lesson6.InformationOfEmployee;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
      public void Display(){
        System.out.println("Nhan Vien "+name+","+age+" tuoi, tai dia chi "+address);
    }
}
