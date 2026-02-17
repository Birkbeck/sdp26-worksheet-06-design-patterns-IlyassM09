package flyweight;

public final class PlatformFactory {

    private PlatformFactory() {
        throw new AssertionError("Cannot instantiate the class");
    }

    public static Platform getPlatformInstance(String platformType) {
        // TODO: implement
        return null;
    }
}