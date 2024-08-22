package com.niantic;

public class Wizard extends Character
{
    private int mana;

    public Wizard(String name, int health, int level, int experience, int mana)
    {

        super(name, health, level, experience);

        this.mana = mana;
    }

    public int getMana() {
        return this.mana;
    }

    public void addMana() {
        if (!isDefeated()) {
            this.mana++;
            System.out.println(this.getName() + " added mana and now has " + this.mana + " mana.");
        } else {
            System.out.println(this.getName() + " cannot add mana because they have been defeated.");
        }
    }


    public void castSpell(Character target) {

        if (getHealth() <= 0) {
            System.out.println("Cannot cast super attack. The wizard has been defeated.");
        }
        if (mana >= 10) {
            mana -= 10;
            int superAttackDamage = 2 * (attackDamage);

            System.out.println("Super attack cast! Dealt " + superAttackDamage + " damage.");
            target.takeDamage(superAttackDamage);

        } else {
            System.out.println("Not enough mana to cast super attack.");
        }
    }

    public void regenerateMana(int amount) {
        if (this.getHealth() <= 0) {
            System.out.println(this.getName() + " cannot regenerate mana because they have been defeated.");
            return;
        }
        this.mana += amount;
        System.out.println(this.getName() + " regenerated " + amount + " mana and now has " + this.mana + " mana.");


    }


    @Override
    public void levelUp() {
        if (!isDefeated()) {
            super.levelUp();
            this.mana += 10; System.out.println(this.getName() + " leveled up and gained 10 mana. Current mana: " + this.mana);
        } else {
            System.out.println(this.getName() + " cannot level up because they have been defeated.");
        }
    }

    @Override
    public String specialAbility() {
        return "Cast Spell";
    }
}















