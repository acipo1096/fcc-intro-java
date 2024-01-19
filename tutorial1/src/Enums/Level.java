package Enums;

public enum Level {
    // No need for public static etc.
    // Don't need caps, but go with nomenclature
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    // Can create something like a hash table
    private int lvlNum;

    private Level(int num) {
        this.lvlNum = num;
    }

    public int getLvl() {
        return this.lvlNum;
    }

    public void setLvl(int num) {
        this.lvlNum = num; 
    }
}
