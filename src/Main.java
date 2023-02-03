public class Main {
    public static void main(String[] args) {
        HavingSuperAbility superAbilities[]={new Warrior(),new Magic(),new Medic()};
        for (int i = 0; i < superAbilities.length; i++) {
            superAbilities[i].applySuperAbility("Critical damage");
            superAbilities[i].applySuperAbility("Fire");
            superAbilities[i].applySuperAbility("Punch");

        }
   }
}