public class Main {
    public static void main(String[] args) {
        Boss b1 = new Boss();
        System.out.println("Boss health: " + b1.getBossHealth() + "; " + "Boss damage: " + b1.getBossDamage() + "; "
                + "Boss defence: ");
        System.out.println(createHeroes());
    }

    public static Hero createHeroes() {
        Hero h1 = new Hero();
        System.out.println("Heroes health: " + h1.getHealth() + "; " + "Heroes damage: " + h1.getDamage() + "; "
                + "Heroes superpower: " + h1.getSuperpower());
        System.out.println("Heroes health: " + h1.getWerewolfHealth() + "; " + "Heroes damage: " + h1.getWerewolfDamage() + "; "
                + "Heroes superpower: " + h1.getWerewolfSuperpower());
        Hero h2 = new Hero();
        System.out.println("Heroes health: " + h1.getFireManHealth() + "; "
                + "Heroes damage: " + h1.getFireManDamage());
        Hero [] heroes = {};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Heroes health: " + h1.getHealth() + "; " + "Heroes damage: " + h1.getDamage() + "; "
                    + "Heroes superpower: " + h1.getSuperpower());
            System.out.println("Heroes health: " + h1.getWerewolfHealth() + "; " + "Heroes damage: " + h1.getWerewolfDamage() + "; "
                    + "Heroes superpower: " + h1.getWerewolfSuperpower());
            System.out.println("Heroes health: " + h1.getFireManHealth() + "; ");
        }

        return h1;
    }
}



