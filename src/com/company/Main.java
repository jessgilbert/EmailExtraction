package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Path path = Paths.get("C:\\Users\\JJG\\Work\\Training\\EmailExtraction\\sample.txt");
        fileOpen(path);
        {

            Pattern pattern = Pattern.compile("\\w*@softwire.com\\s");
            Matcher matcher = pattern.matcher(inputText);

            matcher.find();
            matcher.group();
            matcher.group(int start);


        }

    }

    public static String fileOpen(Path fileLocation)
    {
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(fileLocation);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(bytes);
    }

}
