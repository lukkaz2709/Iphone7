// Classe iPhone que implementa todas as funcionalidades
class Iphone implements ReprodutorMusical, AparelhoTelefonico, WebBrowser {
    
    @Override
    public void playMusic(String song) {
        System.out.println("Reproduzindo música: " + song);
    }

    @Override
    public void pauseMusic() {
        System.out.println("Música pausada");
    }

    @Override
    public void stopMusic() {
        System.out.println("Música parada");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Ligando para: " + number);
    }

    @Override
    public void receiveCall(String caller) {
        System.out.println("Recebendo chamada de: " + caller);
    }

    @Override
    public void endCall() {
        System.out.println("Chamada encerrada");
    }

    @Override
    public void openPage(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando página");
    }

    @Override
    public void closePage() {
        System.out.println("Página fechada");
    }
}

