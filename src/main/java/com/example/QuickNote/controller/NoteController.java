package com.example.QuickNote.controller;

import com.example.QuickNote.model.Note;
import com.example.QuickNote.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Bu sınıfın bir REST controller olduğunu belirtir.
@RequestMapping("/api/notes") // API'nin temel yolunu belirtir.
public class NoteController {
    
    @Autowired // NoteService'yi otomatik olarak enjekte eder
    private NoteService noteService;
    
    @PostMapping
    public ResponseEntity<Note> createNote(@RequestBody Note note)  {
        Note createdNote = noteService.create(note);
        return new ResponseEntity<>(createdNote, HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<List<Note>> getAllNotes() {
        List<Note> notes = noteService.getAllNotes();
        return new ResponseEntity<>(notes, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Note> getNoteById(@PathVariable Long id) {
        Note note = noteService.getNoteById(id);
        return new ResponseEntity<>(note, HttpStatus.OK);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Note> updateNote(@PathVariable Long id, @RequestBody Note updatedNote) {
        Note note = noteService.updateNote(id, updatedNote);
        return new ResponseEntity<>(note, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNoteById(@PathVariable Long id) {
        noteService.deleteNoteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
