public class Caneta {
    private String cor; // Atributo privado

    public String marca; // Atributo público

    protected boolean tampa; // Atributo protegido

    String modelo; // Atributo de visibilidade padrão

    private void escrever() { 
        System.out.println("Escrevendo...");
    }

    public void destampar() { 
        tampa = false;
        System.out.println("Caneta destampada!");
    }

    protected void tampar() { 
        tampa = true;
        System.out.println("Caneta tampada!");
    }

    void exibirInformacoes() { 
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Tampa: " + tampa);
        System.out.println("Modelo: " + modelo);
    }

    public static void main(String[] args) {
        Caneta caneta = new Caneta();

        caneta.cor = "Azul"; 
        caneta.marca = "Bic"; 
        caneta.tampa = true; 
        caneta.modelo = "Clássica"; 
        caneta.exibirInformacoes(); 
        caneta.escrever(); 
        caneta.destampar(); 
        caneta.tampar(); 
    }
}
