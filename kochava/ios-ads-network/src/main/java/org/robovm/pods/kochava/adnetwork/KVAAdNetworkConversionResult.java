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
package org.robovm.pods.kochava.adnetwork;

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
import org.robovm.pods.kochava.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVAAdNetworkConversionResult/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements KVAAsForContextObjectProtocol, KVAConfigureWithObjectProtocol, KVAFromObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class KVAAdNetworkConversionResultPtr extends Ptr<KVAAdNetworkConversionResult, KVAAdNetworkConversionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVAAdNetworkConversionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public KVAAdNetworkConversionResult() {}
    protected KVAAdNetworkConversionResult(Handle h, long handle) { super(h, handle); }
    protected KVAAdNetworkConversionResult(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "modelString")
    public native String getModelString();
    @Property(selector = "translatedValueIntNumber")
    public native NSNumber getTranslatedValueIntNumber();
    @Property(selector = "rawValueNumber")
    public native NSNumber getRawValueNumber();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "valueInt")
    public native @MachineSizedSInt long valueInt();
    @Method(selector = "kva_asForContextObjectWithContext:")
    public native NSObject kvaConvertForContext(KVAContext context);
    @Method(selector = "kva_configureWith:context:")
    public native void kvaConfigure(NSObject object, KVAContext context);
    @Method(selector = "kva_fromObject:")
    public static native KVAAdNetworkConversionResult createFromObject(NSObject object);
    /*</methods>*/
}
