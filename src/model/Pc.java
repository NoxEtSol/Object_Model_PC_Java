package model;

import java.util.ArrayList;
import java.util.List;

public class Pc {

    List<Card> cards = new ArrayList<Card>();
    private List<Memory> memories = new ArrayList<Memory>();
    private Procesor procesor;
    private int numberOfMemoryModules;

    public Pc(int numberOfMemoryModules) {
        this.numberOfMemoryModules = numberOfMemoryModules;
    }


    public int getNumberOfMemoryModules() {
        return numberOfMemoryModules;
    }

    public List<Memory> getMemories() {
        return memories;
    }

    public void setMemories(List<Memory> memories) {
        this.memories = memories;
    }

    public Procesor getProcesor() {
        return procesor;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "cards=" + cards +
                ", memories=" + memories +
                ", procesor=" + procesor +
                ", numberOfMemoryModules=" + numberOfMemoryModules +
                '}';
    }
}
