package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import demo.dao.AdjectiveClient;
import demo.dao.ArticleClient;
import demo.dao.NounClient;
import demo.dao.SubjectClient;
import demo.dao.VerbClient;
import demo.domain.Word;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	VerbClient verbClient;
	@Autowired
	SubjectClient subjectClient;
	@Autowired
	ArticleClient articleClient;
	@Autowired
	AdjectiveClient adjectiveClient;
	@Autowired
	NounClient nounClient;

	@Override
	public Word getSubject() {
		return subjectClient.getWord();
	}

	@Override
	public Word getVerb() {
		return verbClient.getWord();
	}

	@Override
	public Word getArticle() {
		return articleClient.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod = "fallBackMethodToAdjective")
	public Word getAdjective() {
		return adjectiveClient.getWord();
	}

	public Word fallBackMethodToAdjective() {
		return new Word("fallBack");
	}

	@Override
	public Word getNoun() {
		return nounClient.getWord();
	}
}
