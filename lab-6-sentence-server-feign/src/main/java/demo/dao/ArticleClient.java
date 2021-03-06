package demo.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.domain.Word;

/**
 * 
 * @author LopesCaD
 *
 */
@FeignClient("ARTICLE")
public interface ArticleClient {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Word getWord();
}
