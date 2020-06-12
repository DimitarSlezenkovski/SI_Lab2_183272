import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

class SILab2Test {

    private SILab2 siLab2 = new SILab2();
    private static User user1 = null; //EPC, //EBC
    private static User user2 = new User("Dimitar",null,"asd@gmail.com");//EPC
    private static User user3 = new User("Dimitar","dimitar","dsa@gmail.com");//EPC
    private static User user4 = new User("Dimitar","asdf","");//EPC
    private static User user5 = new User("Dimitar","Sl3z#nkovsk1","p!ck1eR!ck@gmail.com");//EPC
    private static User user6 = new User("Dimitar","Sl3z3nkovsk1","john@gmail.com"); //EPC
    private static User user7 = new User("Dimitar","asdf12","asdf@gmail.com");
    private static User user8 = new User("Dimitar","dimitar","haos@gmail.com");
    private static User user9 = new User("Dimitar","Pa2$Wor|)","nesumodtuka@gmail.com");
    private static User user10 = new User("Dimitar","1234SADF","");
    private static User user11 = new User("Dimitar","AWDFA1a","");
    private static List<String> users;
    private static List<String> users2;

    @BeforeAll
    public static void init() {
        System.out.println("Initializing the expected paramethars ");

        users = new ArrayList<>(11);
        users2 = new ArrayList<>(5);
        users2.add("Johnny");
        users2.add("Marineh");
        users2.add("John");
        users2.add("Simone");
        users2.add("Bravo");
    }
    @AfterAll
    public static void destroy() {
        System.out.println("The test terminates");
    }

    @Test
    void EachBranchTest(){
        assertAll(
                () -> assertTrue(assertThrows(RuntimeException.class,
                        () -> siLab2.function(user1, users)).getMessage()
                        .contains("The user is not instantiated")),
                () -> assertTrue(assertThrows(RuntimeException.class,
                        () -> siLab2.function(user2, users))
                        .getMessage().contains("The user is missing some mandatory information")),
                () -> assertFalse(siLab2.function(user3, users)),
                () -> assertFalse(siLab2.function(user4, users)),
                () -> assertTrue(siLab2.function(user5, users)),
                () -> assertFalse(siLab2.function(user6, users)),
                () -> assertFalse(siLab2.function(user7, users)),
                () -> assertFalse(siLab2.function(user8, users)),
                () -> assertTrue(siLab2.function(user9, users)),
                () -> assertFalse(siLab2.function(user10, users)),
                () -> assertFalse(siLab2.function(user11, users))
        );
    }
    @Test
    void EachPathTest(){
        assertAll(
                () -> assertTrue(assertThrows(RuntimeException.class,
                        () -> siLab2.function(user1, users)).getMessage()
                        .contains("The user is not instantiated")),
                () -> assertTrue(assertThrows(RuntimeException.class,
                        () -> siLab2.function(user2, users))
                        .getMessage().contains("The user is missing some mandatory information")),
                () -> assertFalse(siLab2.function(user3, users)),
                () -> assertFalse(siLab2.function(user4, users)),
                () -> assertTrue(siLab2.function(user5, users)),
                () -> assertFalse(siLab2.function(user6, users)),
                () -> assertFalse(siLab2.function(user7, users)),
                () -> assertFalse(siLab2.function(user8, users)),
                () -> assertTrue(siLab2.function(user9, users)),
                () -> assertFalse(siLab2.function(user10, users)),
                () -> assertFalse(siLab2.function(user11, users))
        );
    }
}