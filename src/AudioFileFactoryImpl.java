import java.util.HashMap;
import java.util.Map;

public class AudioFileFactoryImpl implements AudioFileFactory {
    private final Map<String, AudioFile> audioFileHash = new HashMap<>();

    @Override
    public AudioFile putAudioFile(String audioName, byte[] audioContent) {
        if (!audioFileHash.containsKey(audioName)) {
            audioFileHash.put(audioName, new AudioFile(audioName, audioContent));
        }
        return audioFileHash.get(audioName);
    }

}
