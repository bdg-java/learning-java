package jsonparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileToString extends Thread {
    public static String read(String filePath) throws IOException {
        final BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        final StringBuilder jsonContent = new StringBuilder();

        while ((line = br.readLine()) != null) {
            jsonContent.append(line);
        }
        br.close();
        return jsonContent.toString();
    }
}
