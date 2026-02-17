package singleton;

import java.util.Objects;

public class TestSingletonPattern {
    public static void main(String[] args) {
        SingletonProtected s1 = SingletonProtected.getInstance();
        SingletonProtected s2 = SingletonProtected.getInstance();
        Objects.requireNonNull(s1);
        Objects.requireNonNull(s2);
        System.out.println(s1 == s2 ? "same instance" : "different instances");
    }
}
