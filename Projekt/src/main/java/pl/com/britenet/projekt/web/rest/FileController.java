package pl.com.britenet.praktyki.web.rest;

import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;

@RequestMapping("/api/files")
@RestController
public class FileController {



    // private final FileService files service;

    @GetMapping
    public List<File> getFiles() {
//        filesService.getAllfiles();
        return null;
    }

    @PostMapping
    public void createFile(@RequestBody File File) {
        //        filesService.createFile(file);

    }
    @DeleteMapping
    public void  deleteFile(@RequestBody File File)
    {
        // filesService.removeFile(file);
    }
    @PutMapping
    public void  uploadFile(@RequestBody File File)
    {
        // filesService.uploadFile(file);
    }

}


