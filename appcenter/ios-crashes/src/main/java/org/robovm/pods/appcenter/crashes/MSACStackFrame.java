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
package org.robovm.pods.appcenter.crashes;

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
import org.robovm.pods.appcenter.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSACStackFrame/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MSACSerializableObject/*</implements>*/ {

    /*<ptr>*/public static class MSACStackFramePtr extends Ptr<MSACStackFrame, MSACStackFramePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSACStackFrame.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSACStackFrame() {}
    protected MSACStackFrame(Handle h, long handle) { super(h, handle); }
    protected MSACStackFrame(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MSACStackFrame(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "address")
    public native String getAddress();
    @Property(selector = "setAddress:")
    public native void setAddress(String v);
    @Property(selector = "code")
    public native String getCode();
    @Property(selector = "setCode:")
    public native void setCode(String v);
    @Property(selector = "className")
    public native String getClassName();
    @Property(selector = "setClassName:")
    public native void setClassName(String v);
    @Property(selector = "methodName")
    public native String getMethodName();
    @Property(selector = "setMethodName:")
    public native void setMethodName(String v);
    @Property(selector = "lineNumber")
    public native NSNumber getLineNumber();
    @Property(selector = "setLineNumber:")
    public native void setLineNumber(NSNumber v);
    @Property(selector = "fileName")
    public native String getFileName();
    @Property(selector = "setFileName:")
    public native void setFileName(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "serializeToDictionary")
    public native NSMutableDictionary<?, ?> serializeToDictionary();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
