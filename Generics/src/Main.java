public class Main {
    public static void main(String[] args) {
        Point plaza1 = new Plaza("25 de Mayo", -27.450964518415837, -58.98657317131649);
        Point plaza2 = new Plaza("9 de julio", -27.45106548896504, -58.99434170387905);
        Point plaza3 = new Plaza("12 de octubre", "-27.44400801212928", "-58.98653577504299");
        Layer<Point> capa = new Layer<>();
        capa.addElement(plaza1);
        capa.addElement(plaza2);
        capa.addElement(plaza3);
        //-----------------------------
        Line rio1 = new Rio("Negro", "-27.46794878271999, -58.89691991922409, " +
                "-27.455319416068367, -58.90122750721308, -27.452405297073597, -58.91927118735086");
        double[][] valores = {{-27.463752175779675, -58.88051541890281},{-27.43445227674185, -58.8743475972798},
                {-27.335141530073393, -58.9665231989393}};
        Line rio2 = new Rio("Tragadero", valores);
        Layer<Line> riosDeChaco = new Layer<>();
        riosDeChaco.addElement(rio1);
        riosDeChaco.addElement(rio2);
        capa.renderLayer();
        riosDeChaco.renderLayer();
    }
}
