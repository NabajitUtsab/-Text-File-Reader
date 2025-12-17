package File;

import java.io.File;
import java.io.IOException;


public class FileHandler {

    public static String createNewJsonFile(String fileName) {
        System.out.println("Creating new Json File "+ fileName );

        if (!fileName.endsWith(".json")) {
            fileName += ".json";
        }

        String path = "src/" + fileName;  /// creating path
        boolean fileNotExists = true;

        File jsonFile = new File(path);  //file object created

        try{
            fileNotExists = jsonFile.createNewFile();


        }catch (IOException e ){
            System.out.println("An error occured in INput and output file creation");
        }

        return fileNotExists ? fileName+" created" : "file already existed";
    }


}
