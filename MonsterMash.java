public class MonsterMash{
    public static void main(String[] args){
        System.out.println("Welcome to Monster Mash");
        
        Monster creature = new Monster("Creature");
        
        System.out.println(creature);
        System.out.println(creature.kill());
        System.out.println(creature.getName());
        
        Monster west = new Witch("Wicked Witch of the West");
        System.out.println(west);
        System.out.println(west.kill());
        
        Monster mom = new Mother("Mom");
        System.out.println(mom);
        System.out.println(mom.kill());
    }
}
