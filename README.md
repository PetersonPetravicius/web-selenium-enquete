"# SeleniumWebDriver-EnqueteBbb2021" 

Para execução deste script você deverá se atentar aos checkpoint descritos abaixo:

1 - Sistema Operacional: 

    1.1 - Para execução do Script em Linux, MacOS ou Windows deve-se baixar o ChromeDriver especifico para seu sistema operacional.
          1.2 - Alterar a linha 09 da classe "Constants" para a forma de escrita do diretorio onde se encontra o driver baixado.
         
2 - Disponibilidade da Enquete:

    2.1 a URL http://www.enquetebbb.com.br/bbb21/enquete/votar-bbb-quarto-paredao-bbb21 deve estar disponivel com alguma enquete.
    
3 - Participantes atuais da Enquete:

    3.1 - Você deve alterar a linha 11 da classe "Constants" para o nome de um dos participantes da enquete atual que deseja votar.
        3.2 - Caso o site não esteja mais disponível, você pode verificar uma evidência do funcionamento desse codigo no meu Google Drive: https://drive.google.com/file/d/1LQD0IYpCM3l5LS-mXblr9ghdLLIhyNay/view?usp=sharing

4 - Descritografia do Captcha:

    4.1 - Em casos de erro no Captcha, inspecione o src do codigo de verificação e verifique se a descriptografia do codigo ainda segue a sequencia após o "=" de charAt(2) charAt(4) charAt(7)   
        4.2 - Se a logica do codigo tiver sido alterada, reconfigure o String Builder na classe "CodigoSplit".
