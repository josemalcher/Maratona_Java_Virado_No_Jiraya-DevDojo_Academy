package dominio;

public interface DateLoader {
    public abstract void load(); // public abstract é opcional!

    public static final int MAX_DATA_SIZE = 10; // "public static final" é redundante!

    default void checkPermission() {
        System.out.println("FAZENDO CHECAGEM DE PERMISSOES");
    }

    public static void retrieveMaxDateSize() {
        System.out.println("DENTRO DO retrieveMaxDateSize() na interface");
    }
}
