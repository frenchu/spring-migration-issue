package pl.jlabs.blog.springmigration.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.Assert;

@ContextConfiguration("/application-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ClientMotivatorServiceTest {

    @Autowired
    private ClientMotivatorService service;
    
    @Test
    public void testDoService() {
        Number result = service.doService();
        Assert.assertEquals(1000000000, result);
    }
}
