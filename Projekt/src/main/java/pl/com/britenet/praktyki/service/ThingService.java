package pl.com.britenet.praktyki.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.com.britenet.praktyki.domain.File;

import java.util.HashMap;
import java.util.Map;

/**
 * Service class for managing users.
 */
/*@Service
@Transactional
public class ThingService {
    private static final Map<String, File> things = new HashMap<>();

    public ThingService() {

    }

    public File getThing() {
        final var thing = new File();
        thing.setText("ciłała");
        return thing;
    }
    public File getThing(String name) {
        if (things.containsKey(name)) {
            return things.get(name);
        }
        else{
            return null;
        }
    }
    public void addThing(File file){
        things.put(file.getText(), file);
    }
    public void deleteThing(String name){
        if(things.containsKey(name)) {
            things.remove(name);
        }
    }

}*/
