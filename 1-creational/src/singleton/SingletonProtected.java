package singleton;

public class SingletonProtected {

    private static SingletonProtected uniqueInstance = null;

    private SingletonProtected() {
    }

    public static SingletonProtected getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new SingletonProtected();

        return uniqueInstance;
    }
}
