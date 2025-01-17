/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.facebook.core;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppLink/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKAppLinkPtr extends Ptr<FBSDKAppLink, FBSDKAppLinkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKAppLink.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKAppLink() {}
    protected FBSDKAppLink(Handle h, long handle) { super(h, handle); }
    protected FBSDKAppLink(SkipInit skipInit) { super(skipInit); }
    public FBSDKAppLink(NSURL sourceURL, NSArray<FBSDKAppLinkTarget> targets, NSURL webURL) { super((Handle) null, create(sourceURL, targets, webURL)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceURL")
    public native NSURL getSourceURL();
    @Property(selector = "targets")
    public native NSArray<FBSDKAppLinkTarget> getTargets();
    @Property(selector = "webURL")
    public native NSURL getWebURL();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKAppLinkVersion", optional=true)
    public static native String getVersion();
    
    @Method(selector = "appLinkWithSourceURL:targets:webURL:")
    protected static native @Pointer long create(NSURL sourceURL, NSArray<FBSDKAppLinkTarget> targets, NSURL webURL);
    /*</methods>*/
}
