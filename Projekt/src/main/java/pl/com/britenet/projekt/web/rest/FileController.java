package pl.com.britenet.projekt.web.rest;

import java.io.File;
import java.util.*;
import java.util.Collections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pl.com.britenet.projekt.service.UserService;
import pl.com.britenet.projekt.service.dto.UserDTO;
import tech.jhipster.web.util.PaginationUtil;

@RestController
@RequestMapping("/api")

public class FileController {

    private final Logger log = LoggerFactory.getLogger(FileController.class);

    @PostMapping ("/files")
    public ResponseEntity<String> saveFiles(@RequestParam("file")MultipartFile file) {

        log.info("przyjecie pliku p romiarze: {}", file.getSize());
        return ResponseEntity.ok("done");
    }
}
