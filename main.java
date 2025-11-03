
class Main{



    String[] split(){
        String x = "Esto: es un ejemplo";
		String[] output = x.split(" "); 
		for (String y : output) {
			System.out.println(y);
        }
        return output;
    }

    int valorFila(String[] output){
        // int[] valor = new int[output.length];
        int sumaFila = 0; 
        for(int i = 0; i < output.length ; i++){

            // valor[i]
            sumaFila  += output[i].length(); //hace la sumatoria de la cantidad de caracteres en la fila, falta la implementacion de la pantalla
        }
        return sumaFila;
    }


    public static void main(String[] args) {
        Main mn= new Main();
        String[] fila; //
        int valor = 0;

        fila = mn.split();
        valor = mn.valorFila(fila);
        System.err.println("Valor de la fila:" + valor);
    }

}