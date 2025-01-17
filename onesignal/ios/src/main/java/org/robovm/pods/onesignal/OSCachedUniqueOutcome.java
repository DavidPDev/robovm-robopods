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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSCachedUniqueOutcome/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSCachedUniqueOutcomePtr extends Ptr<OSCachedUniqueOutcome, OSCachedUniqueOutcomePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSCachedUniqueOutcome.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSCachedUniqueOutcome() {}
    protected OSCachedUniqueOutcome(Handle h, long handle) { super(h, handle); }
    protected OSCachedUniqueOutcome(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithParamsName:uniqueId:channel:")
    public OSCachedUniqueOutcome(String name, String uniqueId, OSInfluenceChannel channel) { super((SkipInit) null); initObject(init(name, uniqueId, channel)); }
    @Method(selector = "initWithParamsName:uniqueId:timestamp:channel:")
    public OSCachedUniqueOutcome(String name, String uniqueId, NSNumber timestamp, OSInfluenceChannel channel) { super((SkipInit) null); initObject(init(name, uniqueId, timestamp, channel)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "uniqueId")
    public native String getUniqueId();
    @Property(selector = "timestamp")
    public native NSNumber getTimestamp();
    @Property(selector = "channel")
    public native OSInfluenceChannel getChannel();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithParamsName:uniqueId:channel:")
    protected native @Pointer long init(String name, String uniqueId, OSInfluenceChannel channel);
    @Method(selector = "initWithParamsName:uniqueId:timestamp:channel:")
    protected native @Pointer long init(String name, String uniqueId, NSNumber timestamp, OSInfluenceChannel channel);
    /*</methods>*/
}
