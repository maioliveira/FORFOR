package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] objectArray = new String[3];
        String[] colorArray = new String[3];

        objectArray[0] = "panela";
        objectArray[1] = "copo";
        objectArray[2] = "prato";

        colorArray[0] = "verde";
        colorArray[1] = "azul";
        colorArray[2] = "preto";

        for (int contador = 0; contador < objectArray.length; contador++) {
            for (int contador2 = 0; contador2 < colorArray.length; contador2++) {
                System.out.print("O objeto \"" + objectArray[contador] + "\" ");
                System.out.print("é da cor \"" + colorArray[contador2] + "\".\n");

// \n serve para ir para linha de baixo no print.
            }
        }
    }
}
