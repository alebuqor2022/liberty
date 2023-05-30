package clase2;

public class TestArrays {
    public static void main(String[] args){
        ejemplo10();
    }

    static void ejemplo1(){
        // declaracion e inicializacion
        String[] items={"Camisa", "Pantalon", "Bufanda"}; // 0, 1 y 2, pero el lenght =3

        for(int i=0; i< items.length; i++ ){ // i++ --> i=i+1
            System.out.println(items[i]);
        }
    }

    static void ejemplo2(){
        // declaracion e inicializacion
        String[] items={"Camisa", "Pantalon", "Bufanda"}; // 0, 1 y 2, pero el lenght =3

        try {
            for (int i = 0; i <= items.length; i++) { // i++ --> i=i+1
                System.out.println(items[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("desborde del indice");
        } catch (Exception e1){
            System.out.println(e1.getMessage());
        }
    }

    static void ejemplo3(){
        // declarar y dimensionar
        String valores[]=new String[3];
        // cargar valores
        valores[0]="rojo";
        valores[1]="azul";
        valores[2]="verde";
        for (int i = 0; i < valores.length; i++) { // i++ --> i=i+1
            System.out.println(valores[i]);
        }

    }

    static void ejemplo4(){
        // matriz de 2 filas 3 columnas
        // declaro e inicializo
        String[][] ciudades={
                {"Bs As", "Madrid", "SaoPablo"},{"Argentina", "España", "Brasil"}
        };

        for (int i = 0; i < ciudades.length; i++) { // es para las filas
            for (int j = 0; j < ciudades[i].length; j++) { // es para las columnas
                System.out.print(ciudades[i][j] + ", "); // fila / columnas
            }
            System.out.println();
        }
    }

    static void ejemplo5(){
        // declaro la variable iteradora por afuera del FOR
        int i=1;
        for(; i<=10; i++){
            System.out.println("el valor de i es  " + i);
        }
    }

    static void ejemplo6(){
        // ir para atras
        for(int i = 10; i>=0; i--){
            System.out.println("el valor de i es  " + i);
        }
    }

    static void ejemplo7(){
        // recorrer con saltos
        for(int i = 0; i<=10; i+=2){
            System.out.println("el valor de i es  " + i);
        }
    }

    static void ejemplo8(){

        String[] items={"Camisa", "Pantalon", "Bufanda"};
        // For Each
        for(String i : items){
            System.out.println("el valor de item es  " + i);
        }
    }

    static void ejemplo9(){
        // uso WHILE
        // 1er caso ... si no cumple la condicion NO SE EJECUTA NI 1 VEZ

        boolean valor=false;
        int cont=1;
        while(valor){
            System.out.println("hola");
            cont++;
            if (cont == 3){
                valor=false;
            }
        }

        // siempre se ejecuta 1 vez, aunque no se cumpla la condicion
        valor=false;
        cont=1;
        do{
            System.out.println("chau");
            cont++;
            if (cont == 3){
                valor=false;
            }
        } while(valor);
    }
    static void ejemplo10() {
        // uso de BREAK y/o CONTINUE
        for(int i=1;i<=4;i++) {
            if(i==3)break;
            System.out.println("iteracion nro: " +i);
        }

        for(int i=1;i<=4;i++) {
            if(i==3)continue;
            System.out.println("2da iteracion nro: " +i);
        }

    }
}
