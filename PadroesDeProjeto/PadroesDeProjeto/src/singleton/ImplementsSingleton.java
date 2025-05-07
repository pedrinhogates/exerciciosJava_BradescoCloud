package singleton;
public class ImplementsSingleton {

    private static ImplementsSingleton instancia;

    private ImplementsSingleton() {
        super();
    }

    public static ImplementsSingleton getInstancia() {
        if (instancia == null) {
            instancia = new ImplementsSingleton();
        }
        return instancia;
    }
}