package color;

enum Color {
    ROJO(255, 0, 0),
    VERDE(0, 255, 0),
    AZUL(0, 0, 255);
  
    private int r, g, b;
  
    Color(int r, int g, int b) {
      this.r = r;
      this.g = g;
      this.b = b;
    }
  
    public String getRGB() {
      return "(" + r + ", " + g + ", " + b + ")";
    }
}