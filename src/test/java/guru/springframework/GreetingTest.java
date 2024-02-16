package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before - I am only called Once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld(null));
    }

    @Test
    void testHelloWorld1() {
        System.out.println(greeting.helloWorld("John"));
    }

    @Test
    void testHelloWorld2() {
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After!!! - I am only called Once!!!");
    }
}