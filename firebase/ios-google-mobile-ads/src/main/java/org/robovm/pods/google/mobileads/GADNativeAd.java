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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADNativeAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADNativeAdPtr extends Ptr<GADNativeAd, GADNativeAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADNativeAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADNativeAd() {}
    protected GADNativeAd(Handle h, long handle) { super(h, handle); }
    protected GADNativeAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "headline")
    public native String getHeadline();
    @Property(selector = "callToAction")
    public native String getCallToAction();
    @Property(selector = "icon")
    public native GADNativeAdImage getIcon();
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "images")
    public native NSArray<GADNativeAdImage> getImages();
    @Property(selector = "starRating")
    public native NSDecimalNumber getStarRating();
    @Property(selector = "store")
    public native String getStore();
    @Property(selector = "price")
    public native String getPrice();
    @Property(selector = "advertiser")
    public native String getAdvertiser();
    @Property(selector = "mediaContent")
    public native GADMediaContent getMediaContent();
    @Property(selector = "delegate")
    public native GADNativeAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(GADNativeAdDelegate v);
    @Property(selector = "rootViewController")
    public native UIViewController getRootViewController();
    @Property(selector = "setRootViewController:", strongRef = true)
    public native void setRootViewController(UIViewController v);
    @Property(selector = "extraAssets")
    public native NSDictionary<NSString, ?> getExtraAssets();
    @Property(selector = "responseInfo")
    public native GADResponseInfo getResponseInfo();
    @Property(selector = "paidEventHandler")
    public native @Block VoidBlock1<GADAdValue> getPaidEventHandler();
    @Property(selector = "setPaidEventHandler:")
    public native void setPaidEventHandler(@Block VoidBlock1<GADAdValue> v);
    @Property(selector = "isCustomMuteThisAdAvailable")
    public native boolean isCustomMuteThisAdAvailable();
    @Property(selector = "muteThisAdReasons")
    public native NSArray<GADMuteThisAdReason> getMuteThisAdReasons();
    @Property(selector = "unconfirmedClickDelegate")
    public native GADNativeAdUnconfirmedClickDelegate getUnconfirmedClickDelegate();
    @Property(selector = "setUnconfirmedClickDelegate:", strongRef = true)
    public native void setUnconfirmedClickDelegate(GADNativeAdUnconfirmedClickDelegate v);
    @Property(selector = "isCustomClickGestureEnabled")
    public native boolean isCustomClickGestureEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "registerAdView:clickableAssetViews:nonclickableAssetViews:")
    public native void registerAdView(UIView adView, NSDictionary<NSString, UIView> clickableAssetViews, NSDictionary<NSString, UIView> nonclickableAssetViews);
    @Method(selector = "unregisterAdView")
    public native void unregisterAdView();
    @Method(selector = "muteThisAdWithReason:")
    public native void muteThisAd(GADMuteThisAdReason reason);
    @Method(selector = "registerClickConfirmingView:")
    public native void registerClickConfirmingView(UIView view);
    @Method(selector = "cancelUnconfirmedClick")
    public native void cancelUnconfirmedClick();
    @Method(selector = "enableCustomClickGestures")
    public native void enableCustomClickGestures();
    @Method(selector = "recordCustomClickGesture")
    public native void recordCustomClickGesture();
    /*</methods>*/
}
