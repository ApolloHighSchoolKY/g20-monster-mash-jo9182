/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is an object that will inherit all of the
 * properties and abilities of the original Animal object.
 * However, it will have it own unique properties and
 * methods while overriding some of the existing methods
 * it inherits.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Cow extends Animal
{

    public Cow()
    {
        super(0, true, "moo");
    }


    public void kill()
    {
		alive = false;
		System.out.println("The cow has died at " + age + " years old. I will be eating it... yum yum.")
    }
}