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
}
