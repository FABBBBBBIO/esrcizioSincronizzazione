public class Memoria {
    private String nome;
    private int capienza;
    private int capLibera;


    public Memoria(String nome, int capienza) {
        this.nome = nome;
        this.capienza = capienza;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapienza() {
        return this.capienza;
    }

    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }

    public int getCapLibera() {
        return this.capLibera;
    }

    public void setCapLibera(int capLibera) {
        this.capLibera = capLibera;
    }

    public synchronized Boolean save(int spazio){
        if(this.capLibera>=spazio){
                this.capLibera-=spazio;
                System.out.println(Thread.currentThread().getName()+" salvataggio di: "+spazio+" dati");
                System.out.println("memoria disponibile: "+capLibera);
            return true;
        }
        return false;
    }

    public synchronized boolean Eliminazione(int spazio){
        if(this.capienza-this.capLibera>=spazio){
                this.capLibera+=spazio;
                System.out.println(Thread.currentThread().getName()+" eliminazione di: "+spazio+" dati");
                System.out.println("memoria disponibile: "+capLibera);
            return true;
        }
        return false;
    }
    public synchronized void Formattazione(){
        this.capLibera=this.capienza;
    }

    public String toString(){
        return "spazio di memoria libera: " + this.capLibera;
    }
}
