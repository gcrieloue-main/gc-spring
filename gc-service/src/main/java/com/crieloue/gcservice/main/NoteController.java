package com.crieloue.gcservice.main;

import com.crieloue.gcservice.notes.Note;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;

@Controller
public class NoteController {

    @GetMapping(value = "/notes", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Note> getNotes() {
        return Collections.singletonList(new Note("Titre", "content"));
    }

}
