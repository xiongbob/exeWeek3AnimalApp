/*
 * This is the parent class. Also called the super class.
 *
 * A subclass inherits all the members (fields, methods, and nested classes) from its superclass.
 * Constructors are not members, so they are not inherited by subclasses, but the constructor of
 * the superclass can be invoked from the subclass.
 *
 * NOTE: In Java, Excepting Object, which has no superclass, every class has one and only one direct
 * superclass (single inheritance). In the absence of any other explicit superclass, every class is
 * implicitly a subclass of Object.
 *
 * Classes can be derived from classes that are derived from classes that are derived from classes,
 * and so on, and ultimately derived from the topmost class, Object. Such a class is said to be descended
 * from all the classes in the inheritance chain stretching back to Object.
 *
 *The idea of inheritance is powerful: When you want to create a new class and there is already a class
 * that includes some of the code that you want, you can derive your new class from the existing class.
 * In doing this, you can reuse the fields and methods of the existing class without having to write
 * (and debug!) them yourself.
 *
 * A subclass inherits all the members (fields, methods, and nested classes) from its superclass.
 * Constructors are not members, so they are not inherited by subclasses, but the constructor of
 * the superclass can be invoked from the subclass.
 *
 */
public class Animal {
    public Animal() {
        System.out.println("A new animal has been created!");
    }
    public String sleep() {
        return "An animal sleeps...";
    }
    public String eat() {
        return "An animal eats...";
    }
}