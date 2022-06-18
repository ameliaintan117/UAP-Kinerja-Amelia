package PraktikumTugas8;

public class Titan extends Character {
    public Titan(){
        super(0,45,200);
    }
    @Override
    public boolean attack(){
        return Math.random() <= 0.4;
    }
}
