public class Ponto {
    private double x;
    private double y;

   
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    
    public double calcularDistancia(Ponto outroPonto) {
        return Math.sqrt(Math.pow((outroPonto.getX() - this.x), 2) + Math.pow((outroPonto.getY() - this.y), 2));
    }

   
    public double calcularDistancia(double x, double y) {
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }
}
