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
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareButton/*</name>*/ 
    extends /*<extends>*/FBSDKButton/*</extends>*/ 
    /*<implements>*/implements FBSDKSharingButton/*</implements>*/ {

    /*<ptr>*/public static class FBSDKShareButtonPtr extends Ptr<FBSDKShareButton, FBSDKShareButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKShareButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKShareButton() {}
    protected FBSDKShareButton(Handle h, long handle) { super(h, handle); }
    protected FBSDKShareButton(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public FBSDKShareButton(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public FBSDKShareButton(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    public FBSDKShareButton(@ByVal CGRect frame, UIAction primaryAction) { super(frame, primaryAction); }
    /*</constructors>*/
    /*<properties>*/
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
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configureButton")
    public native void configureButton();
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "systemButtonWithImage:target:action:")
    public static native FBSDKShareButton getSystemButtonWithImage(UIImage image, NSObject target, Selector action);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "systemButtonWithPrimaryAction:")
    public static native FBSDKShareButton getSystemButtonWithPrimaryAction(UIAction primaryAction);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
