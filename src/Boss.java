public class Boss {
    private int bossHealth = 650;
    private int bossDamage = 50;
    private String BossDefence = "Physical.";
    public void setBossHealth(int bossHealth){

        this.bossHealth = bossHealth;
    }
    public int getBossHealth(){return this.bossHealth;}

    public void setBossDamage(int bossDamage){
        this.bossDamage = bossDamage;}
    public int getBossDamage(){return this.bossDamage;}

    public void setBossDefence(String bossDefence){
        this.BossDefence = bossDefence;}
    public String getBossDefence(){return this.BossDefence;}
}


