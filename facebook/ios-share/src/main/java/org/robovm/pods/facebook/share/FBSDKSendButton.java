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
package org.robovm.pods.facebook.share;

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
import org.robovm.apple.photos.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.pods.facebook.corebasics.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKSendButton/*</name>*/ 
    extends /*<extends>*/FBSDKButton/*</extends>*/ 
    /*<implements>*/implements FBSDKSharingButton/*</implements>*/ {

    /*<ptr>*/public static class FBSDKSendButtonPtr extends Ptr<FBSDKSendButton, FBSDKSendButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKSendButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKSendButton() {}
    protected FBSDKSendButton(Handle h, long handle) { super(h, handle); }
    protected FBSDKSendButton(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public FBSDKSendButton(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public FBSDKSendButton(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dialog")
    public native FBSDKMessageDialog getDialog();
    @Property(selector = "setDialog:")
    public native void setDialog(FBSDKMessageDialog v);
    @Property(selector = "shareContent")
    public native FBSDKSharingContent getShareContent();
    @Property(selector = "setShareContent:")
    public native void setShareContent(FBSDKSharingContent v);
    @Property(selector = "analyticsParameters")
    public native NSDictionary<NSString, ?> getAnalyticsParameters();
    @Property(selector = "impressionTrackingEventName")
    public native NSString getImpressionTrackingEventName();
    @Property(selector = "impressionTrackingIdentifier")
    public native String getImpressionTrackingIdentifier();
    @Property(selector = "isImplicitlyDisabled")
    public native boolean isImplicitlyDisabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configureButton")
    public native void configureButton();
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
