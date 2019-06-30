package org.llf.weixin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kemao_2/weixin/receiver")
public final class MessageReceiverController {
	public String echo(//
	@RequestParam("signature") String signature,//
	@RequestParam("timestamp") String timestamp,//
	@RequestParam("nonce") String nonce,//
	@RequestParam("echostr") String echostr//
		//
		) {
		return echostr;
		
	}
	

}
