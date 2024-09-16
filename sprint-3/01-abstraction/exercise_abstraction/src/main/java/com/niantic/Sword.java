package com.niantic;

public abstract class Sword extends Weapon
{
    private String name;
    private int damage;

    public Sword(String name, int damage)
    {
        super(name, damage);
        this.name = name;
        this.damage = damage;
    }

    @Override
    public int attack()
    {
        int currentCharge = getPercentCharged();
        setPercentCharged(Math.min(100, currentCharge + 10));
        return getDamage();
    }

    @Override
    public int powerAttack()
    {
        int currentCharge=getPercentCharged();

        if (currentCharge < 50) {
            return attack();
        } else if (currentCharge <= 90) {
            setPercentCharged(currentCharge - 50);
            return damage * 2;
        } else if (currentCharge == 100) {
            setPercentCharged(0);
            return damage * 4;
        }

        return powerAttack();

    }

    @Override
    public int getRange() {return 1;}

}

