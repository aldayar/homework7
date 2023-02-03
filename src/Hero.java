public class Hero implements HavingSuperAbility{
    public int health;   // зделал public  потому что в задании не было про private, не ругайте меня (я хотел сократить как можно быльше коды)
    public int damage;
    public String superAbility;

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("fire "+superAbilityType);

    }


}
