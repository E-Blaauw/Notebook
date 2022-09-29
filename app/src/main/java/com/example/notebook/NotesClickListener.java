package com.example.notebook;

import androidx.cardview.widget.CardView;

import com.example.notebook.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);

    void onLongClick(Notes notes, CardView cardView);
}



