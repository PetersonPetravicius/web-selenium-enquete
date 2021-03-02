package utils;
import VotacaoBbb2021.*;

public class Constants {

    // CLASSE NAVEGADOR CHROME
    public static String execChromeDriver = "webdriver.chrome.driver";
    public static String dirChromeDriver = "C:\\driversWeb\\chromedriver.exe";          // Altere aqui o diretorio onde está o seu ChromeDriver
    public static String uriEnqueteBbb = "http://www.enquetebbb.com.br/bbb21/enquete/votar-bbb-quinto-paredao-bbb21";


    // VOTACAOBBB2021
    public static String encontrar1 = "//*[@alt=\"";
    public static String encontrar2 = "\"]";
    public static String posicionarParticipanteTela = "arguments[0].scrollIntoView(true);";
    public static String popUpChato = "onesignal-slidedown-cancel-button";
    public static String encontrarCodigo = "//*[@id=\"voto_ocultar\"]/img";
    public static String inputCodigo = "//*[@cid=\"code\"]";
    public static String confirmarcodigo = "//*[@value=\"Confirmar\"]";
}
