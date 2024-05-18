public class Programa {
    public static void main(String[] args) {
        
        Ponto ponto1 = new Ponto();

        
        Ponto ponto2 = new Ponto(2, 5);

        
        double distancia1 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância do ponto1 ao ponto2: " + distancia1);

        double distancia2 = ponto2.calcularDistancia(7, 2);
        System.out.println("Distância do ponto2 às coordenadas (7,2): " + distancia2);

        
        ponto1.setX(10);

        
        ponto1.setY(3);

        
        System.out.println("Novo valor de ponto1 (x, y): (" + ponto1.getX() + ", " + ponto1.getY() + ")");
    }
}
