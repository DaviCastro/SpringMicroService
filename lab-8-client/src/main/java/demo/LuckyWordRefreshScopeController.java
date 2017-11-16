package demo;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "wordConfig")
@RefreshScope
public class LuckyWordRefreshScopeController {

	private String fullStatement;

	@PostConstruct
	public void init() {
		fullStatement = fullStatement + "testRefreshScope";
	}

	String luckyWord;
	String preamble;

	@GetMapping("/lucky-word")
	public String showLuckyWord() {
		return fullStatement;
	}

	public String getLuckyWord() {
		return luckyWord;
	}

	public void setLuckyWord(String luckyWord) {
		this.luckyWord = luckyWord;
	}

	public String getPreamble() {
		return preamble;
	}

	public void setPreamble(String preamble) {
		this.preamble = preamble;
	}

	public String getFullStatement() {
		return fullStatement;
	}

	public void setFullStatement(String fullStatement) {
		this.fullStatement = fullStatement;
	}

}
