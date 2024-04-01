package Animal;

public class main {
    public static void main(String[] args) {
        Dog Den = new Dog();
        Cat Ngao = new Cat();

        System.out.println("Den:");
        Den.makeSound();
        Den.eat();
        Den.sleep();

        System.out.println("Ngao:");
        Ngao.makeSound();
        Ngao.eat();
        Ngao.sleep();
    }
}
