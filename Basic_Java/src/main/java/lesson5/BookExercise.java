package lesson5;

public class BookExercise {
    public static void main(String[] args) {
        person author = new person( "HCP", 45, "VKU");
        Book OOP_Practice = new Book (" OOP Practice with Java", author,200,50);
        OOP_Practice.details();
    }
}
class Book
{
    private String title;
    private person author;
    private int pages;
    private double price;
    public Book (String title, person author, int pages, double price)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }
    public void details (){
        System.out.println("Title: " +title);
        System.out.println("Author name : " + author.getName());
        System.out.println("Pages: " +pages);
        System.out.println("Price: " + price + "$");
    }
    public void setTitle(String title)
    {
        this.title =title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor ( person person)
    {
        author = person;
    }
    public person getAuthor()
    {
        return author;
    }
    public void setPages(int pages)
    {
        this.pages =pages;
    }
    public int getPages()
    {
        return pages;
    }
    public void setPrice (double price)
    {
        this.price =price;
    }
    public double getPrice()
    {
        return price;
    }
}
// tao lop person
class person
{
    private String name;
    private int age;
    private String address;
    // phuong thuc khoi tao
    public person(String name, int age, String address)
    {
        // khoi tao gia tri cho cac thuoc tinh cua doi tuong hien dang goi phuong thuc nay
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName()
    {
        return name;
    }
    // hien thi thong tin
    public void display()
    {
        System.out.println(" Nhan vien " + name + ", "+age+ " tuoi, tai dia chi "+address);
    }
}
