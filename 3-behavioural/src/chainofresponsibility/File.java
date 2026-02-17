package chainofresponsibility;

public record File(String fileName, Type fileType, String filePath) {

    public enum Type {
        AUDIO, BAT, VIDEO, DOC
    }
}