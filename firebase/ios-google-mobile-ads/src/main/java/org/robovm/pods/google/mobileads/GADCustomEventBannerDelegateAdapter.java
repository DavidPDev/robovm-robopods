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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADCustomEventBannerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GADCustomEventBannerDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("viewControllerForPresentingModalView")
    public UIViewController getViewControllerForPresentingModalView() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("customEventBanner:didReceiveAd:")
    public void didReceiveAd(GADCustomEventBanner customEvent, UIView view) {}
    @NotImplemented("customEventBanner:didFailAd:")
    public void didFailAd(GADCustomEventBanner customEvent, NSError error) {}
    @NotImplemented("customEventBannerWasClicked:")
    public void wasClicked(GADCustomEventBanner customEvent) {}
    @NotImplemented("customEventBannerWillPresentModal:")
    public void willPresentModal(GADCustomEventBanner customEvent) {}
    @NotImplemented("customEventBannerWillDismissModal:")
    public void willDismissModal(GADCustomEventBanner customEvent) {}
    @NotImplemented("customEventBannerDidDismissModal:")
    public void widDismissModal(GADCustomEventBanner customEvent) {}
    /**
     * @deprecated Use customEventBannerWasClicked:.
     */
    @Deprecated
    @NotImplemented("customEventBanner:clickDidOccurInAd:")
    public void clickDidOccurInAd(GADCustomEventBanner customEvent, UIView view) {}
    /**
     * @deprecated Deprecated. No replacement.
     */
    @Deprecated
    @NotImplemented("customEventBannerWillLeaveApplication:")
    public void willLeaveApplication(GADCustomEventBanner customEvent) {}
    /*</methods>*/
}
