import java.util.ArrayList;
import java.util.List;
public class Layer<T extends Mappable> {
    private List<T> elements;
    public Layer() {
        elements = new ArrayList<>();
    }
    public Layer(List<T> elements) {
        this.elements = elements;
    }
    public void addElement(T t) {
        if (t != null) {
            elements.add(t);
        }
    }
    public void renderLayer() {
        for (T t : elements) {
            System.out.println("---" + t.getClass().getSimpleName() + "---");
            t.render();
        }
    }

}
