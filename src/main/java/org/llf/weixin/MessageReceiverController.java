package org.llf.weixin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kemao_2/weixin/receiver")
public final class MessageReceiverController {
	private static final Logger LOG=LoggerFactory.getLogger(MessageReceiverController.class);
	public String echo(//
	@RequestParam("signature") String sigature,//
	@RequestParam("timestamp") String timestamp,//
	@RequestParam("nonce") String nonce,//
	@RequestParam("echostr") String echostr//
		//
		) {return echostr;
	
	}
	@PostMapping
	public String onMessage(@RequestBody String xml) {
		LOG.trace("收到的消息原文:\n{}\n..................", xml);
		return "succcess";
	}
	
	

}
