package edu.iis.mto.similarity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimilarityFinderTest {

    private SimilarityFinder similarityFinder;

    @Before
    public void setUp() {
        this.similarityFinder = new SimilarityFinder(new SequenceSearcherDubler());
    }

    @Test
    public void shouldReturnTrueIfBothArraysLengthIsZero() {
        int[] firstSequence = new int[0];
        int[] secondSequence = new int[0];

        assertEquals(1.0d, similarityFinder.calculateJackardSimilarity(firstSequence, secondSequence), 0.01);
    }

    @Test
    public void shouldReturnTrueIfBothArraysHaveTheSameValues() {
        int[] firstSequence = {1, 2, 3, 6, 8, 9};
        int[] secondSequence = {1, 2, 3, 6, 8, 9};

        assertEquals(similarityFinder.calculateJackardSimilarity(firstSequence, secondSequence), 1.0d, 0.01);
    }

}
