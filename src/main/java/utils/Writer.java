package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    private File file;
    private BufferedWriter bw;
    private String filePath;
    private String fullName;


    public Writer(String fileName, String extension) throws IOException {
        this.fullName = fileName+"."+extension;
        filePath = "contents\\"+fullName;
        file = new File(filePath);
        bw = new BufferedWriter(new FileWriter(file));
    }


    public void write(String content) throws IOException {
        bw.write(content);
    }

    public void close() throws IOException {
        bw.close();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
