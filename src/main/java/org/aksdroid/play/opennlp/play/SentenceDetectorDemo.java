package org.aksdroid.play.opennlp.play;

import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.sentdetect.SentenceDetector;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;

/**
 * @author Krishna
 *
 */
public class SentenceDetectorDemo {

	public String[] detectSentence(String paragraph) throws IOException {

		InputStream modelIn = getClass().getResourceAsStream("/en-sent.bin");
		final SentenceModel sentenceModel = new SentenceModel(modelIn);
		modelIn.close();

		SentenceDetector sentenceDetector = new SentenceDetectorME(sentenceModel);
		String sentences[] = sentenceDetector.sentDetect(paragraph);
		for (String sent : sentences) {
			System.out.println(sent);
		}
		return sentences;
	}

}
