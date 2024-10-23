package entities;

import models.NavegadorInternet;
import models.ReprodutorMusical;

public abstract class SmartPhone implements ReprodutorMusical, NavegadorInternet {
    private String title;
    private String number;
    private boolean dadosMoveisIsOn = false;
    private boolean wifiIsOn = false;
    private boolean gpsIsOn = false;
    private boolean smartPhoneIsOn = false;

    // Exibir informações básicas
    public void exibirInfo() {
        System.out.println("Modelo: " + title);
        System.out.println("Número: " + number);
    }

    // Alternar dados móveis
    public void alternarDadosMoveis() {
        dadosMoveisIsOn = !dadosMoveisIsOn;
        System.out.println("Dados móveis habilitados? " + dadosMoveisIsOn);
    }

    // Alternar Wi-Fi
    public void alternarWifi() {
        wifiIsOn = !wifiIsOn;
        System.out.println("Wi-Fi habilitado? " + wifiIsOn);
    }

    // Alternar GPS
    public void alternarGps() {
        gpsIsOn = !gpsIsOn;
        System.out.println("GPS habilitado? " + gpsIsOn);
    }

    // Ligar/Desligar o smartphone
    public void alternarSmartPhone() {
        smartPhoneIsOn = !smartPhoneIsOn;
        System.out.println("Smartphone ligado? " + smartPhoneIsOn);
    }

    // Getters e Setters para título e número
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

