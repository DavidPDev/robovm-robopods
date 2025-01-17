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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADNativeAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADNativeAdViewPtr extends Ptr<GADNativeAdView, GADNativeAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADNativeAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADNativeAdView() {}
    protected GADNativeAdView(Handle h, long handle) { super(h, handle); }
    protected GADNativeAdView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public GADNativeAdView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public GADNativeAdView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "nativeAd")
    public native GADNativeAd getNativeAd();
    @Property(selector = "setNativeAd:")
    public native void setNativeAd(GADNativeAd v);
    @Property(selector = "headlineView")
    public native UIView getHeadlineView();
    @Property(selector = "setHeadlineView:", strongRef = true)
    public native void setHeadlineView(UIView v);
    @Property(selector = "callToActionView")
    public native UIView getCallToActionView();
    @Property(selector = "setCallToActionView:", strongRef = true)
    public native void setCallToActionView(UIView v);
    @Property(selector = "iconView")
    public native UIView getIconView();
    @Property(selector = "setIconView:", strongRef = true)
    public native void setIconView(UIView v);
    @Property(selector = "bodyView")
    public native UIView getBodyView();
    @Property(selector = "setBodyView:", strongRef = true)
    public native void setBodyView(UIView v);
    @Property(selector = "storeView")
    public native UIView getStoreView();
    @Property(selector = "setStoreView:", strongRef = true)
    public native void setStoreView(UIView v);
    @Property(selector = "priceView")
    public native UIView getPriceView();
    @Property(selector = "setPriceView:", strongRef = true)
    public native void setPriceView(UIView v);
    @Property(selector = "imageView")
    public native UIView getImageView();
    @Property(selector = "setImageView:", strongRef = true)
    public native void setImageView(UIView v);
    @Property(selector = "starRatingView")
    public native UIView getStarRatingView();
    @Property(selector = "setStarRatingView:", strongRef = true)
    public native void setStarRatingView(UIView v);
    @Property(selector = "advertiserView")
    public native UIView getAdvertiserView();
    @Property(selector = "setAdvertiserView:", strongRef = true)
    public native void setAdvertiserView(UIView v);
    @Property(selector = "mediaView")
    public native GADMediaView getMediaView();
    @Property(selector = "setMediaView:", strongRef = true)
    public native void setMediaView(GADMediaView v);
    @Property(selector = "adChoicesView")
    public native GADAdChoicesView getAdChoicesView();
    @Property(selector = "setAdChoicesView:", strongRef = true)
    public native void setAdChoicesView(GADAdChoicesView v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
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
