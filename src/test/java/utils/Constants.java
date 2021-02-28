package utils;


public class Constants {

    // CLASSE NAVEGADOR CHROME
    public static String execChromeDriver = "webdriver.chrome.driver";
    public static String dirChromeDriver = "C:\\driversWeb\\chromedriver.exe";          // Altere aqui o diretorio onde está o seu ChromeDriver
    public static String uriEnqueteBbb = "http://www.enquetebbb.com.br/bbb21/enquete/enquete-bbb-21-quem-deve-ser-o-quinto-eliminado";

    // VOTACAOBBB2021
    public static String participante = "Pocah";                                        // Altere aqui o nome do participante para votar
    public static String encontrarParticipante = "//*[@alt=\""+participante+"\"]";
    public static String posicionarParticipanteTela = "arguments[0].scrollIntoView(true);";
    public static String popUpChato = "onesignal-slidedown-cancel-button";
    public static String encontrarCodigo = "//*[@id=\"voto_ocultar\"]/img";
    public static String inputCodigo = "//*[@cid=\"code\"]";
    public static String confirmarcodigo = "//*[@value=\"Confirmar\"]";
}
