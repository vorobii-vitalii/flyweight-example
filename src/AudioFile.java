public class AudioFile {
    private final String audioName;
    private final byte[] content;

    public AudioFile(String audioName, byte[] content) {
        this.audioName = audioName;
        this.content = content;
    }

    public byte[] getContent() {
        return content;
    }

    public String getAudioName() {
        return audioName;
    }

}
