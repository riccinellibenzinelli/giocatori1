public class Giocatore {
    private String nome;
    private boolean capitano;
    private int goal;
        public Giocatore (String nomeGiocatore, boolean isCapitano, int isGoal){
            setNome(nome);
            setCapitano(capitano);
            setGoal(goal);
        }
        public Giocatore(String nome){
            setNome(nome);
        }
        public Giocatore(boolean capitano){
            setCapitano(capitano);
    }
        public Giocatore(int goal){
            setGoal(goal);
    }
        public Giocatore(String nome,boolean capitano){
            setNome(nome);
            setCapitano(capitano);
    }
        public Giocatore(String nome,int goal){
            setNome(nome);
            setGoal(goal);
    }
        public Giocatore(boolean capitano,int goal){
            setCapitano(capitano);
            setGoal(goal);
    }
        public Giocatore(){
            setGoal(goal);
            setCapitano(capitano);
            setNome(nome);
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
            setNome(nome);
    }

        public void setCapitano(boolean capitano) {
            setCapitano(capitano);
    }

        public void setGoal(int goal) {
            setGoal(goal);
    }
}
