package VotacaoBbb2021;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CodigoSplit;
import utils.NavegadorChrome;
import static utils.Constants.*;


public class VotacaoEquenteBbb {

    @Test
    public void votarParticipante() throws InterruptedException {

        String codigo;

        // CRIANDO NOVO NAVEGADOR EXECUTAVEL
        WebDriver navegador = NavegadorChrome.abrirChrome();

        //CRIANDO ESPERA EXPLICITA COM O WAIT
        WebDriverWait wait = new WebDriverWait(navegador, 20);                                  //Artigo bom para estudo e referencia: https://medium.com/@lflucasferreira/entendendo-os-tipos-de-espera-no-selenium-webdriver-2b7adda4db59#

        // SELECIONAR PARTICIPANTE
        for (int i = 0; i<=10; i++) {

            // PRIMEIRO ACESSO AGUARDAR POPUP CHATO
            if(i==0) {
                wait.until(ExpectedConditions.elementToBeClickable(By.id(popUpChato)));
                //clica no botão de cancelar do anuncio
                navegador.findElement(By.id(popUpChato)).click();
            }

            //ENCONTRA O PARTICIPANTE NA TELA
            WebElement fotoParticipante = navegador.findElement(By.xpath(encontrarParticipante));
            ((JavascriptExecutor) navegador).executeScript(posicionarParticipanteTela, fotoParticipante);   // Direciona a tela do usuário na imagem do participante
            JavascriptExecutor js = ((JavascriptExecutor) navegador);                                       // Leve ajuste na direção em que o usuário foi deixado para visualizar a foto
            js.executeScript("scroll(0, 500);");
            Thread.sleep(300);


            // POSIÇÃO CURSO SOBRE PARTICIPANTE
            Actions action = new Actions(navegador);
            Thread.sleep(300);                                                                       // Apenas para deixar o efeito da pagina ser exibida para o usuario
            action.moveToElement(fotoParticipante).click().build().perform();

            //DESCOBRIR CODIGO CAPTCHA
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(encontrarCodigo)));
            WebElement codigoImg = navegador.findElement(By.xpath(encontrarCodigo));
            codigo = codigoImg.getAttribute("src");

            //ENVIANDO CODIGO PARA DESCRITOGRAFIA NA CLASSE CODIGOSPLIT
            codigo = CodigoSplit.decifarCodigo(codigo);

            // PREENCHER CAMPO COM O CODIGO
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(inputCodigo))).click();
            navegador.findElement(By.xpath(inputCodigo)).sendKeys(codigo);
            navegador.findElement(By.xpath(confirmarcodigo)).click();
            Thread.sleep(500);                                                                         //O modal de sucesso dessa pagina não foi possivel aplicar wait ele nao reconhecia o seletor
        }
    }
}


