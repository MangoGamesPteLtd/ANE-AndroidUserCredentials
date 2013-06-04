/*
Copyright (c) 2013 Mango Games Interactive Pte Ltd 
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
*/
package
{
	import com.example.androiddevicedata.DeviceMailIDScriptSample;
	
	import flash.display.Sprite;
	import flash.display.StageAlign;
	import flash.display.StageScaleMode;
	
	
	// Basic Test for AIR native Extension
	
	public class MailIDTest extends Sprite
	{
		public var deviceID : DeviceMailIDScriptSample;
		public var st : String;
		public function MailIDTest()
		{
			super();
			
			// support autoOrients
			stage.align = StageAlign.TOP_LEFT;
			stage.scaleMode = StageScaleMode.NO_SCALE;
			
			// create an instance actionscript lib
		    deviceID = new DeviceMailIDScriptSample();
			deviceID.init();
			
			trace("in returning  value from android native code",deviceID.showDeviceMailID());
			
		}
	}
}