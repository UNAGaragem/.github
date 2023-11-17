/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package assertJunit;

//import com.mycompany.assertionsjunit.Dog;
import static java.util.Arrays.asList;
import java.util.List;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 *
 * @author rafaelamoreira
 */
/*@TestMethodOrder(OrderAnnotation.class)

/**
 *
 * @author sudar
 */
/*public class AssertJunit {
    @Test
    @Order(3)
    public void testAssertEqual() {
        assertEquals("ABC", "ABC");
        assertEquals(20, 20, "mensagem opcional");
        assertEquals(2 + 2, 4);
    }

    @Test
    @Order(2)
    public void testAssertFalse() {
        assertFalse("Rafaela".length() == 10);
        assertFalse(10 > 20, "mensagem");
    }

    @Test
    @Order(4)
    public void testAssertNull() {
        String str1 = null;
        String str2 = "abc";
        assertNull(str1);
        assertNotNull(str2);
    }

    @Test
    @Order(5)
    public void testAssertAll() {
        String str1 = "abc";
        String str2 = "pqr";
        String str3 = "xyz";
        assertAll("strings",
                () -> assertEquals(str1, "abc"),
                () -> assertEquals(str2, "pqr"),
                () -> assertEquals(str3, "xyz"));
    }

    @Test
    @Order(1)
    public void testAssertTrue() {
        assertTrue("Rafaela".startsWith("R"));
    }

    @Test
    @Order(6)
    public void testAssertThrows() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Illegal Argument Exception occured");
        });
        assertEquals("Illegal Argument Exception occured", exception.getMessage());
    }

    @Test
    public void testAssertThrows_1() {
        assertThrows(ArithmeticException.class, () -> {
            int resultado = 10 / 0;
        });
    }

    @Test
    public void testDog() {
        String dogNome = "Lowe";
        int dogIdade = 4;
        boolean legal = true;
        assertThat(dogNome, equalTo("Lowe"));
        assertThat(dogIdade, lessThan(5));
        assertThat(legal, is(false));
    }

    @Test
    public void testDogInstance() {
        Dog d = new Dog();
        assertThat(d, instanceOf(Dog.class));
    }

    @Test
    public void testSameInstance() {
        Dog d = new Dog();
        assertThat(d, sameInstance(d));
    }

    @Test
    public void testCollectionContaining() {
        List<String> dogNomes = asList("Lowe", "Cloye", "Maya");
        assertThat(dogNomes, hasItems("Cloye", "Maya"));
        assertThat(dogNomes, not(hasItems("Luke")));
    }

    @Test
    public void testCollectionSize() {
        List<String> dogNomes = asList("Lowe", "Cloye", "Maya");
        assertThat(dogNomes, hasSize(3));
    }

    @Test
    public void testHasProperty() {
        Dog d = new Dog("Luke");
        assertThat(d, hasProperty("nome", equalTo("Luke")));
    }

    @Test
    public void testStringEquality() {
        String nomeCAPS = "JUNIT";
        assertThat(nomeCAPS, equalToIgnoringCase("junit"));
    }

    @Test
    public void testStringContains() {
        String frase = "O feriado foi ótimo, mas não corrigi o trabalho.";
        assertThat(frase, containsString("feriado"));
    }

}*/
