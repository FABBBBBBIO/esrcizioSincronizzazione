public class Utenti extends Thread{
    private String nome;
    private Memoria memo;

    public Utenti(String nome,Memoria memo) {
        this.nome = nome;
        this.setName(nome);
        this.memo=memo;
    }

    public String getNome() {
        return this.nome;
    }
    public Memoria getMemoria() {
        return this.memo;
    }
    public void setMemo(Memoria memo) {
        this.memo = memo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return "nome "+getNome()+" memoria "+ getMemoria();
    }

    @Override
    public void run(){
        for (int i=0;i<5;i++){
            int n = (int)(Math.random()*600);
            memo.save(n);
            int n2 = (int)(Math.random()*600);
            memo.Eliminazione(n2);
        }
    }
}
