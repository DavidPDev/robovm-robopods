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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BNCCommerceEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BNCCommerceEventPtr extends Ptr<BNCCommerceEvent, BNCCommerceEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BNCCommerceEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BNCCommerceEvent() {}
    protected BNCCommerceEvent(Handle h, long handle) { super(h, handle); }
    protected BNCCommerceEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "revenue")
    public native NSDecimalNumber getRevenue();
    @Property(selector = "setRevenue:")
    public native void setRevenue(NSDecimalNumber v);
    @Property(selector = "currency")
    public native String getCurrency();
    @Property(selector = "setCurrency:")
    public native void setCurrency(String v);
    @Property(selector = "transactionID")
    public native String getTransactionID();
    @Property(selector = "setTransactionID:")
    public native void setTransactionID(String v);
    @Property(selector = "shipping")
    public native NSDecimalNumber getShipping();
    @Property(selector = "setShipping:")
    public native void setShipping(NSDecimalNumber v);
    @Property(selector = "tax")
    public native NSDecimalNumber getTax();
    @Property(selector = "setTax:")
    public native void setTax(NSDecimalNumber v);
    @Property(selector = "coupon")
    public native String getCoupon();
    @Property(selector = "setCoupon:")
    public native void setCoupon(String v);
    @Property(selector = "affiliation")
    public native String getAffiliation();
    @Property(selector = "setAffiliation:")
    public native void setAffiliation(String v);
    @Property(selector = "products")
    public native NSArray<BNCProduct> getProducts();
    @Property(selector = "setProducts:")
    public native void setProducts(NSArray<BNCProduct> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
