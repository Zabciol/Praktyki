package pl.com.britenet.projekt.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.com.britenet.projekt.web.rest.File;

import java.util.*;

/**
 * Service class for managing users.
 */
@Service
@Transactional
public class FileService {
    private static final Map<String, File> files = new HashMap<>();

    public FileService() {

    }

    List<String> fileList = new LinkedList<>();

    public List<String> getList(String name){
        for (var entry : files.entrySet()) {
            if(entry.getKey().equals(name)){
                fileList.add(name);
            }
        }
        return fileList;
    }


    public static File getFile() {
        final var file = new File();
        file.setName("userinput");
        return file;
    }

    public static File getFile(String name) {
        if (files.containsKey(name)) {
            return files.get(name);
        }
        else {
            return null;
        }
    }

    public static void addFile(File file) {
        files.put(file.getName(), file);
    }

    public static void deleteFile(String name) {
        if (files.containsKey(name)) {
            files.remove(name);
        }
    }
}
