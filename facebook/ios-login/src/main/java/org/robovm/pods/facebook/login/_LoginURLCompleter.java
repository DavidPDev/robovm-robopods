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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC13FBSDKLoginKit18_LoginURLCompleter")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/_LoginURLCompleter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKLoginCompleting/*</implements>*/ {

    /*<ptr>*/public static class _LoginURLCompleterPtr extends Ptr<_LoginURLCompleter, _LoginURLCompleterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(_LoginURLCompleter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected _LoginURLCompleter() {}
    protected _LoginURLCompleter(Handle h, long handle) { super(h, handle); }
    protected _LoginURLCompleter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "completeLoginWithHandler:")
    public native void completeLogin(@Block VoidBlock1<FBSDKLoginCompletionParameters> handler);
    @Method(selector = "completeLoginWithNonce:codeVerifier:handler:")
    public native void completeLogin(String nonce, String codeVerifier, @Block VoidBlock1<FBSDKLoginCompletionParameters> handler);
    /*</methods>*/
}
