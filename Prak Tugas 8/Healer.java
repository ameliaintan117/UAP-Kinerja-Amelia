package PraktikumTugas8;

public class Healer extends Character{
    public Healer(){
        super(10,10,70);
    }
    @Override
    public boolean attack(){
        return Math.random() <= 0.85;
    }
    public void heal(){
        setHP(getHP() + 25);
        System.out.println("Menggunakan Skill Heal");
    }
}
