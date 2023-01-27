package controller;

import java.util.List;

import data.GroupStream;

public interface GroupStreamController <E extends GroupStream, I> extends Controller <E, I> {
    List <E> sortGroupStream (List <E> entityStream);   
}