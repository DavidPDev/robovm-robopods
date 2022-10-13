//
//  CASInternalUtils.h
//  CleverAdsSolutions
//
//  Copyright © 2022 Clever Ads Solutions. All rights reserved.
//

#ifndef CASInternalUtils_h
#define CASInternalUtils_h

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

//NS_INLINE NSException * _Nullable CASUtilsTryExecuteWithCatchExceptions(void (^_Nonnull tryBlock)(void))
//{
//    @try {
//        tryBlock();
//    } @catch (NSException *exception) {
//        return exception;
//    }
//    return nil;
//}

@interface CASInternalUtils : NSObject
@property (class, readonly, nonnull) NSString *adId;
@property (class, readonly) BOOL isAdTrackingEnabled;
@property (class, readonly) NSUInteger adTrackingStatus;

+ (BOOL)tryFirebaseLogEvent:(NSString *)eventName map:(NSDictionary<NSString *, id> *)map;
+ (void)trackingAuthorizationRequest:(nullable void (^)(NSUInteger))completion;
@end

NS_ASSUME_NONNULL_END

#endif /* ifndef CASInternalUtils_h */
