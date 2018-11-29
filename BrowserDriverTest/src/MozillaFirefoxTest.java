// Importamos el controlador para utilizar el navegador Firefox
import org.openqa.selenium.firefox.FirefoxDriver;
//Importamos la clase que nos permite "navegar" por el navegador
import org.openqa.selenium.WebDriver;
//Importamos el localizador
import org.openqa.selenium.By;

public class MozillaFirefoxTest {

	private static final String DRIVER_LOCATION = "S:\\Mis_Proyectos\\Java\\geckodriver-v0.23.0-win32\\geckodriver.exe";
	
	public static void main(String[] args) {
		// Ubicacion del controlador para Firefox
		System.setProperty("webdriver.gecko.driver", DRIVER_LOCATION);
		// Instanciamos un nuevo navegador
		WebDriver navegador = new FirefoxDriver();
		// Navegamos hacia https://www.google.com/
		navegador.get("https://www.google.com/");
		// Obtenemos el elemento con id: lst-ib y escribimos "Test"
		navegador.findElement(By.id("lst-ib")).sendKeys("Test");
		// Obtenemos el boton y clickeamos sobre el
		navegador.findElement(By.name("btnK")).click();
	}

}
