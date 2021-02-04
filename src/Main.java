public class Main {

    public static void main(String[] args) {
        AudioFileUploadFacade audioFileUploadFacade = new AudioFileUploadFacade();

        audioFileUploadFacade.uploadSong("John", "Lacrimosa", new byte[]{1, 2, 3});
        audioFileUploadFacade.uploadSong("Kate", "Lacrimosa", new byte[]{1, 2, 3});
        audioFileUploadFacade.uploadSong("William", "Another song", new byte[]{1, 2, 3});

        audioFileUploadFacade.printAllUploads();

    }

}
