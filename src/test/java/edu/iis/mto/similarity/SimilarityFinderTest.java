package edu.iis.mto.similarity;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimilarityFinderTest {

    @Test
    public void shouldReturnTrueIfCounterHasValueSix() {
        int[] firstSequence = {1, 2, 3, 6, 8, 9};
        int[] secondSequence = {1, 2, 3, 6, 8, 9};

        SequenceSearcherDouble sequenceSearcherDouble = new SequenceSearcherDouble();
        SimilarityFinder similarityFinder = new SimilarityFinder(sequenceSearcherDouble);

        similarityFinder.calculateJackardSimilarity(firstSequence,secondSequence);
        assertEquals(sequenceSearcherDouble.getCounter(), 6);
    }

    @Test
    public void shouldReturnTrueIfBothSequencesAreEmpty(){
        int[] firstSequence = {};
        int[] secondSequence = {};

        SequenceSearcherDouble sequenceSearcherDouble = new SequenceSearcherDouble();
        SimilarityFinder similarityFinder = new SimilarityFinder(sequenceSearcherDouble);

        assertEquals(similarityFinder.calculateJackardSimilarity(firstSequence,secondSequence),1.0d,0.01);
    }

    @Test
    public void shouldReturnTrueIfBothArraysHaveTheSameValue(){
        int[] firstSequence = {1, 2, 3, 6, 8, 9};
        int[] secondSequence = {1, 2, 3, 6, 8, 9};

        SequenceSearcherDouble sequenceSearcherDouble = new SequenceSearcherDouble();
        SimilarityFinder similarityFinder = new SimilarityFinder(sequenceSearcherDouble);

        assertEquals(similarityFinder.calculateJackardSimilarity(firstSequence,secondSequence),0,0.01);
    }
}
