package PraktikumTugas8;

public class Warrior extends Character{
    public Warrior(){
        super(30,25,80);
    }
    @Override
    public boolean attack(){
        return Math.random() <= 0.60;
    }
}
