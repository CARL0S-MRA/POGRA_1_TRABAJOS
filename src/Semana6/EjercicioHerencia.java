package Semana6;

public class EjercicioHerencia {
    public static void ordernar(){
        for (int x = 0; x < 3; x++) {
            for (int y = 1; y < 3; y++) {
                if (toyota[y-1].setAnio()>toyota[y].getAnio()) {
                    temp=toyota[y-1];
                    toyota[y]=toyota[y-1];
                    toyota[y-1]=temp;
                }
                
            }
            
        }
        
    }
    public static void presentar(){
        for (int i = 0; i < 3; i++) {
            System.out.println("El modelo es: "+toyota[i].getModelo());
            System.out.println("El anio del vehiculo es: "+toyota[i].getAnio());
            System.out.println("El tamanio del bahul es: "+toyota[i].getTam_baul());
        }
    }
    public static turismo toyota[]=new turismo[3];
    public static turismo temp= new turismo();
    public static void main(String[] args) {
        toyota[0]=new turismo();
        toyota[0].setModelo("Yaris");
        toyota[0].setAnio(2018);
        toyota[0].setTam_baul(2);
        
        toyota[1]=new turismo();
        toyota[1].setModelo("Corolla");
        toyota[1].setAnio(2020);
        toyota[1].setTam_baul(3);
        
        toyota[2]=new turismo();
        toyota[2].setModelo("Tercel");
        toyota[2].setAnio(2008);
        toyota[2].setTam_baul(1);
        
        presentar();
        System.out.println("++++++ORDENADO++++++");
        ordernar();
    }
}
