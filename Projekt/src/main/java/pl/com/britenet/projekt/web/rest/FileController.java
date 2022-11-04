package pl.com.britenet.projekt.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.com.britenet.projekt.service.FileService;

import java.util.List;
import pl.com.britenet.projekt.web.rest.File;


@RequestMapping("/api/files")
@RestController
public class FileController {

    private final Logger log = LoggerFactory.getLogger(FileController.class);

    //private final FileService ;

    @GetMapping
    public List<File> getFiles() {
        FileService.getFile();
        return null;
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
    @PostMapping
    public ResponseEntity<File> saveFiles(@RequestParam("file")MultipartFile file) {

        log.info("przyjecie pliku p romiarze: {}", file.getSize());
        File domainFile = new File();
        //   domainFile.setName(file.getName());
        domainFile.setName("dupa");
        
        FileService.addFile(domainFile);
        return ResponseEntity.ok( domainFile);
    }
}
