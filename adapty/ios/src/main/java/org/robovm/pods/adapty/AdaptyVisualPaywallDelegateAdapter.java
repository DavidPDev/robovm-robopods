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
package org.robovm.pods.adapty;

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
import org.robovm.apple.storekit.*;
import org.robovm.apple.iad.*;
import org.robovm.apple.apptrackingtransparency.*;
import org.robovm.apple.adsupport.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AdaptyVisualPaywallDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements AdaptyVisualPaywallDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("didPurchaseWithProduct:purchaserInfo:receipt:appleValidationResult:paywall:")
    public void didPurchase(ProductModel product, PurchaserInfoModel purchaserInfo, String receipt, NSDictionary<NSString, ?> appleValidationResult, PaywallViewController paywall) {}
    @NotImplemented("didFailPurchaseWithProduct:error:paywall:")
    public void didFailPurchase(ProductModel product, AdaptyError error, PaywallViewController paywall) {}
    @NotImplemented("didCancelWithPaywall:")
    public void didCancel(PaywallViewController paywall) {}
    @NotImplemented("didRestoreWithPurchaserInfo:receipt:appleValidationResult:error:paywall:")
    public void didRestore(PurchaserInfoModel purchaserInfo, String receipt, NSDictionary<NSString, ?> appleValidationResult, AdaptyError error, PaywallViewController paywall) {}
    /*</methods>*/
}
