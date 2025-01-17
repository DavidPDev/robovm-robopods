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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareDialog/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKSharingDialog, FBSDKWebDialogDelegate/*</implements>*/ {

    /*<ptr>*/public static class FBSDKShareDialogPtr extends Ptr<FBSDKShareDialog, FBSDKShareDialogPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKShareDialog.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKShareDialog() {}
    protected FBSDKShareDialog(Handle h, long handle) { super(h, handle); }
    protected FBSDKShareDialog(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewController:content:delegate:")
    public FBSDKShareDialog(UIViewController viewController, FBSDKSharingContent content, FBSDKSharingDelegate delegate) { super((SkipInit) null); initObject(init(viewController, content, delegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fromViewController")
    public native UIViewController getFromViewController();
    @Property(selector = "setFromViewController:", strongRef = true)
    public native void setFromViewController(UIViewController v);
    @Property(selector = "mode")
    public native FBSDKShareDialogMode getMode();
    @Property(selector = "setMode:")
    public native void setMode(FBSDKShareDialogMode v);
    @Property(selector = "delegate")
    public native FBSDKSharingDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBSDKSharingDelegate v);
    @Property(selector = "shareContent")
    public native FBSDKSharingContent getShareContent();
    @Property(selector = "setShareContent:")
    public native void setShareContent(FBSDKSharingContent v);
    @Property(selector = "shouldFailOnDataError")
    public native boolean shouldFailOnDataError();
    @Property(selector = "setShouldFailOnDataError:")
    public native void setShouldFailOnDataError(boolean v);
    @Property(selector = "canShow")
    public native boolean canShow();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewController:content:delegate:")
    protected native @Pointer long init(UIViewController viewController, FBSDKSharingContent content, FBSDKSharingDelegate delegate);
    @Method(selector = "showFromViewController:withContent:delegate:")
    public static native FBSDKShareDialog show(UIViewController viewController, FBSDKSharingContent content, FBSDKSharingDelegate delegate);
    @Method(selector = "webDialog:didCompleteWithResults:")
    public native void didComplete(FBSDKWebDialog webDialog, NSDictionary<NSString, ?> results);
    @Method(selector = "webDialog:didFailWithError:")
    public native void didFail(FBSDKWebDialog webDialog, NSError error);
    @Method(selector = "webDialogDidCancel:")
    public native void webDialogDidCancel(FBSDKWebDialog webDialog);
    @Method(selector = "show")
    public native boolean show();
    @Method(selector = "validateWithError:")
    public native boolean validate(NSError.NSErrorPtr error);
    /*</methods>*/
}
