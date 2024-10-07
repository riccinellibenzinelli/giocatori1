public class Giocatore {
    private String nome;
    private boolean capitano;
    private int goal;
        public Giocatore (String nomeGiocatore, boolean isCapitano, int isGoal){
            nome = nomeGiocatore;
            capitano = isCapitano;
            goal = isGoal;
        }
        public Giocatore(String nome){
            this.nome = nome;
        }
    public Giocatore(boolean capitano){
        this.capitano = capitano;
    }
    public Giocatore(int goal){
        this.goal = goal;
    }
    public Giocatore(String nome,boolean capitano){
        this.nome = nome;
        this.capitano = capitano;
    }
    public Giocatore(String nome,int goal){
        this.nome = nome;
        this.goal = goal;
    }
    public Giocatore(boolean capitano,int goal){
        this.capitano = capitano;
        this.goal = goal;
    }
    public Giocatore(){
            this.goal = 0;
            this.capitano = false;
            this.nome = null;
    }

        public String getNome(){
            return nome;
    }
        public boolean getCapitano(){
        return capitano;
    }
        public int getGoal(){
        return goal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapitano(boolean capitano) {
        this.capitano = capitano;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }
}
