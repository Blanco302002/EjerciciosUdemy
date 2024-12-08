public class Juego {
    public static void main(String[] args) {
        // Realizo la agregación
        Personaje personaje = new Personaje();
    }
}
class Personaje {
    public Personaje() {}

    protected void accion() {}
}

class Atacando extends Personaje {
    public void accion() {
        // codigo para implementar al personaje Atacando.
    }
}
class Detenido extends Personaje {
    public void accion() {
        // codigo para implementar al personaje Detenido.
    }
}
class Moviendose extends Personaje {
    public void accion() {
        // codigo para implementar al personaje moviendose.
    }
}