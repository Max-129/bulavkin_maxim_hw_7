public class Medic extends Hero {



    @Override
    public void applySuperAbility() {
        System.out.println("Медик Вылечел всех героев!");
    }

    int healPoints = 100;

    public String increaseExperience() {
        double tenPercent = (((10 + healPoints) / 100) + healPoints);
        return "Здоровье Героев: " + healPoints + " Увеличено на 10% " + " Стало Здоровья: " + tenPercent;
    }
}
