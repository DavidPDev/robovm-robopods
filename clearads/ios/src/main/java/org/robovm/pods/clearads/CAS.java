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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAS/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASPtr extends Ptr<CAS, CASPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CAS.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAS() {}
    protected CAS(Handle h, long handle) { super(h, handle); }
    protected CAS(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="CleverAdsSolutionsVersionNumber", optional=true)
    public static native double getVersionNumber();
    @GlobalValue(symbol="CleverAdsSolutionsVersionString", optional=true)
    public static native BytePtr getVersionString();
    
    @Method(selector = "getSDKVersion")
    public static native String getSDKVersion();
    @Method(selector = "settings")
    public static native CASSettings settings();
    @Method(selector = "targetingOptions")
    public static native CASTargetingOptions targetingOptions();
    @Method(selector = "manager")
    public static native CASMediationManager manager();
    @Method(selector = "buildManager")
    public static native CASManagerBuilder buildManager();
    @Method(selector = "validateIntegration")
    public static native void validateIntegration();
    /**
     * @deprecated Use new buildManager() feature instead.
     */
    @Deprecated
    @Method(selector = "createWithManagerID:onInit:")
    public static native CASMediationManager createMediationManager(String managerID, @Block VoidBlock2<Boolean, NSString> onInit);
    /**
     * @deprecated Use new buildManager() feature instead.
     */
    @Deprecated
    @Method(selector = "createWithManagerID:enableTypes:demoAdMode:onInit:")
    public static native CASMediationManager createMediationManager(String managerID, @MachineSizedUInt long enableTypes, boolean demoAdMode, @Block VoidBlock2<Boolean, NSString> onInit);
    /**
     * @deprecated Use new buildManager() feature instead.
     */
    @Deprecated
    @Method(selector = "createWithManagerID:enableTypes:demoAdMode:mediationExtras:onInit:")
    public static native CASMediationManager createMediationManager(String managerID, @MachineSizedUInt long enableTypes, boolean demoAdMode, NSDictionary<NSString, NSString> mediationExtras, @Block VoidBlock2<Boolean, NSString> onInit);
    @Method(selector = "getMessageOf:")
    public static native String getMessageOf(CASError error);
    /*</methods>*/
}
