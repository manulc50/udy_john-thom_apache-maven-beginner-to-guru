package guru.springframework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// Unit Test con JUnit 4

// El plugin de Maven "maven-surefire-plugin" buscará y ejecutará únicamente los tests de las clases que empiecen o finalicen por "Test" ya que es su comportamiento por defecto

public class TestJavaHelloWorld {
	
	@Test
	public void getHello() {
		JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
		
		assertEquals("Hello World", javaHelloWorld.getHello());
	}

}
