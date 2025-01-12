package org.dice_research.launuts;

import java.util.Map;
import java.util.Map.Entry;

import org.dice_research.launuts.linking.WikipediaLinking;
import org.junit.jupiter.api.Test;

class WpLinkTest {

	@Test
	void test() {

		// Parse without exceptions
		WikipediaLinking wpLinking = new WikipediaLinking();
		String markdown = wpLinking.downloadWpNuts1().getWpNuts1Markdown();
		Map<String, String> wpLinks = wpLinking.getWpNuts1CodesToUris(markdown);

		// For humans
		if (Boolean.FALSE)
			for (Entry<String, String> en : wpLinks.entrySet()) {
				// Print wiki link
				System.out.println("[[" + en.getKey() + "|" + en.getValue() + "]]");
			}
	}

}
