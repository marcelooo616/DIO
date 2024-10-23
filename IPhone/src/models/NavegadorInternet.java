package models;

public interface NavegadorInternet {
    void pesquisar(String url);
    void abrirNovaAba(String url);
    void atualizarPagina();
    void voltarPagina();
    void avancarPagina();
    void fecharAba();
}

