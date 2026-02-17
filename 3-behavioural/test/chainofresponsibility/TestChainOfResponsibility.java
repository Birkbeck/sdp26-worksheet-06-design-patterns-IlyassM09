package chainofresponsibility;

public class TestChainOfResponsibility {
    public static void main(String[] args) {
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler excelHandler = new ExcelFileHandler("Excel Handler");
        Handler audioHandler = new AudioFileHandler("Audio Handler");
        Handler videoHandler = new VideoFileHandler("Video Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");

        textHandler.setHandler(docHandler);
        docHandler.setHandler(excelHandler);
        excelHandler.setHandler(audioHandler);
        audioHandler.setHandler(videoHandler);
        videoHandler.setHandler(imageHandler);

        File file;
        file = new File("Abc.mp3", File.Type.AUDIO, "C:");
        textHandler.process(file);

        System.out.println("---------------------------------");

        file = new File("Abc.jpg", File.Type.VIDEO, "C:");
        textHandler.process(file);

        System.out.println("---------------------------------");

        file = new File("Abc.doc", File.Type.DOC, "C:");
        textHandler.process(file);

        System.out.println("---------------------------------");

        file = new File("Abc.bat", File.Type.BAT, "C:");
        textHandler.process(file);
    }
}