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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.facebook.corebasics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/FBSDKServerConfigurationSmartLoginOptions/*</name>*/ extends Bits</*<name>*/FBSDKServerConfigurationSmartLoginOptions/*</name>*/> {
    /*<values>*/
    public static final FBSDKServerConfigurationSmartLoginOptions None = new FBSDKServerConfigurationSmartLoginOptions(0L);
    public static final FBSDKServerConfigurationSmartLoginOptions Unknown = new FBSDKServerConfigurationSmartLoginOptions(0L);
    public static final FBSDKServerConfigurationSmartLoginOptions Enabled = new FBSDKServerConfigurationSmartLoginOptions(1L);
    public static final FBSDKServerConfigurationSmartLoginOptions RequireConfirmation = new FBSDKServerConfigurationSmartLoginOptions(2L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/FBSDKServerConfigurationSmartLoginOptions/*</name>*/[] values = _values(/*<name>*/FBSDKServerConfigurationSmartLoginOptions/*</name>*/.class);

    public /*<name>*/FBSDKServerConfigurationSmartLoginOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/FBSDKServerConfigurationSmartLoginOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/FBSDKServerConfigurationSmartLoginOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/FBSDKServerConfigurationSmartLoginOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/FBSDKServerConfigurationSmartLoginOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/FBSDKServerConfigurationSmartLoginOptions/*</name>*/[] values() {
        return values.clone();
    }
}
