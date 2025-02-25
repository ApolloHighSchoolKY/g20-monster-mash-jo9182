public class Mother extends Monster{
    public Mother(String name){
    super(name);
  }
  
  //Override the kill() method we inherited from Monster
  //    Must have the same name, same return type, same parameter(s)
  public String kill(){
      System.out.println(super.kill());
      return "The victim did poorly on their homework. They are no more.";
  }
}
