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