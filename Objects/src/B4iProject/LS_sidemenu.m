
#import "iCore.h"
@interface LS_sidemenu:NSObject
@end

@implementation LS_sidemenu

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[sidemenu/General script]
[B4ILayoutBuilder scaleAll:views :width :height];

}
@end