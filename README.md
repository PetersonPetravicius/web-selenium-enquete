"# SeleniumWebDriver-EnqueteBbb2021" 

Para plena execução deste script você deverá se atentar aos checkpoint descritos a baixo:

1 - Sistema Operacional: 

    Para execução do Script em Linux ou MacOS deve-se alterar a linha 20 da classe "VotarNaCarolConka" especificamente no formato como o diretorio do arquivo chromedriver.exe está escrito.

2 - Verificar se a URL da enquente ainda está disponivel.

3 - Verificar se os participantes da enquente são: Carol Conká / Gilberto / Arthur

    3.1 - É possivel adaptar o codigo para votar em outro participante, alterando as linhas: 29 / 44 / 45 para o xpath do novo participante que se deseja votar.

4 - Inspecionar o src do codigo de verificação e constatar que a descriptação do codigo ainda segue a sequencia após o "=" de charAt(2) charAt(4) charAt(7)   