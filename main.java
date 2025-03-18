 
// Classe principal para testar o iPhone
public class main {
    public static void main(String[] args) {
        Iphone myPhone = new Iphone();
        
        // Testando reprodutor musical
        myPhone.playMusic("Imagine - John Lennon");
        myPhone.pauseMusic();
        myPhone.stopMusic();

        // Testando chamadas telefônicas
        myPhone.makeCall("+351912345678");
        myPhone.receiveCall("+351987654321");
        myPhone.endCall();

        // Testando navegador de internet
        myPhone.openPage("https://www.youtube.com/watch?v=9ou608QQRq8");
        myPhone.refreshPage();
        myPhone.closePage();
    }
}