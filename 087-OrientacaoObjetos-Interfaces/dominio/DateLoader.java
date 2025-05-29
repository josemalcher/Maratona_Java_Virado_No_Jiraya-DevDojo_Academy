package dominio;

public interface DateLoader {
    public abstract void load(); // public abstract é opcional!

    default void checkPermission() {
        System.out.println("FAZENDO CHECAGEM DE PERMISSOES");
    }
}
