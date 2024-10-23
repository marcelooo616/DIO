package entities;

public class Iphone extends SmartPhone {

    private boolean isPlayingMusic = false;
    private boolean isPageLoaded = false;

    // Implementação de métodos da interface models.NavegadorInternet

    @Override
    public void pesquisar(String text) {
        isPageLoaded = true;
        System.out.println("Pesquisando por: " + text + " no navegador...");
        System.out.println("Página carregada.");
    }

    @Override
    public void abrirNovaAba(String url) {
        System.out.println("Abrindo nova aba com URL: " + url);
        isPageLoaded = true;
    }

    @Override
    public void atualizarPagina() {
        if (isPageLoaded) {
            System.out.println("Atualizando a página atual...");
        } else {
            System.out.println("Nenhuma página carregada para atualizar.");
        }
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando para a página anterior...");
    }

    @Override
    public void avancarPagina() {
        System.out.println("Avançando para a próxima página...");
    }

    @Override
    public void fecharAba() {
        System.out.println("Fechando a aba atual.");
        isPageLoaded = false;
    }

    // Implementação de métodos da interface models.ReprodutorMusical

    @Override
    public void startAudio(String text) {
        if (!isPlayingMusic) {
            isPlayingMusic = true;
            System.out.println("Iniciando música: " + text);
            System.out.println("Tocando música...");
        } else {
            System.out.println("Já está tocando uma música.");
        }
    }

    @Override
    public void pauseAudio() {
        if (isPlayingMusic) {
            isPlayingMusic = false;
            System.out.println("Música pausada.");
        } else {
            System.out.println("Nenhuma música está tocando no momento.");
        }
    }

    @Override
    public void stopAudio() {
        if (isPlayingMusic) {
            isPlayingMusic = false;
            System.out.println("Música parada.");
        } else {
            System.out.println("Nenhuma música está tocando para parar.");
        }
    }

    @Override
    public void nextTrack() {
        System.out.println("Avançando para a próxima faixa...");
    }

    @Override
    public void previousTrack() {
        System.out.println("Voltando para a faixa anterior...");
    }
}

