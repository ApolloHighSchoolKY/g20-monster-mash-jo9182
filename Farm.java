/**
 * @(#)Farm.java
 *
 *
 * @author
 * @version 1.00 2023/3/8
 */


public class Farm {

    

    public Farm() {
    	Cow moo = new Cow();

    }  

    public void time(){
        //Make every animal age by one years
            age++;
        //If a Cow has reached its maximum age, kill it
            if(age = 2)
                alive = false;
    }


}