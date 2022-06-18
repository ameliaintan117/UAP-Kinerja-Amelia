package PraktikumTugas8;

public abstract class Character {
    private int defense;
    private int attack;
    private int HP;

    public Character(int defense, int attack, int HP){
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public abstract boolean attack();
    public void receiveDamage(int damage){
        if (damage > this.defense){
            int damage1 = damage - this.defense;
            this.HP -= damage1;
            if (this.HP < 0) setHP(0);
        }
    }

    public void info(){
        System.out.println("-------------------- STATUS --------------------");
        System.out.println("Role\t: " + getClass().getSimpleName());
        System.out.println("HP\t\t: " + getHP());
        System.out.println("Attack\t: " + getAttack());
        System.out.println("Defence\t: " + getDefense());
    }
}
