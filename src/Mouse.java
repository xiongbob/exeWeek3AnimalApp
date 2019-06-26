/*
 * All Cats are Animals but all Animals are not Cats
 *
 * The class Bird is the sub-class of Animal (superclass)
 * A subclass inherits all the members (fields, methods, and nested classes) from its superclass.
 * Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass
 * can be invoked from the subclass
 *
 */
public class Mouse extends Animal {

    public Mouse() {
        super();    //the constructor of the superclass can be invoked from the subclass
        System.out.println("Now I am a Mouse!");
    }

    //A subclass inherits all the members (fields, methods, and nested classes) from its superclass
    @Override
    public String sleep() {
        return "A Mouse never sleeps...";
    }

    //A subclass inherits all the members (fields, methods, and nested classes) from its superclass
    @Override
    public String eat() {
        return "A Mouse eats, too...";
    }

    //A subclass inherits all the members (fields, methods, and nested classes) from its superclass
    public String purr() {
        return "Always quite...";
    }

}