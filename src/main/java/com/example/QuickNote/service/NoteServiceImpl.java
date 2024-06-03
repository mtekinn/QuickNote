package com.example.QuickNote.service;

import com.example.QuickNote.model.Note;
import com.example.QuickNote.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service // Bu sınıfın bir servis sınıfı olduğunu belirtir.
public class NoteServiceImpl implements NoteService {

    @Autowired // NoteRepository'yi otomatik olarak enjekte eder
    private NoteRepository noteRepository;

    @Override
    public Note create(Note note) {
        return null;
    }

    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }
    
    @Override
    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElseThrow();
    }

    @Override
    public Note updateNote(Long id, Note updatedNote) {
        Note note = getNoteById(id);
        note.setTitle(updatedNote.getTitle());
        note.setContent(updatedNote.getContent());
        return noteRepository.save(note);
    }
    
    @Override
    public void deleteNoteById(Long id) {
        noteRepository.deleteById(id);
    }
    
}
