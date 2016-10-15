package ch.dorsum.b4i.abfuhrfdaten;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_main_subs_0 {


public static RemoteObject  _application_background() throws Exception{
try {
		Debug.PushSubsStack("Application_Background (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,55);
if (RapidSub.canDelegate("application_background")) return b4i_main.remoteMe.runUserSub(false, "main","application_background");
 BA.debugLineNum = 55;BA.debugLine="Private Sub Application_Background";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_start(RemoteObject _nav) throws Exception{
try {
		Debug.PushSubsStack("Application_Start (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,25);
if (RapidSub.canDelegate("application_start")) return b4i_main.remoteMe.runUserSub(false, "main","application_start", _nav);
RemoteObject _nc = RemoteObject.declareNull("B4INavigationControllerWrapper");
Debug.locals.put("Nav", _nav);
 BA.debugLineNum = 25;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="Dim nc As NavigationController";
Debug.ShouldStop(67108864);
_nc = RemoteObject.createNew("B4INavigationControllerWrapper");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 28;BA.debugLine="nc.Initialize(\"nc\")";
Debug.ShouldStop(134217728);
_nc.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("nc")));
 BA.debugLineNum = 29;BA.debugLine="NavControl= nc";
Debug.ShouldStop(268435456);
b4i_main._navcontrol = _nc;
 BA.debugLineNum = 31;BA.debugLine="Page1.Initialize(\"Page1\")";
Debug.ShouldStop(1073741824);
b4i_main._page1.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("Page1")));
 BA.debugLineNum = 32;BA.debugLine="Page1.Title = \"Page 1\"";
Debug.ShouldStop(-2147483648);
b4i_main._page1.runMethod(true,"setTitle:",BA.ObjectToString("Page 1"));
 BA.debugLineNum = 33;BA.debugLine="Page1.RootPanel.Color = Colors.White";
Debug.ShouldStop(1);
b4i_main._page1.runMethod(false,"RootPanel").runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"White"));
 BA.debugLineNum = 34;BA.debugLine="NavControl.ShowPage(Page1)";
Debug.ShouldStop(2);
b4i_main._navcontrol.runVoidMethod ("ShowPage:",(Object)(((b4i_main._page1).getObject())));
 BA.debugLineNum = 37;BA.debugLine="MenuPage.Initialize(\"SideMenu\")";
Debug.ShouldStop(16);
b4i_main._menupage.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("SideMenu")));
 BA.debugLineNum = 38;BA.debugLine="MenuPage.RootPanel.LoadLayout(\"SideMenu\")";
Debug.ShouldStop(32);
b4i_main._menupage.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("SideMenu")),b4i_main.ba);
 BA.debugLineNum = 40;BA.debugLine="smc.Initialize(MenuPage, NavControl, Null)";
Debug.ShouldStop(128);
b4i_main._smc.runVoidMethod ("Initialize:::",(Object)(b4i_main._menupage),(Object)(b4i_main._navcontrol),BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IPage"), b4i_main.__c.runMethod(false,"Null")));
 BA.debugLineNum = 41;BA.debugLine="smc.OpenGesturesEnabled = True";
Debug.ShouldStop(256);
b4i_main._smc.runMethod(true,"setOpenGesturesEnabled:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 42;BA.debugLine="App.KeyController = smc";
Debug.ShouldStop(512);
b4i_main._app.runMethod(false,"setKeyController:",((b4i_main._smc).getObject()));
 BA.debugLineNum = 43;BA.debugLine="Page1.HideBackButton = True";
Debug.ShouldStop(1024);
b4i_main._page1.runMethod(true,"setHideBackButton:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 44;BA.debugLine="Page1.TopLeftButtons = Array(smc.CreateBarButton";
Debug.ShouldStop(2048);
b4i_main._page1.runMethod(false,"setTopLeftButtons:",BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {((b4i_main._smc.runMethod(false,"CreateBarButton:",(Object)(RemoteObject.createImmutable("SideMenu")))).getObject())})));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _page1_backgroundclick() throws Exception{
try {
		Debug.PushSubsStack("Page1_BackgroundClick (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,71);
if (RapidSub.canDelegate("page1_backgroundclick")) return b4i_main.remoteMe.runUserSub(false, "main","page1_backgroundclick");
 BA.debugLineNum = 71;BA.debugLine="Private Sub Page1_BackgroundClick";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="If  MenuPage.Visible Then";
Debug.ShouldStop(128);
if (b4i_main._menupage.runMethod(true,"Visible").getBoolean()) { 
 BA.debugLineNum = 73;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(256);
b4i_main._smc.runVoidMethod ("CloseMenu");
 }else {
 BA.debugLineNum = 75;BA.debugLine="smc.OpenLeftMenu";
Debug.ShouldStop(1024);
b4i_main._smc.runVoidMethod ("OpenLeftMenu");
 };
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _page1_barbuttonclick(RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("Page1_BarButtonClick (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,59);
if (RapidSub.canDelegate("page1_barbuttonclick")) return b4i_main.remoteMe.runUserSub(false, "main","page1_barbuttonclick", _tag);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 59;BA.debugLine="Private Sub Page1_BarButtonClick (Tag As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Select Tag";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("SideMenu"))) {
case 0: {
 BA.debugLineNum = 63;BA.debugLine="If  MenuPage.Visible Then";
Debug.ShouldStop(1073741824);
if (b4i_main._menupage.runMethod(true,"Visible").getBoolean()) { 
 BA.debugLineNum = 64;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(-2147483648);
b4i_main._smc.runVoidMethod ("CloseMenu");
 }else {
 BA.debugLineNum = 66;BA.debugLine="smc.OpenLeftMenu";
Debug.ShouldStop(2);
b4i_main._smc.runVoidMethod ("OpenLeftMenu");
 };
 break; }
}
;
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _page1_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Page1_Resize (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,50);
if (RapidSub.canDelegate("page1_resize")) return b4i_main.remoteMe.runUserSub(false, "main","page1_resize", _width, _height);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 50;BA.debugLine="Private Sub Page1_Resize(Width As Int, Height As I";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="smc.LeftMenuMaxWidth = 70%x";
Debug.ShouldStop(524288);
b4i_main._smc.runMethod(true,"setLeftMenuMaxWidth:",b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 70))));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Public App As Application";
b4i_main._app = RemoteObject.createNew("B4IApplicationWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Public NavControl As NavigationController";
b4i_main._navcontrol = RemoteObject.createNew("B4INavigationControllerWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Page1, MenuPage As Page";
b4i_main._page1 = RemoteObject.createNew("B4IPage");
b4i_main._menupage = RemoteObject.createNew("B4IPage");
 //BA.debugLineNum = 20;BA.debugLine="Private smc As SideMenuController";
b4i_main._smc = RemoteObject.createNew("B4ISideMenuController");
 //BA.debugLineNum = 21;BA.debugLine="Private smBtn1 As Button";
b4i_main._smbtn1 = RemoteObject.createNew("B4IButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}