package com.cg.beans;

public class NokiaN7 extends Nokia1100{
	
	public void captureVideo()
	{
		System.out.println("capture video");
	}
	
	public void browseNet()
	{
		System.out.println("browse net");
	}

	@Override
	public void doConverse() 
	{
		
		System.out.println("do converse - 4g");
	}

	@Override
	public void controlSpeed() {

		super.controlSpeed();
	}
	
	

}
