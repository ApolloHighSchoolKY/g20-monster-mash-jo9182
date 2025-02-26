public class Witch extends Monster{


  public Witch(String name){
    super(name);
  }
  
  //Override the kill() method we inherited from Monster
  //    Must have the same name, same return type, same parameter(s)
  public String kill(){
      System.out.println(super.kill());
      return "The victim was turned into a toad. Ribbit ribbit.";
  }

  public String castASpell(){
    return "The victim dissapears in an inferno. Whoops."
  }

  public String toString(){
    return "Bubble, double, toil, and trouble."
  }
}
