package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// Unit Test con JUnit 5

// El plugin de Maven "maven-surefire-plugin" buscará y ejecutará únicamente los tests de las clases que empiecen o finalicen por "Test" ya que es su comportamiento por defecto

public class JavaHelloWorldTest {
	
	@Test
	void getHello() {
		JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
		
		assertEquals("Hello World", javaHelloWorld.getHello());
	}

}
