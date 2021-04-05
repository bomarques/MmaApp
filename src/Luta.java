import java.util.Random;

public class Luta {
    //Atributos
    private OLutador desafiado;
    private OLutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Metodos Públicos
    public void marcarLuta(OLutador l1, OLutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
        && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            System.out.println("==========RESULTADO DA LUTA==========");
            switch (vencedor){
                case 0://Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1://Desafiado Vence
                    System.out.println("Vitórioa do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2://Desafiante Vence
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.ganharLuta();
                    break;
            }
            System.out.println("====================================");

        } else {
            System.out.println("A Luta não pode acontecer!");
        }

    }
    //Metodos Especiais

    public OLutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(OLutador desafiado) {
        this.desafiado = desafiado;
    }

    public OLutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(OLutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
