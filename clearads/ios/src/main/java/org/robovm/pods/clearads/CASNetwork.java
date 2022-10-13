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
package org.robovm.pods.clearads;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASNetwork/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASNetworkPtr extends Ptr<CASNetwork, CASNetworkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASNetwork.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CASNetwork() {}
    protected CASNetwork(Handle h, long handle) { super(h, handle); }
    protected CASNetwork(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "adMob")
    public static native String adMob();
    @Method(selector = "vungle")
    public static native String vungle();
    @Method(selector = "kidoz")
    public static native String kidoz();
    @Method(selector = "chartboost")
    public static native String chartboost();
    @Method(selector = "unityAds")
    public static native String unityAds();
    @Method(selector = "appLovin")
    public static native String appLovin();
    @Method(selector = "superAwesome")
    public static native String superAwesome();
    @Method(selector = "adColony")
    public static native String adColony();
    @Method(selector = "facebookAN")
    public static native String facebookAN();
    @Method(selector = "inMobi")
    public static native String inMobi();
    @Method(selector = "myTarget")
    public static native String myTarget();
    @Method(selector = "crossPromo")
    public static native String crossPromo();
    @Method(selector = "ironSource")
    public static native String ironSource();
    @Method(selector = "yandexAds")
    public static native String yandexAds();
    @Method(selector = "tapjoy")
    public static native String tapjoy();
    @Method(selector = "fyber")
    public static native String fyber();
    @Method(selector = "mintegral")
    public static native String mintegral();
    @Method(selector = "pangle")
    public static native String pangle();
    @Method(selector = "hyprMX")
    public static native String hyprMX();
    @Method(selector = "max")
    public static native String max();
    @Method(selector = "fairBid")
    public static native String fairBid();
    @Method(selector = "lastPageAd")
    public static native String lastPageAd();
    @Method(selector = "startApp")
    public static native String startApp();
    @Method(selector = "mopub")
    public static native String mopub();
    @Method(selector = "smaato")
    public static native String smaato();
    @Method(selector = "mobFox")
    public static native String mobFox();
    @Method(selector = "verizon")
    public static native String verizon();
    @Method(selector = "amazonAds")
    public static native String amazonAds();
    @Method(selector = "ownVAST")
    public static native String ownVAST();
    @Method(selector = "facebookAdvertiserTracking")
    public static native String facebookAdvertiserTracking();
    @Method(selector = "facebookDataProcessing")
    public static native String facebookDataProcessing();
    @Method(selector = "facebookGDPRConsent")
    public static native String facebookGDPRConsent();
    @Method(selector = "facebookCCPAOptedOut")
    public static native String facebookCCPAOptedOut();
    @Method(selector = "adMobGDPRConsent")
    public static native String adMobGDPRConsent();
    @Method(selector = "adMobCCPAOptedOut")
    public static native String adMobCCPAOptedOut();
    @Method(selector = "appLovinGDPRConsent")
    public static native String appLovinGDPRConsent();
    @Method(selector = "appLovinCCPAOptedOut")
    public static native String appLovinCCPAOptedOut();
    @Method(selector = "appLovinUseMAX")
    public static native String appLovinUseMAX();
    @Method(selector = "inMobiGDPRConsent")
    public static native String inMobiGDPRConsent();
    @Method(selector = "inMobiGDPRIAB")
    public static native String inMobiGDPRIAB();
    @Method(selector = "adColonyGDPRConsent")
    public static native String adColonyGDPRConsent();
    @Method(selector = "adColonyCCPAOptedOut")
    public static native String adColonyCCPAOptedOut();
    @Method(selector = "vungleGDPRConsent")
    public static native String vungleGDPRConsent();
    @Method(selector = "vungleCCPAOptedOut")
    public static native String vungleCCPAOptedOut();
    @Method(selector = "vunglePublishIDFV")
    public static native String vunglePublishIDFV();
    @Method(selector = "ironSourceGDPRConsent")
    public static native String ironSourceGDPRConsent();
    @Method(selector = "ironSourceCCPAOptedOut")
    public static native String ironSourceCCPAOptedOut();
    @Method(selector = "unityAdsGDPRConsent")
    public static native String unityAdsGDPRConsent();
    @Method(selector = "unityAdsCCPAOptedOut")
    public static native String unityAdsCCPAOptedOut();
    @Method(selector = "startAppGDPRConsent")
    public static native String startAppGDPRConsent();
    @Method(selector = "myTargetGDPRConsent")
    public static native String myTargetGDPRConsent();
    @Method(selector = "myTargetCCPAOptedOut")
    public static native String myTargetCCPAOptedOut();
    @Method(selector = "yandexAdsGDPRConsent")
    public static native String yandexAdsGDPRConsent();
    @Method(selector = "fyberGDPRConsent")
    public static native String fyberGDPRConsent();
    @Method(selector = "fyberCCPAOptedOut")
    public static native String fyberCCPAOptedOut();
    @Method(selector = "tapjoyGDPRConsent")
    public static native String tapjoyGDPRConsent();
    @Method(selector = "tapjoyCCPAOptedOut")
    public static native String tapjoyCCPAOptedOut();
    @Method(selector = "mintegralGDPRConsent")
    public static native String mintegralGDPRConsent();
    @Method(selector = "mintegralCCPAOptedOut")
    public static native String mintegralCCPAOptedOut();
    @Method(selector = "getActiveNetworkPattern")
    public static native String getActiveNetworkPattern();
    @Method(selector = "getActiveNetworks")
    public static native NSArray<NSString> getActiveNetworks();
    @Method(selector = "isActiveNetwork:")
    public static native boolean isActiveNetwork(String network);
    @Method(selector = "values")
    public static native NSArray<NSString> values();
    /*</methods>*/
}
