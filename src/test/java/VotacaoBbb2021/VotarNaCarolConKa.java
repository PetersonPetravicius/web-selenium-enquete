package VotacaoBbb2021;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class VotarNaCarolConKa {

    @Test
    public void eliminarCarolConKa() throws InterruptedException {

        String cod;

        // ABRIR SITE DE VOTAÇÃO

        System.setProperty("webdriver.chrome.driver", "c:\\temp\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("http://www.enquetebbb.com.br/bbb21/enquete/votar-bbb-quarto-paredao-bbb21");
        //maximizando a tela do navegador
        navegador.manage().window().maximize();

        // SELECIONAR PARTICIPANTE CAROL CONKA BBB21
        for (int i = 0; i<=50000000; i++) {
                                                                     //encontra a foto da participante Carol Conka e direciona o usuário até ela
            WebElement element = navegador.findElement(By.xpath("//*[@src='https://cdn14.level99.com.br/image_resize.php?w=300&h=343&src=image/participantes/karol-conka-bbb21-P.jpg']"));
            ((JavascriptExecutor) navegador).executeScript("arguments[0].scrollIntoView(true);", element);
                                                    //melhoria na direção em que o usuário foi deixado para visualizar a foto
            JavascriptExecutor js = ((JavascriptExecutor) navegador);
            js.executeScript("scroll(0, 500);");
            Thread.sleep(300);

            if(i<=0) {
                Thread.sleep(3700);
                //clica no botão de cancelar do anuncio
                navegador.findElement(By.id("onesignal-slidedown-cancel-button")).click();
                Thread.sleep(300);
            }
            // ação de posicionar o mouse em cima da imagem para efeito de click da pagina + click sob a imagem
            Actions action = new Actions(navegador);
            WebElement we = navegador.findElement(By.xpath("//*[@alt=\"Karol Conká\"]"));
            action.moveToElement(we).moveToElement(navegador.findElement(By.xpath("//*[@alt=\"Karol Conká\"]"))).click().build().perform();

            //DESCOBRIR CODIGO CAPTCHA

            // descobrindo o valor do src no atributo do elemento
            WebElement codigo = navegador.findElement(By.xpath("//*[@id=\"voto_ocultar\"]/img"));
            cod = codigo.getAttribute("src");
            System.out.println("Teste src: " + cod);
            //quebrando a string em dois vetores a partir do =
            String[] splitted = cod.split("=");                         // ex: http://dye218j850tmx.cloudfront.net/image2.php?v=B9IP4OD0
            cod = splitted[1];                                               //  ex: B9IP4OD0

            //construindo a concatenação das posições do vetor necessárias para montar o codigo
            StringBuilder builder = new StringBuilder();
            builder.append(cod.charAt(2));                                               //  ex: I
            builder.append(cod.charAt(4));                                               //  ex: 4
            builder.append(cod.charAt(7));                                               //  ex: 0

            System.out.println("Teste src: " + cod);
            System.out.println("Teste src: " + builder.toString());

            // PREENCHER CAMPO COM O CODIGO
            Thread.sleep(200);
            navegador.findElement(By.xpath("//*[@cid=\"code\"]")).click();
            navegador.findElement(By.xpath("//*[@cid=\"code\"]")).sendKeys(builder.toString());
            navegador.findElement(By.xpath("//*[@value=\"Confirmar\"]")).click();

        }

    }
}


