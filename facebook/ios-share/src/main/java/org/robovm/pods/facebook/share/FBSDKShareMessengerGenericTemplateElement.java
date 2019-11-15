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
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Sharing to Messenger via the SDK is unsupported. https://developers.facebook.com/docs/messenger-platform/changelog/#20190610. Sharing should be performed by the native share sheet.
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareMessengerGenericTemplateElement/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKCopying, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class FBSDKShareMessengerGenericTemplateElementPtr extends Ptr<FBSDKShareMessengerGenericTemplateElement, FBSDKShareMessengerGenericTemplateElementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKShareMessengerGenericTemplateElement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKShareMessengerGenericTemplateElement() {}
    protected FBSDKShareMessengerGenericTemplateElement(Handle h, long handle) { super(h, handle); }
    protected FBSDKShareMessengerGenericTemplateElement(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public FBSDKShareMessengerGenericTemplateElement(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "subtitle")
    public native String getSubtitle();
    @Property(selector = "setSubtitle:")
    public native void setSubtitle(String v);
    @Property(selector = "imageURL")
    public native NSURL getImageURL();
    @Property(selector = "setImageURL:")
    public native void setImageURL(NSURL v);
    @Property(selector = "defaultAction")
    public native FBSDKShareMessengerActionButton getDefaultAction();
    @Property(selector = "setDefaultAction:")
    public native void setDefaultAction(FBSDKShareMessengerActionButton v);
    @Property(selector = "button")
    public native FBSDKShareMessengerActionButton getButton();
    @Property(selector = "setButton:")
    public native void setButton(FBSDKShareMessengerActionButton v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "copy")
    public native NSObject copy();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
