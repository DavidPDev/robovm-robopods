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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GAMBannerView/*</name>*/ 
    extends /*<extends>*/GADBannerView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GAMBannerViewPtr extends Ptr<GAMBannerView, GAMBannerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GAMBannerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GAMBannerView() {}
    protected GAMBannerView(Handle h, long handle) { super(h, handle); }
    protected GAMBannerView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdSize:origin:")
    public GAMBannerView(@ByVal GADAdSize adSize, @ByVal CGPoint origin) { super(adSize, origin); }
    @Method(selector = "initWithAdSize:")
    public GAMBannerView(@ByVal GADAdSize adSize) { super(adSize); }
    @Method(selector = "initWithFrame:")
    public GAMBannerView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public GAMBannerView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnitID")
    public native String getAdUnitID();
    @Property(selector = "setAdUnitID:")
    public native void setAdUnitID(String v);
    @Property(selector = "appEventDelegate")
    public native GADAppEventDelegate getAppEventDelegate();
    @Property(selector = "setAppEventDelegate:", strongRef = true)
    public native void setAppEventDelegate(GADAppEventDelegate v);
    @Property(selector = "adSizeDelegate")
    public native GADAdSizeDelegate getAdSizeDelegate();
    @Property(selector = "setAdSizeDelegate:", strongRef = true)
    public native void setAdSizeDelegate(GADAdSizeDelegate v);
    @Property(selector = "validAdSizes")
    public native NSArray<NSValue> getValidAdSizes();
    @Property(selector = "setValidAdSizes:")
    public native void setValidAdSizes(NSArray<NSValue> v);
    @Property(selector = "enableManualImpressions")
    public native boolean isEnableManualImpressions();
    @Property(selector = "setEnableManualImpressions:")
    public native void setEnableManualImpressions(boolean v);
    @Property(selector = "videoController")
    public native GADVideoController getVideoController();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "recordImpression")
    public native void recordImpression();
    @Method(selector = "resize:")
    public native void resize(@ByVal GADAdSize size);
    @Method(selector = "setAdOptions:")
    public native void setAdOptions(NSArray<GADAdLoaderOptions> adOptions);
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
