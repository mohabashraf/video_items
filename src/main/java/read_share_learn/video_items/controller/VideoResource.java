package read_share_learn.video_items.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
public class VideoResource {
    @GetMapping("/")
    public Properties testGetRest(){
        return System.getProperties();
    }
}
