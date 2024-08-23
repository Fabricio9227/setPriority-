package MinhaThreadRunnable;

public class MinhaThreadRunnable implements Runnable {
    //Atributos
    private String nome;
    private int tempo;

    //Construtor
    public MinhaThreadRunnable(String n, int t) {
        this.nome = n;
        this.tempo = t;
        Thread th = new Thread(this); //Aqui, criamos uma nova thread que recebe como parâmetro o "this" que faz referência à própria classe 
        th.start(); //Inicia a thread
    }

    @Override
    public void run() {
        try {
            for(int i=0; i<6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo); //Cada vez que for executado, de acordo com o que for passado no parâmetro do construtor, a Thread irá dormir um determinado tempo
            }
        } catch (InterruptedException erro) {
            erro.printStackTrace();
        }
        System.out.println(nome + " terminou a execução");
    }
    
}

