package pl.jlabs.blog.springmigration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.jlabs.blog.springmigration.component.Embellisher;

@Service
public class ClientMotivatorService {

    private static final int ALMOST_NOTHING = 1;
    
    @Autowired
    private Embellisher<Number> embellisher;
    
    public Number doService() {
        if (isClientUninspired()) {
            return embellisher.doSomethingMeaningfulWith(ALMOST_NOTHING);
        }
        return ALMOST_NOTHING;
    }

    private boolean isClientUninspired() {
        // he is always uninspired
        return true;
    }
}
