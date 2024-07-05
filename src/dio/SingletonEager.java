package dio;

/**
 * Singleton Eager = atribui a instancia quando a variavel eh definida
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {

        return instancia;
    }

}
