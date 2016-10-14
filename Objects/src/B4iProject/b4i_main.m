
#import "b4i_main.h"


@implementation b4i_main 


+ (instancetype)new {
    static b4i_main* shared = nil;
    if (shared == nil) {
        shared = [self alloc];
        shared.bi = [[B4IShellBI alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}
- (int)debugAppId {
    return 1;
}


- (NSString*)  _application_background{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_background"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"application_background" :nil]);
[B4IRDebugUtils shared].currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Private Sub Application_Background";
[B4IRDebugUtils shared].currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_start"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"application_start:" :@[_nav]]);
B4INavigationControllerWrapper* _nc = nil;
[B4IRDebugUtils shared].currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
[B4IRDebugUtils shared].currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="Dim nc As NavigationController";
_nc = [B4INavigationControllerWrapper new];
[B4IRDebugUtils shared].currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="nc.Initialize(\"nc\")";
[_nc Initialize:self.bi :@"nc"];
[B4IRDebugUtils shared].currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="NavControl= nc";
self._navcontrol = _nc;
[B4IRDebugUtils shared].currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="Page1.Initialize(\"Page1\")";
[self._page1 Initialize:self.bi :@"Page1"];
[B4IRDebugUtils shared].currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="Page1.Title = \"Page 1\"";
[self._page1 setTitle:@"Page 1"];
[B4IRDebugUtils shared].currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="Page1.RootPanel.Color = Colors.White";
[[self._page1 RootPanel] setColor:[[self.__c Colors] White]];
[B4IRDebugUtils shared].currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="NavControl.ShowPage(Page1)";
[self._navcontrol ShowPage:(UIViewController*)((self._page1).object)];
[B4IRDebugUtils shared].currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="MenuPage.Initialize(\"SideMenu\")";
[self._menupage Initialize:self.bi :@"SideMenu"];
[B4IRDebugUtils shared].currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="MenuPage.RootPanel.LoadLayout(\"SideMenu\")";
[[self._menupage RootPanel] LoadLayout:@"SideMenu" :self.bi];
[B4IRDebugUtils shared].currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="smc.Initialize(MenuPage, NavControl, Null)";
[self._smc Initialize:self._menupage :self._navcontrol :(B4IPage*) [B4IObjectWrapper createWrapper:[B4IPage new] object:(UIViewController*)([self.__c Null])]];
[B4IRDebugUtils shared].currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="smc.OpenGesturesEnabled = True";
[self._smc setOpenGesturesEnabled:[self.__c True]];
[B4IRDebugUtils shared].currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="App.KeyController = smc";
[self._app setKeyController:(UIViewController*)((self._smc).object)];
[B4IRDebugUtils shared].currentLine=65554;
 //BA.debugLineNum = 65554;BA.debugLine="Page1.HideBackButton = True";
[self._page1 setHideBackButton:[self.__c True]];
[B4IRDebugUtils shared].currentLine=65555;
 //BA.debugLineNum = 65555;BA.debugLine="Page1.TopLeftButtons = Array(smc.CreateBarButton";
[self._page1 setTopLeftButtons:[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(([self._smc CreateBarButton:@"SideMenu"]).object)]]]]];
[B4IRDebugUtils shared].currentLine=65556;
 //BA.debugLineNum = 65556;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _page1_backgroundclick{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"page1_backgroundclick"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"page1_backgroundclick" :nil]);
[B4IRDebugUtils shared].currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub Page1_BackgroundClick";
[B4IRDebugUtils shared].currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="If  MenuPage.Visible Then";
if ([self._menupage Visible]) { 
[B4IRDebugUtils shared].currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="smc.CloseMenu";
[self._smc CloseMenu];
 }else {
[B4IRDebugUtils shared].currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="smc.OpenLeftMenu";
[self._smc OpenLeftMenu];
 };
[B4IRDebugUtils shared].currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _page1_barbuttonclick:(NSString*) _tag{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"page1_barbuttonclick"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"page1_barbuttonclick:" :@[_tag]]);
[B4IRDebugUtils shared].currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub Page1_BarButtonClick (Tag As String)";
[B4IRDebugUtils shared].currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Select Tag";
switch ([self.bi switchObjectToInt:_tag :@[@"SideMenu"]]) {
case 0: {
[B4IRDebugUtils shared].currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="If  MenuPage.Visible Then";
if ([self._menupage Visible]) { 
[B4IRDebugUtils shared].currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="smc.CloseMenu";
[self._smc CloseMenu];
 }else {
[B4IRDebugUtils shared].currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="smc.OpenLeftMenu";
[self._smc OpenLeftMenu];
 };
 break; }
}
;
[B4IRDebugUtils shared].currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _page1_resize:(int) _width :(int) _height{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"page1_resize"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"page1_resize::" :@[@(_width),@(_height)]]);
[B4IRDebugUtils shared].currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Private Sub Page1_Resize(Width As Int, Height As I";
[B4IRDebugUtils shared].currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="smc.LeftMenuMaxWidth = 70%x";
[self._smc setLeftMenuMaxWidth:[self.__c PerXToCurrent:(float) (70)]];
[B4IRDebugUtils shared].currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="End Sub";
return @"";
}

- (void)initializeStaticModules {
    [[b4i_main new]initializeModule];

}
- (NSString*)  _process_globals{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"process_globals"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);
[B4IRDebugUtils shared].currentLine=0;
 //BA.debugLineNum = 0;BA.debugLine="Sub Process_Globals";
[B4IRDebugUtils shared].currentLine=3;
 //BA.debugLineNum = 3;BA.debugLine="Public App As Application";
self._app = [B4IApplicationWrapper new];
[B4IRDebugUtils shared].currentLine=4;
 //BA.debugLineNum = 4;BA.debugLine="Public NavControl As NavigationController";
self._navcontrol = [B4INavigationControllerWrapper new];
[B4IRDebugUtils shared].currentLine=5;
 //BA.debugLineNum = 5;BA.debugLine="Private Page1, MenuPage As Page";
self._page1 = [B4IPage new];
self._menupage = [B4IPage new];
[B4IRDebugUtils shared].currentLine=8;
 //BA.debugLineNum = 8;BA.debugLine="Private smc As SideMenuController";
self._smc = [B4ISideMenuController new];
[B4IRDebugUtils shared].currentLine=9;
 //BA.debugLineNum = 9;BA.debugLine="Private smBtn1 As Button";
self._smbtn1 = [B4IButtonWrapper new];
[B4IRDebugUtils shared].currentLine=11;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return @"";
}
@end