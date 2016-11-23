package pl.jlabs.blog.springmigration.component;

import org.springframework.stereotype.Component;

@Component
public class DefaultEmbellisher implements Embellisher<Integer> {

    private static final int MULTIPLIER_OF_HAPPINES = 1000000000;
    
    @Override
    public Integer doSomethingMeaningfulWith(Integer number) {
        return number * MULTIPLIER_OF_HAPPINES;
    }

}
