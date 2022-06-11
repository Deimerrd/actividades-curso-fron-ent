/*Por último, para el Switch, deberás crear la variable estacion, 
y distintos case para las cuatro estaciones del año. Dependiendo del 
valor de la variable estacion se deberá mandar un mensaje por consola 
informando de la estación en la que está. También habrá que poner un default
 para cuando el valor de la variable no sea una estación. */


public class ejercicio5 {

    
    public static void main(String[] args) throws Exception{

        int mes = 9;
        String estacion;
         
        // instrucción switch con tipo de datos int
        switch (mes) 
        {
            case 3:  estacion = "primavera";
                     break;
            case 6:  estacion = "verano";
                     break;
            case 9:  estacion = "otoño";
                     break;
            case 12:  estacion = "invierno";
                     break;
            
            default: estacion = "Dia inválido";
                     break;
        }
        System.out.println(estacion);
    }
    
}
