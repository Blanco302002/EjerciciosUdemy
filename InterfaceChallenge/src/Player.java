import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveble {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    public List<String> write() {
        List<String> listaTemporal = new ArrayList<>(4);
        listaTemporal.add(name);
        listaTemporal.add(1, "" + hitPoints);
        listaTemporal.add(2, "" + strength);
        listaTemporal.add(weapon);
        return listaTemporal;
    }
    public void read(List<String> listaTemporal) {
        if (!listaTemporal.isEmpty()) {
            name = listaTemporal.get(0);
            hitPoints = Integer.parseInt(listaTemporal.get(1));
            strength = Integer.parseInt(listaTemporal.get(2));
            weapon = listaTemporal.get(4);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
