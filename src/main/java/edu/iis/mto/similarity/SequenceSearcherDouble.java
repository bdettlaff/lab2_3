package edu.iis.mto.similarity;

import edu.iis.mto.search.SearchResult;
import edu.iis.mto.search.SequenceSearcher;

public class SequenceSearcherDouble implements SequenceSearcher {

    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override public SearchResult search(int key, int[] seq) {
        counter++;
        return SearchResult.builder().build();
    }
}
