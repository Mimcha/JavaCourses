package org.example;

import java.util.Arrays;

public class WritingNotebook {
    private static String[] writingNotebook;

    public static String[] getSetWritingNotebook() {
        return writingNotebook;
    }

    public static String[] setSetWritingNotebook(String setWritingNote[]) {
       for (int i = 0; i < setWritingNote.length; i++) {
            writingNotebook = Arrays.copyOf(setWritingNote, i+1 );//
        }
        return setWritingNote;
    }
}

