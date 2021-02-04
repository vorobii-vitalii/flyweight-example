import java.time.Instant;

public class UserUpload {
    private final AudioFile audioFile;
    private final String uploadedBy;
    private final Instant uploadedAt;

    public UserUpload(AudioFile audioFile, String uploadedBy, Instant uploadedAt) {
        this.audioFile = audioFile;
        this.uploadedBy = uploadedBy;
        this.uploadedAt = uploadedAt;
    }

    public AudioFile getAudioFile() {
        return audioFile;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }

    public Instant getUploadedAt() {
        return uploadedAt;
    }

}
