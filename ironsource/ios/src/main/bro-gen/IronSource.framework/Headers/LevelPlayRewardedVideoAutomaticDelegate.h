//
//  LevelPlayRewardedVideoAutomaticDelegate.h
//  IronSource
//
//  Created by Hadar Pur on 31/05/2022.
//  Copyright © 2022 IronSource. All rights reserved.
//

#ifndef LevelPlayRewardedVideoAutomaticDelegate_h
#define LevelPlayRewardedVideoAutomaticDelegate_h

#import "ISAdInfo.h"

@protocol LevelPlayRewardedVideoAutomaticDelegate <LevelPlayRewardedVideoDelegate>

@required

/**
 Called after a rewarded video has changed its availability to true.
 @param adInfo The info of the ad.
 */
- (void)hasAdAvailableWithAdInfo:(ISAdInfo *)adInfo;

/**
 Called after a rewarded video has changed its availability to false.
 */
- (void)hasUnavailableAd;

@end

#endif /* LevelPlayRewardedVideoAutomaticDelegate_h */

