
public class Main {
    public static void main(String[] args) {
        // decalramaos los valores de las siguientes variables
        int piscina1_largo = 300;
        int piscina1_ancho = 150;
        int piscina1_profundidad = 20;

        int piscina2_largo = 300;
        int piscina2_ancho = 80;
        int piscina2_profundidad = 35;

        //declaramos , calculamos y mostramos las nuevas siguiente variables

                //El area de las piscinas
        int area_piscina1 = piscina1_ancho * piscina1_largo;
        int area_piscina2 = piscina2_ancho * piscina2_largo;

        System.out.println("El area de la piscina 1 es " + area_piscina1);
        System.out.println("El area de la piscina 2 es " + area_piscina2);

                 //El volumen de las piscinas
        int volumen_piscina1 = area_piscina1 * piscina1_profundidad;
        int volumen_piscina2 = area_piscina2 * piscina2_profundidad;

        System.out.println("el volumen de la piscina 1 es " + volumen_piscina1);
        System.out.println("el volumen de la piscina 2 es " + volumen_piscina2);

                //El espacio total cuando estan juntas las dos piscinas
        int espacio_ancho_total = piscina1_ancho + piscina2_ancho;
        int espacio_largo_total = piscina1_largo;

        System.out.println("el ancho total es " + espacio_ancho_total);
        System.out.println( "el largo total es " + espacio_largo_total);

                //El area de las dos pisicnas juntas
        int area_total = espacio_ancho_total * espacio_largo_total;
        
        System.out.println( "el area total de las dos piscinas es " + area_total);
                // El volumen de las dos piscinas juntas
        int volumen_total = volumen_piscina1 + volumen_piscina2;
        System.out.println("el volumen total es " + volumen_total);

        //Ahora volveremos a calcular intercambiando la profundida de las piscinas
        int piscina1Profundidadtemporal = piscina1_profundidad;
        piscina1_profundidad = piscina2_profundidad;
        piscina2_profundidad = piscina1Profundidadtemporal;

             // Imprimimos las profundidades después del intercambio
        System.out.println("Nueva profundidad de piscina 1 : " + piscina1_profundidad);
        System.out.println("Nueva profundidad de piscina 2 : " + piscina2_profundidad);

        // Calculamos los nuevos volúmenes después del intercambio
        volumen_piscina1 = area_piscina1 * piscina1_profundidad;
        volumen_piscina2 = area_piscina2 * piscina2_profundidad;
        System.out.println("El nuevo volumen de la piscina 1 es " + volumen_piscina1);
        System.out.println("El nuevo volumen de la piscina 2 es " + volumen_piscina2);
    }
}