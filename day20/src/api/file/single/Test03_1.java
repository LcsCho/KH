package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class Test03_1 {
    public static void main(String[] args) throws IOException {
        File input = new File("C:/Temp/origin.txt");
        File output = new File("./sample/copy3.txt");

        FileInputStream inputStream = new FileInputStream(input);
        FileOutputStream outputStream = new FileOutputStream(output);
        FileChannel inputChannel = inputStream.getChannel();
        FileChannel outputChannel = outputStream.getChannel(); 

        inputChannel.transferTo(0, inputChannel.size(), outputChannel);
        inputStream.close();
        outputStream.close();
    }
}