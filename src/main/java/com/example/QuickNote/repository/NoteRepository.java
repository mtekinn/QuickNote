package com.example.QuickNote.repository;

import com.example.QuickNote.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    // JpaRepository bize temel CRUD işlemlerini sağlar.
    // Bu interface'i genişleterek özel sorgular yazabiliriz.
    
}