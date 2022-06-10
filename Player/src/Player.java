import weapon.*;

public class Player {

    private

    Weapon[] weaponSlots = {new BigGun(), new WaterPistol(), new Slingshot(), new GrenadeLauncher(), new MachineGun()};

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > (getSlotsCount()) - 1) {
            System.out.println("Некорректные данные");
        } else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
    }
}
