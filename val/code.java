int[] x = {250,500,250,0};
int[] y = {0,250,500,250};

int nb point = 4;

@Override
public void paintComponent(Graphics pinceau) {
  Graphics g = pinceau.create();

  if(this.isOpaque()){
    g.setColor(this.background());
    g.fillRect(0,0,this.getWidth(),this.getHeight());
  }
  Color turquoise = new Color(0,150,150);
  g.setColor(turquoise);
  g.fillPolygon(x,y,this.nb_points);
}
