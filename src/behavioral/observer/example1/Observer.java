package behavioral.observer.example1;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}