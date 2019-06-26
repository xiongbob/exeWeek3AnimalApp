/*
 * All Birds are Animals but all Animals are not Birds
 *
 * The class Bird is the sub-class of Animal (superclass)
 * A subclass inherits all the members (fields, methods, and nested classes) from its superclass.
 * Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass
 * can be invoked from the subclass
 *
 */
public class Bird extends Animal {
    public Bird() {
        //super();
        System.out.println("A bird is hatched...");
    }

    //A subclass inherits all the members (fields, methods, and nested classes) from its superclass
    @Override
    public String sleep() {
        return "A bird sleeps soundly...";
    }

    //A subclass inherits all the members (fields, methods, and nested classes) from its superclass
    @Override
    public String eat() {
        return "A bird eats...";
    }


    public String fly() {
        //Birds can fly but other animals can't so this method
        //is unique to the Bird class
        return "A bird flies...";
    }
}
