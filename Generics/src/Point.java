public class Point implements Mappable {
    private String name;
    private double latitud;
    private double longitud;
    public Point(String name, double latitud, double longitud) {
        this.name = name;
        this.latitud = latitud;
        this.longitud = longitud;
    }
    public Point(String name, String latitud, String longitud) {
        this.name = name;
        this.latitud = Double.parseDouble(latitud);
        this.longitud = Double.parseDouble(longitud);
    }

    public String getName() {
        return name;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }
    @Override
    public void render() {
        System.out.println("as POINT { " +
                "name = '" + name + '\'' +
                ", latitud = " + latitud +
                ", longitud = " + longitud +
                '}');
    }
}
