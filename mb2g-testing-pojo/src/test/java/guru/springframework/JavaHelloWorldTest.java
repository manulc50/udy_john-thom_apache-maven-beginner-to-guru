package guru.springframework;

// POJO(Plain Old Java Object) Unit Test

// El plugin de Maven "maven-surefire-plugin" buscará y ejecutará únicamente los tests de las clases que empiecen o finalicen por "Test" ya que es su comportamiento por defecto

public class JavaHelloWorldTest {
	
	// Para los "POJO(Plain Old Java Object) Unit Test", como es el caso de este método, el plugin de Maven "maven-surefire-plugin" ejecutará únicamente los métodos que empiecen por "test" y sean públicos
	public void testGetHello() {
		JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
		
		assert("Hello World".equals(javaHelloWorld.getHello()));
	}

}
