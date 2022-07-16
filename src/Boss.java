public class Boss {

    private int bossHealth;
    private int bossDamage;
    private String BossDefence;
    protected Boss(int bossDamage, int bossHealth , String BossDefence){
        this.bossDamage = bossDamage;
        this.BossDefence = BossDefence;
        this.bossHealth = bossHealth;

    }

    public void setBossHealth(int bossHealth){

        this.bossHealth = bossHealth;
    }public int getBossHealth(){return  this.bossHealth;}

    public void setBossDamage(int bossDamage){
        this.bossDamage = bossDamage;}
    public int getBossDamage(){return this.bossDamage;}

    public void setBossDefence(String bossDefence){
        this.BossDefence = bossDefence;}
    public String getBossDefence(){return this.BossDefence;}
}


