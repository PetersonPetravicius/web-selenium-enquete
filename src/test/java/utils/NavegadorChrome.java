package utils;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.jws.WebMethod;

import static utils.Constants.*;

public class NavegadorChrome {

    @WebMethod
    public static WebDriver abrirChrome() {

        // ABRIR SITE DE VOTAÇÃO
        System.setProperty(execChromeDriver, dirChromeDriver);
        WebDriver nav = new ChromeDriver();
        nav.get(uriEnqueteBbb);
        nav.manage().window().maximize();                               // Maximiza a tela do navegador
        return nav;
    }
}
