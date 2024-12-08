import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveble {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> listaTemporal = new ArrayList<>(3);
        listaTemporal.add(name);
        listaTemporal.add(1, "" + hitPoints);
        listaTemporal.add(2, "" + strength);
        return listaTemporal;
    }
    @Override
    public void read(List<String> listaTemporal) {
        if (!listaTemporal.isEmpty()) {
            name = listaTemporal.get(0);
            hitPoints = Integer.parseInt(listaTemporal.get(1));
            strength = Integer.parseInt(listaTemporal.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
