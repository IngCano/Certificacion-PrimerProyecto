// Importamos el controlador para utilizar el navegador Chrome
import org.openqa.selenium.chrome.ChromeDriver;
// Importamos la clase que nos permite "navegar" por el navegador
import org.openqa.selenium.WebDriver;

// Importamos el localizador
import org.openqa.selenium.By;

public class ChromeTest {
	
	private static final String DRIVER_LOCATION = "S:\\Mis_Proyectos\\Java\\Eclipse AutoTesting\\Complementos\\chromedriver_win32\\chromedriver.exe";

	public static void main(String[] args) {
		// Ubicacion del controlador para chrome
		System.setProperty("webdriver.chrome.driver", DRIVER_LOCATION);
		// Instanciamos un nuevo navegador
		WebDriver navegador = new ChromeDriver();
		// Navegamos hacia https://www.google.com/
		navegador.get("https://www.google.com/");
		// Obtenemos el elemento con id: lst-ib y escribimos "Test"
		navegador.findElement(By.id("lst-ib")).sendKeys("Test");
		// Obtenemos el boton y clickeamos sobre el
		navegador.findElement(By.name("btnK")).click();		
	}

}
