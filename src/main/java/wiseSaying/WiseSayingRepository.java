package main.java.wiseSaying;

import java.util.ArrayList;

public interface WiseSayingRepository {
    WiseSaying findById(int id);
    WiseSaying add(String content, String author);
    void remove(WiseSaying wiseSaying);
    void update(WiseSaying wiseSaying);
    ArrayList<WiseSaying> findAll();

}
