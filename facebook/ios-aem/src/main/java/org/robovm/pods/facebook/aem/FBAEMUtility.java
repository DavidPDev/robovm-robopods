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
package org.robovm.pods.facebook.aem;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAEMUtility/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBAEMUtilityPtr extends Ptr<FBAEMUtility, FBAEMUtilityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAEMUtility.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBAEMUtility() {}
    protected FBAEMUtility(Handle h, long handle) { super(h, handle); }
    protected FBAEMUtility(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getMatchedInvocation:businessID:")
    public native FBAEMInvocation getMatchedInvocation(NSArray<FBAEMInvocation> invocations, String businessID);
    @Method(selector = "getInSegmentValue:matchingRule:")
    public native NSNumber getInSegmentValue(NSDictionary<NSString, ?> parameters, FBAEMAdvertiserRuleMatching matchingRule);
    @Method(selector = "getContent:")
    public native String getContent(NSDictionary<NSString, ?> parameters);
    @Method(selector = "getContentID:")
    public native String getContentID(NSDictionary<NSString, ?> parameters);
    @Method(selector = "getBusinessIDsInOrder:")
    public native NSArray<NSString> getBusinessIDsInOrder(NSArray<FBAEMInvocation> invocations);
    @Method(selector = "sharedUtility")
    public static native FBAEMUtility sharedUtility();
    /*</methods>*/
}
