package utils;

public class CodigoSplit {

    private static String codigoDecifrado;

    public static String decifarCodigo(String codigoBruto){

        // QUEBRANDO A STRING EM VETOR A PARTIR DO "="
        String[] splitted = codigoBruto.split("=");                                     // ex: http://dye218j850tmx.cloudfront.net/image2.php?v=B9IP4OD0
        codigoBruto = splitted[1];                                                            // ex: B9IP4OD0

        // CONSTRUTOR DE STRING
        StringBuilder builder = new StringBuilder();
        builder.append(codigoBruto.charAt(2));                                               //  ex: I
        builder.append(codigoBruto.charAt(4));                                               //  ex: 4
        builder.append(codigoBruto.charAt(7));                                               //  ex: 0

        codigoDecifrado = builder.toString();
        return codigoDecifrado;
    }
}
