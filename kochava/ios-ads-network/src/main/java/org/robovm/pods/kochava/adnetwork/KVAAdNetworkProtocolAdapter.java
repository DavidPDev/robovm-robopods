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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVAAdNetworkProtocolAdapter/*</name>*/ 
    extends /*<extends>*/KVAAsForContextObjectProtocolAdapter/*</extends>*/ 
    /*<implements>*/implements KVAAdNetworkProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("didRegisterAppForAttributionBlock")
    public @Block VoidBlock1<KVAAdNetwork> getDidRegisterAppForAttributionBlock() { return null; }
    @NotImplemented("setDidRegisterAppForAttributionBlock:")
    public void setDidRegisterAppForAttributionBlock(@Block VoidBlock1<KVAAdNetwork> v) {}
    @NotImplemented("conversion")
    public KVAAdNetworkConversion getConversion() { return null; }
    @NotImplemented("setConversion:")
    public void setConversion(KVAAdNetworkConversion v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("kva_configureWith:context:")
    public void kvaConfigure(NSObject object, KVAContext context) {}
    /*</methods>*/
}
