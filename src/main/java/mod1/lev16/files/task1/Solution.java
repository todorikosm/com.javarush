package mod1.lev16.files.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.com");
        InputStream input = url.openStream();
        byte[] buffer = input.readAllBytes();
        String str = new String(buffer);
        System.out.println(str);


        File file = new File("c:\\readme.txt");
        InputStream input2 = new FileInputStream(file);
        byte[] buffer2 = input.readAllBytes();
        String str2 = new String(buffer2);
        System.out.println(str2);
    }
}
