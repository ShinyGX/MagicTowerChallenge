package com.billy.magictower.model;

public class HeroAttribute {
    private int hp;
    private int atk;
    private int def;
    private int yellowKey;
    private int blueKey;
    private int redKey;
    private int coin;
    private int curLevel;
    private boolean hasEquipment;

    public HeroAttribute(int hp, int atk, int def, int yellowKey, int blueKey, int redKey, int coin, int curLevel, boolean hasEquipment) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.yellowKey = yellowKey;
        this.blueKey = blueKey;
        this.redKey = redKey;
        this.coin = coin;
        this.curLevel = curLevel;
        this.hasEquipment = hasEquipment;
    }

    public int getCurLevel() {
        return curLevel;
    }

    public void setCurLevel(int curLevel) {
        this.curLevel = curLevel;
    }

    public boolean isHasEquipment() {
        return hasEquipment;
    }

    public void setHasEquipment(boolean hasEquipment) {
        this.hasEquipment = hasEquipment;
    }

    public HeroAttribute()
    {
    }

    public HeroAttribute(int hp, int atk, int def, int yellowKey, int blueKey, int redKey, int coin) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.yellowKey = yellowKey;
        this.blueKey = blueKey;
        this.redKey = redKey;
        this.coin = coin;
    }

    public void addYellowKey()
    {
        yellowKey++;
    }

    public void addRedKey()
    {
        redKey++;
    }

    public void addBlueKey()
    {
        blueKey++;
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getYellowKey() {
        return yellowKey;
    }

    public void setYellowKey(int yellowKey) {
        this.yellowKey = yellowKey;
    }

    public int getBlueKey() {
        return blueKey;
    }

    public void setBlueKey(int blueKey) {
        this.blueKey = blueKey;
    }

    public int getRedKey() {
        return redKey;
    }

    public void setRedKey(int redKey) {
        this.redKey = redKey;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
