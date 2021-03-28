public class OLutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

   public void apresentar(){
       System.out.println("Chegou a hora! Apresentamos o lutador : " + this.getNome());
       System.out.println("Diretamente de : " + this.getNacionalidade());
       System.out.println("Com " + this.getIdade() + ", anos.");
       System.out.println(this.getAltura() + "m de altura.");
       System.out.println("Pesando " + this.getPeso() + "Kgs!");
       System.out.println("Ganhou " + this.getVitorias() + " lutas!");
       System.out.println("Perdeu " + this.getDerrotas() + " lutas.");
       System.out.println("Empatou " + this.getEmpates()+ " lutas.");
   }
   public void status(){
       System.out.println(this.getNome());
       System.out.println("É um peso " + this.getCategoria());
       System.out.println(this.getVitorias() + " vitórias");
       System.out.println(this.getDerrotas() + " derrotas");
       System.out.println(this.getEmpates() + " empates");
   }
   public void  ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
   }
   public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
   }
   public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
   }
   //METODOS ESPECIAIS

    public OLutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
    this.nome = no;
    this.nacionalidade = na;
    this.idade = id;
    this.altura = al;
    this.setPeso(pe);
    this.vitorias = vi;
    this.derrotas = de;
    this.empates = em;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {

            if (this.peso < 52.2){
                this.categoria = "Inválido";
            }else if (this.peso <=70.3){
                this.categoria = "Leve";
            } else if (this.peso <=83.9){
                this.categoria = "Médio";
            } else if (this.peso <= 120.2){
                this.categoria = "Pesado";
            } else{
                this.categoria = "Inválido";
            }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
