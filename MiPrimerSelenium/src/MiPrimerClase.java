// Paso 1: Realizar los imports
import org.openqa.selenium.chrome.ChromeDriver; // Importamos el driver para el navegador
import org.openqa.selenium.WebDriver; // Importamos la clase WebDriver para "navegar" por el navegador
import org.apache.commons.exec.launcher.Java13CommandLauncher;
import org.openqa.selenium.By; // Importamos el localizador

public class MiPrimerClase {

	public static void main(String[] args) {
		// Paso 2: Ubicar el controlador
		// El controlador para chrome se encuentra en la dirección especificada
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		// Paso 3: Creamos nuestro robot, instanciamos un nuevo objeto y se lo asignamos a nuestro robot
		// Cuando creamos nuestro robot, automaticamente estamos abriendo una nueva ventana en el navegador
		WebDriver robot = new ChromeDriver();
		
		// Paso 4: Accedemos a https://www.google.com/
		robot.get("https://www.google.com/");
		
		// Paso 5: Buscamos el elemento por id y escribimos adentro: Suso
		robot.findElement(By.id("lst-ib")).sendKeys("Suso");
		
	}

}
