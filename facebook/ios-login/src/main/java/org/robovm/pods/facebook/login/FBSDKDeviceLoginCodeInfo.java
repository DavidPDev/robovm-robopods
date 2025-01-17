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
package org.robovm.pods.facebook.login;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.pods.facebook.core.*;
import org.robovm.pods.facebook.corebasics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKDeviceLoginCodeInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKDeviceLoginCodeInfoPtr extends Ptr<FBSDKDeviceLoginCodeInfo, FBSDKDeviceLoginCodeInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKDeviceLoginCodeInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKDeviceLoginCodeInfo() {}
    protected FBSDKDeviceLoginCodeInfo(Handle h, long handle) { super(h, handle); }
    protected FBSDKDeviceLoginCodeInfo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:loginCode:verificationURL:expirationDate:pollingInterval:")
    public FBSDKDeviceLoginCodeInfo(String identifier, String loginCode, NSURL verificationURL, NSDate expirationDate, @MachineSizedUInt long pollingInterval) { super((SkipInit) null); initObject(init(identifier, loginCode, verificationURL, expirationDate, pollingInterval)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "loginCode")
    public native String getLoginCode();
    @Property(selector = "verificationURL")
    public native NSURL getVerificationURL();
    @Property(selector = "expirationDate")
    public native NSDate getExpirationDate();
    @Property(selector = "pollingInterval")
    public native @MachineSizedUInt long getPollingInterval();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:loginCode:verificationURL:expirationDate:pollingInterval:")
    protected native @Pointer long init(String identifier, String loginCode, NSURL verificationURL, NSDate expirationDate, @MachineSizedUInt long pollingInterval);
    /*</methods>*/
}
