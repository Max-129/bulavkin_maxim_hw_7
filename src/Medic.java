public class Medic extends Hero {



    @Override
    public void applySuperAbility() {
        System.out.println("����� ������� ���� ������!");
    }

    int healPoints = 100;

    public String increaseExperience() {
        double tenPercent = (((10 + healPoints) / 100) + healPoints);
        return "�������� ������: " + healPoints + " ��������� �� 10% " + " ����� ��������: " + tenPercent;
    }
}
