import java.time.Instant;
import java.util.Objects;

public class AudioFileUploadFacade {
    private final AudioFileUploadService audioFileUploadService =
            new AudioFileUploadServiceImpl(new AudioFileFactoryImpl());

    public void uploadSong(String author, String songName, byte[] songContent) {
        audioFileUploadService.upload(author, Instant.now(), songName, songContent);
    }

    public void printAllUploads() {
        var uploads = audioFileUploadService.getAllUploads();

        for (UserUpload userUpload : uploads ) {
            System.out.println(
                    "Upload: by " + userUpload.getUploadedBy() +
                    " at " + userUpload.getUploadedAt() +
                     "song object identity: " + Objects.hashCode(userUpload.getAudioFile())
            );
        }
    }

}
