package com.greenfox.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

class FileManager {

    ArrayList<String> getDataFromFile(Path path) {
        ArrayList<String> wordList = new ArrayList<>();
        try (
                BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordList.add(line);
            }
        } catch (
                IOException x) {
            System.err.format("IOException: %s%n", x);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wordList;
    }

}
