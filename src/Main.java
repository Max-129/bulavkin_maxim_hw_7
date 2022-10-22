public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] allHeroes = {new Magic(), new Warrior(), new Medic()};
        for (int i = 0; i < allHeroes.length; i++) {
            allHeroes[i].applySuperAbility();
        }
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        Magic magic = new Magic();

        medic.setHealthHero(250);
        magic.setHealthHero(300);
        warrior.setHealthHero(400);
        Hero[] allHeroes1 = {medic, warrior, magic};
        for (int i = 0; i < allHeroes1.length; i++) {
            System.out.println(medic.increaseExperience() + " " + i);
        }
    }


}