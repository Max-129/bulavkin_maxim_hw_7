public abstract class Hero implements HavingSuperAbility {
    private int healthHero;
    private int damageHero;
    private String superAbility;

    public int getHealthHero() {
        return healthHero;
    }

    public void setHealthHero(int healthHero) {
        this.healthHero = healthHero;
    }

    public int getDamageHero() {
        return damageHero;
    }

    public void setDamageHero(int damageHero) {
        this.damageHero = damageHero;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }
}
