public class App {
    public static void main(String[] args) throws Exception {
        Memoria m1=new Memoria("USB",1000);
        Utenti u1=new Utenti("fabio",m1);
        Utenti u2=new Utenti("meratti", m1);

        u1.start();
        u2.start();

        u1.join();
        u2.join();
    }
}
