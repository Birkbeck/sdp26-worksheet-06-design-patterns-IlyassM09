package observer;

import java.util.List;

public class CommentaryObject implements Subject, Commentary {
    public CommentaryObject(List<Observer> observers, String s) {
        // TODO: implement
    }

    @Override
    public void setDesc(String desc) {
        // TODO: implement
    }

    @Override
    public void subscribeObserver(Observer observer) {
        // TODO: implement
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        // TODO: implement
    }

    @Override
    public void notifyObservers() {
        // TODO: implement
    }

    @Override
    public String subjectDetails() {
        // TODO: implement
        return null;
    }
}
