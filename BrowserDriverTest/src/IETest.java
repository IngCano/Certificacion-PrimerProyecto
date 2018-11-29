// Importamos el controlador para utilizar el navegador internet explorer
import org.openqa.selenium.ie.InternetExplorerDriver;
// Importamos la clase que nos permite "navegar" por el navegador
import org.openqa.selenium.WebDriver;
// Importamos el localizador
import org.openqa.selenium.By;
// Importamos segun la documentacion, representacion de teclas que no son texto (ej: enter, esc...)
// import org.openqa.selenium.Keys;

public class IETest {
	
	private static final String DRIVER_LOCATION = "S:\\Mis_Proyectos\\Java\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe";

	public static void main(String[] args) {
		// Ubicacion del controlador para i.e. y nombre
		System.setProperty("webdriver.ie.driver", DRIVER_LOCATION);
		// Instanciamos un nuevo navegador
		WebDriver navegador = new InternetExplorerDriver();
		// Navegamos hacia https://www.google.com/
		navegador.get("https://www.google.com/");
		// Obtenemos el elemento con id: lst-ib y escribimos "Test"
		navegador.findElement(By.id("lst-ib")).sendKeys("Test");
		
		// No me funciono clickear sobre el componente por lo que opte por diferentes soluciones
		// No funciona:
		//navegador.findElement(By.name("btnK")).click();
		
		// Busca el boton por su nombre y oprime la tecla enter
		// Solucion 1:
		//navegador.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		// Busca el boton por un xpath y presiona la tecla enter
		// Solucion 2:
		//navegador.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		
		// Busca la caja sobre la que estabamos escribiendo y presiona enter
		// Solucion 3:
		//navegador.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
		
		// La solucion 3 se puede resumir de la siguiente forma:
		// navegador.findElement(By.id("lst-ib")).sendKeys("Test"+Keys.RETURN);
	}

}
