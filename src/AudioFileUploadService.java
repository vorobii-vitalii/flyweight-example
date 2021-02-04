import java.time.Instant;
import java.util.List;

public interface AudioFileUploadService {
    void upload(String author, Instant uploadedAt, String songName, byte[] songContent);
    List<UserUpload> getAllUploads();
}
