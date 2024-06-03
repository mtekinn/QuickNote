package com.example.QuickNote.service;

import com.example.QuickNote.model.Note;
import java.util.List;

public interface NoteService {

    Note create(Note note);
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    Note updateNote(Long id, Note updatedNote);
    void deleteNoteById(Long id);
}
