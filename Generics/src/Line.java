import java.util.Arrays;

public class Line implements Mappable {
    private String name;
    private String[] location;
    private double[][] location1;
    boolean bandera = true;
    public Line() {
    }

    public Line(String name, double[][] location) {
        this.name = name;
        this.location1 = location;
    }
    public Line(String name, String location) {
        this.name = name;
        // esto es teniendo en cuenta que el usuario escribe como coor, coor1, coor2... etc
        this.location = location.split(", ");
        bandera = false;
    }

    public String getName() {
        return name;
    }

    public Object getLocation() {
        return location;
    }

    @Override
    public void render() {
        if (bandera) {
            // significa que es un arreglo bidimensional

            System.out.println("LINE Coordeanadas : " + Arrays.deepToString(location1));
        } else {
            System.out.println("LINE Coordeanadas : " + Arrays.toString(location));
        }
    }
}
