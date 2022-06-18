package PraktikumTugas8;

public class Magician extends Character{
    public Magician(){
        super(10,60,100);
    }
    @Override
    public boolean attack(){
        return Math.random() <= 0.35;
    }
}
