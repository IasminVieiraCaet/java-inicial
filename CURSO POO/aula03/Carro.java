package aula03;

public class Carro {
    private Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    public void ligar() {
        System.out.println("Carro ligado");
        motor.iniciar();
    }

    public void desligar() {
        System.out.println("Carro desligado");
        motor.parar();
    }
    
}

            
    
    

   

