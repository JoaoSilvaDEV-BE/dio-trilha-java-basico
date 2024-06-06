public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Mudando canal para: " + canal);
    }

    public void proximoCanal() {
        // Canal = canal + 1;
        canal++;
        System.out.println("Mudando canal para: " + canal);
    }

    public void anteriorCanal() {
        // Canal = canal + 1;
        canal--;
        System.out.println("Mudando canal para: " + canal);
    }

    public void aumentarVolume() {
        // Volume = volume + 1;
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        // Volume = volume - 1;
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }
}
