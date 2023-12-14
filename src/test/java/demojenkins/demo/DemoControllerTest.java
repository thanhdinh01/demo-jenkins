package demojenkins.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class DemoControllerTest {
    private final DemoController demoController = new DemoController();
    @Test
    void about() {
//        DemoController demoController= new DemoController();
        assertEquals("Hello world1 okea123",demoController.about());
    }

    @Test
    void contact() {
        assertEquals("Hello you1",demoController.contact());
    }
}