import entities.Iphone;

public class App {
    public static void main(String[] args) {

        // Criar instância de entities.Iphone
        Iphone iphone = new Iphone();

        // Exibir informações básicas do smartphone
        iphone.setTitle("iPhone 14");
        iphone.setNumber("(11) 983648227");
        iphone.exibirInfo();

        // Ligar o smartphone
        System.out.println("\nLigando o smartphone...");
        iphone.alternarSmartPhone();

        // Habilitar Wi-Fi
        System.out.println("\nHabilitando o Wi-Fi...");
        iphone.alternarWifi();

        // Habilitar Dados Móveis
        System.out.println("\nHabilitando dados móveis...");
        iphone.alternarDadosMoveis();

        // Habilitar GPS
        System.out.println("\nHabilitando GPS...");
        iphone.alternarGps();

        // Simular navegação na internet
        System.out.println("\nSimulando navegação na internet...");
        iphone.pesquisar("www.google.com");
        iphone.abrirNovaAba("www.youtube.com");
        iphone.atualizarPagina();
        iphone.voltarPagina();
        iphone.avancarPagina();
        iphone.fecharAba();

        // Simular reprodução de áudio
        System.out.println("\nSimulando reprodução de música...");
        iphone.startAudio("Imagine - John Lennon");
        iphone.pauseAudio();
        iphone.startAudio("Imagine - John Lennon");  // Tentar reproduzir novamente
        iphone.nextTrack();
        iphone.previousTrack();
        iphone.stopAudio();

        // Desligar o smartphone
        System.out.println("\nDesligando o smartphone...");
        iphone.alternarSmartPhone();
    }
}
