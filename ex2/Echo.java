import java.util.*;

public class Echo {

  char frst;
  int len;

  public Echo(String mot){
    this.frst = mot.charAt(0);
    this.len = mot.length();
  }

  ArrayList<Character> tab = new ArrayList<Character>();

  public String toString(){
    for (int i=0; i<this.len; i++) {
      tab.add(frst);
    }
    String c = String.valueOf(tab);
    return c.replaceAll("[,\\s\\[\\]]", "");
  }

  public int longueur(){
    System.out.println("longueur : "+this.len);
    return this.len;
  }

  public void doublelong(){
    System.out.print("double longueur : ");
    for (int i=0; i<(this.len)*2; i++) {
      System.out.print(String.valueOf(frst));
    }
    System.out.println();
  }
}
