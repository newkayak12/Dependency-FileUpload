import org.junit.jupiter.api.Test;
import org.newkayak.FileUpload.FileUpload;
import org.springframework.mock.web.MockMultipartFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;

public class FileTest {
    @Test
    public void test() throws IOException {
        String output = "/Users/sanghyeonkim/Downloads/port/netflixClone/files";
        String input = "/Users/sanghyeonkim/Downloads/R1280x0.png";
        FileInputStream inputStream = new FileInputStream(input);
        MockMultipartFile file = new MockMultipartFile("TEST", "TEST.png", "png", inputStream);
        FileUpload upload = new FileUpload(output, true, 1024L * 1024L * 100);

        System.out.println(upload.upload(true, file).size());
    }
}
