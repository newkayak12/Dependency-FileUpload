import org.junit.jupiter.api.Test;
import org.newkayak.FileUpload.FileResult;
import org.newkayak.FileUpload.FileUpload;
import org.springframework.mock.web.MockMultipartFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileTest {
    @Test
    public void save() throws IOException {
        String output = "/Users/sanghyeonkim/Downloads/port/netflixClone/files";
        String input = "/Users/sanghyeonkim/Downloads/R1280x0.png";
        FileInputStream inputStream = new FileInputStream(input);
        MockMultipartFile file = new MockMultipartFile("TEST", "TEST.png", "png", inputStream);
        FileUpload upload = new FileUpload(output, true, 1024L * 1024L * 100);

        System.out.println(upload.upload(true, file).stream().findAny().get());
    }

    @Test
    public void remove() {
        String output = "/Users/sanghyeonkim/Downloads/port/netflixClone/files";
        String target = "20230610/b6d1b9e3-afa3-4987-adc2-b3a3a3d83047.png";
        FileUpload upload = new FileUpload(output, true, 1024L * 1024L * 100);
        FileResult result = new FileResult(null, target, null, null);
        System.out.println(upload.remove(result));
    }

    @Test
    public void mp4() throws IOException {
        String input = "/Users/sanghyeonkim/Downloads/port/netflixClone/source/zerocho_js/02.mp4";
        String output = "/Users/sanghyeonkim/Downloads/port/netflixClone/list";

        FileInputStream inputStream = new FileInputStream(input);
        FileUpload upload = new FileUpload(output, false, 1024L * 1024L * 1024L * 500);
        MockMultipartFile file = new MockMultipartFile("TEST", "TEST.mp4", "video", inputStream);
        upload.upload(false, file);
    }
}
