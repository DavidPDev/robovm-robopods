//
//  CleverAdsSolutions.h
//  CleverAdsSolutions
//
//  Copyright © 2020 Clever Ads Solutions. All rights reserved.
//

#import <Foundation/Foundation.h>

//! Project version number for CleverAdsSolutions.
FOUNDATION_EXPORT double CleverAdsSolutionsVersionNumber;

//! Project version string for CleverAdsSolutions.
FOUNDATION_EXPORT const unsigned char CleverAdsSolutionsVersionString[];


typedef NS_OPTIONS (NSUInteger, CASTypeFlags){
    CASTypeFlagsNone = 0,
    CASTypeFlagsBanner = 1 << 0,
    CASTypeFlagsInterstitial = 1 << 1,
    CASTypeFlagsRewarded = 1 << 2,
    CASTypeFlagsNative = 1 << 3,
    CASTypeFlagsOpenApp = 1 << 6,
    CASTypeFlagsEverything = CASTypeFlagsBanner | CASTypeFlagsInterstitial | CASTypeFlagsRewarded
};

#import "CASInternalUtils.h"
