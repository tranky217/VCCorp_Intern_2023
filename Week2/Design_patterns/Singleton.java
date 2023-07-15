package Week2.Design_patterns;

public class Singleton {
    private static volatile Singleton instance;
    // volatile for blocking accessing resource while it is partially constructed
    private String database;

    // ensure that singleton class can only be access via getInstance method
    private Singleton(String database){
        this.database = database;
    }

    public static Singleton getInstance(String database){
        // avoid read ref directly from memory -> access by local variable
        Singleton result = instance;
        // prevent create different instances from different threads
        if (result == null){
            synchronized (Singleton.class){
                result = instance;
                if(result == null){
                    instance = result = new Singleton(database);
                }
            }
        }
       return result;
    }
}
