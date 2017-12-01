package org.aksdroid.play.opennlp.play;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import opennlp.tools.util.Span;

public class SentenceDetectorTest {
	String SAMPLE_PARAGRAPH = "If you have several test classes, you can combine them into a test suite. Running a test suite executes all test classes in that suite in the specified order. A test suite can also contain other test suites.";

	@Test
	public void testSentenceDetectorTest() throws IOException {
		SentenceDetectorDemo sentenceDetector = new SentenceDetectorDemo();
		String[] sentences = sentenceDetector.detectSentence(SAMPLE_PARAGRAPH);
		Assert.assertTrue(sentences != null && sentences.length > 0);
	}

	@Test
	public void testSentencePosDetectorTest() throws IOException {
		SentencePosDetectorDemo sentenceDetector = new SentencePosDetectorDemo();
		Span[] spans = sentenceDetector.detectSentencePos(SAMPLE_PARAGRAPH);
		Assert.assertTrue(spans != null && spans.length > 0);
	}

}