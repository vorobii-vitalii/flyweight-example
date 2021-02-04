import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class AudioFileUploadServiceImpl implements AudioFileUploadService {
    private final List<UserUpload> userUploads = new ArrayList<>();
    private final AudioFileFactory audioFileFactory;

    public AudioFileUploadServiceImpl(AudioFileFactory audioFileFactory) {
        this.audioFileFactory = audioFileFactory;
    }

    @Override
    public void upload(String author, Instant uploadedAt, String songName, byte[] songContent) {
        var audioFile = audioFileFactory.putAudioFile(songName, songContent);

        userUploads.add(new UserUpload(audioFile, author, uploadedAt));
    }

    @Override
    public List<UserUpload> getAllUploads() {
        return new ArrayList<>(userUploads);
    }

}
