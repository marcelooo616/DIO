package models;

public interface ReprodutorMusical {
    void startAudio(String T);
    void pauseAudio();
    void stopAudio();
    void nextTrack();
    void previousTrack();
}
