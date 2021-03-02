package utils;
import javax.swing.*;
import static utils.Constants.encontrar1;
import static utils.Constants.encontrar2;

public class EscolhaDinamica {

    public static String escolherEmparedado(){

        String participante = (String) JOptionPane.showInputDialog( null, "Escolha um emparedado para eliminação:", "Paredão",
                JOptionPane.QUESTION_MESSAGE,null, new Object[] {"Arthur", "Caio","João Luiz","Arcrebiano","Juliette","Kerline","Lumena","Gilberto","Thais","Sarah","Carol Conká","Carla Diaz","Camilla de Lucas","Poca","Nego Di","Lucas Penteado","Rodolfo","Viih Tube","Projota","Fiuk"},"");
        String encontrarParticipante = encontrar1 + participante + encontrar2;
        return encontrarParticipante;
    }

    public static Integer escolherQuantidadeVotos(){

        String quantidadeVotos = (String) JOptionPane.showInputDialog(null,"Quantos votos você deseja efetuar?","Paredão",
                JOptionPane.QUESTION_MESSAGE,null, new Object[] {"1","10","100","1000"},"");
        int votos = Integer.parseInt(quantidadeVotos);
        return votos;
    }
}
