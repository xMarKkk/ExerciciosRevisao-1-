class Main {
  public static void main(String[] args) {
    int n1, rep;
    System.out.println("Estes são os 100 primeiros números pares:");

    for(n1=2, rep=99; rep>0;rep--, n1+=2){
      System.out.print(n1+", ");
      if(rep == 1){
        n1+=2;
        System.out.print(n1+".");
      }
    }
  }
}