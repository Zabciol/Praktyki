package pl.com.britenet.praktyki.web.rest;

import org.springframework.web.bind.annotation.*;
import pl.com.britenet.praktyki.service.FileService;

import java.io.File;
import java.util.List;

@RequestMapping("/api/files")
@RestController
public class FileController {



    //private final FileService ;

    @GetMapping
    public List<File> getFiles() {
        FileService.getFile();
        return null;
    }

    @PostMapping
    public void createFile(@RequestBody pl.com.britenet.praktyki.domain.File file) {
        FileService.addFile(file);

    }
    @DeleteMapping
    public void  deleteFile(@RequestBody String file)
    {
         FileService.deleteFile(file);
    }
    @PutMapping
    public void  replaceFile(@RequestBody String file)
    {
        FileService.getFile(file);
    }

}
