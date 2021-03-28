public class Lutador {
    public static void main(String[] args) {
      OLutador l[] = new OLutador[6];
      l[0] = new OLutador("Pretty Boy", "França", 31, 1.75, 68.9,11, 2, 1);
      l[1] = new OLutador("Putscript", "Brasil",29, 1.68,57.8,14,2,3);
      l[2] = new OLutador("Snapshadow", "EUA",35,1.65,80.9,12,2,1);
      l[3] = new OLutador("Dead Code","Australia",28,1.93,81.6,13,0,2);
      l[4] = new OLutador("Ufocobol","Brasil",37,1.70,119.3,5,4,3);
      l[5] = new OLutador("Nerdaard","Brasil",30,1.81,105.7,12,2,4);

      /*OLutador l1 = new OLutador("Pretty Boy", "França", 31, 1.75, 68.9,11, 2, 1);
    OLutador l2 = new OLutador("Putscript", "Brasil",29, 1.68,57.8,14,2,3);
    OLutador l3 = new OLutador("Snapshadow", "EUA",35,1.65,80.9,12,2,1);
    OLutador l4 = new OLutador("Dead Code","Australia",28,1.93,81.6,13,0,2);
    OLutador l5 = new OLutador("Ufocobol","Brasil",37,1.70,119.3,5,4,3);
    OLutador l6 = new OLutador("Nerdaard","Brasil",30,1.81,105.7,12,2,4); */

        l[0].apresentar();
        l[1].status();
        l[2].ganharLuta();
        l[3].perderLuta();
        l[4].empatarLuta();
        l[5].setPeso(108);
        l[2].status();
        l[3].status();
        l[4].status();
        l[5].status();

    }
}
