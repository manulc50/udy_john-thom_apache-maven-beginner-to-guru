
// El plugin de Maven "Maven Surefire plugin" es el encargado de ejecutar las clases de pruebas
// Los pasos "package" e "install" también ejecutan las clases de pruebas mediante este plugin

public class HelloWorldTest {
	
	public void testHello() {
		System.out.println("TEST - Hello...");
	}
	
	public void testWorld() {
		System.out.println("TEST - world!!!");
	}

}
