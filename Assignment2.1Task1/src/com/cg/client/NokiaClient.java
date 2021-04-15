package com.cg.client;

import com.cg.beans.NokiaN7;

public class NokiaClient {
	public static void main(String[] args) {
		
		NokiaN7 obj = new NokiaN7();
		obj.doConverse();
		obj.sendSms();
		obj.captureVideo();
		obj.browseNet();
		obj.controlSpeed();
	}

}
