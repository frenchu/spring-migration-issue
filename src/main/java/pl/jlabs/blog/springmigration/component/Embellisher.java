package pl.jlabs.blog.springmigration.component;

public interface Embellisher<T extends Number> {

    public T doSomethingMeaningfulWith(T element);
    
}
