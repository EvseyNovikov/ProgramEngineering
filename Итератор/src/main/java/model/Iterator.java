package model;

public interface Iterator {
    public boolean hasNext();
    public Object next();
    public Object prev();
    public boolean hasPrev();
    public Object preview();
}
