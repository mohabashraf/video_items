package read_share_learn.video_items.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoResource {
    @GetMapping("/")
    public String testGetRest(){
        return "Test Get";
    }
}
