package org.aksdroid.play.opennlp.play;

import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.sentdetect.SentenceDetector;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.Span;

/**
 * @author Krishna
 *
 */
public class SentencePosDetectorDemo {

	public Span[] detectSentencePos(String paragraph) throws IOException {

		InputStream modelIn = getClass().getResourceAsStream("/en-sent.bin");
		final SentenceModel sentenceModel = new SentenceModel(modelIn);
		modelIn.close();
		SentenceDetector sentenceDetector = new SentenceDetectorME(sentenceModel);
		Span[] spans = sentenceDetector.sentPosDetect(paragraph);
		for (Span span : spans) {
			System.out.println(span);
		}
		return spans;
	}
}