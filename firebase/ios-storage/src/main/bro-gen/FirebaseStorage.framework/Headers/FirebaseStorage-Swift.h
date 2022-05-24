// Generated by Apple Swift version 5.6 (swiftlang-5.6.0.323.62 clang-1316.0.20.8)
#ifndef FIREBASESTORAGE_SWIFT_H
#define FIREBASESTORAGE_SWIFT_H
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wgcc-compat"

#if !defined(__has_include)
# define __has_include(x) 0
#endif
#if !defined(__has_attribute)
# define __has_attribute(x) 0
#endif
#if !defined(__has_feature)
# define __has_feature(x) 0
#endif
#if !defined(__has_warning)
# define __has_warning(x) 0
#endif

#if __has_include(<swift/objc-prologue.h>)
# include <swift/objc-prologue.h>
#endif

#pragma clang diagnostic ignored "-Wauto-import"
#include <Foundation/Foundation.h>
#include <stdint.h>
#include <stddef.h>
#include <stdbool.h>

#if !defined(SWIFT_TYPEDEFS)
# define SWIFT_TYPEDEFS 1
# if __has_include(<uchar.h>)
#  include <uchar.h>
# elif !defined(__cplusplus)
typedef uint_least16_t char16_t;
typedef uint_least32_t char32_t;
# endif
typedef float swift_float2  __attribute__((__ext_vector_type__(2)));
typedef float swift_float3  __attribute__((__ext_vector_type__(3)));
typedef float swift_float4  __attribute__((__ext_vector_type__(4)));
typedef double swift_double2  __attribute__((__ext_vector_type__(2)));
typedef double swift_double3  __attribute__((__ext_vector_type__(3)));
typedef double swift_double4  __attribute__((__ext_vector_type__(4)));
typedef int swift_int2  __attribute__((__ext_vector_type__(2)));
typedef int swift_int3  __attribute__((__ext_vector_type__(3)));
typedef int swift_int4  __attribute__((__ext_vector_type__(4)));
typedef unsigned int swift_uint2  __attribute__((__ext_vector_type__(2)));
typedef unsigned int swift_uint3  __attribute__((__ext_vector_type__(3)));
typedef unsigned int swift_uint4  __attribute__((__ext_vector_type__(4)));
#endif

#if !defined(SWIFT_PASTE)
# define SWIFT_PASTE_HELPER(x, y) x##y
# define SWIFT_PASTE(x, y) SWIFT_PASTE_HELPER(x, y)
#endif
#if !defined(SWIFT_METATYPE)
# define SWIFT_METATYPE(X) Class
#endif
#if !defined(SWIFT_CLASS_PROPERTY)
# if __has_feature(objc_class_property)
#  define SWIFT_CLASS_PROPERTY(...) __VA_ARGS__
# else
#  define SWIFT_CLASS_PROPERTY(...)
# endif
#endif

#if __has_attribute(objc_runtime_name)
# define SWIFT_RUNTIME_NAME(X) __attribute__((objc_runtime_name(X)))
#else
# define SWIFT_RUNTIME_NAME(X)
#endif
#if __has_attribute(swift_name)
# define SWIFT_COMPILE_NAME(X) __attribute__((swift_name(X)))
#else
# define SWIFT_COMPILE_NAME(X)
#endif
#if __has_attribute(objc_method_family)
# define SWIFT_METHOD_FAMILY(X) __attribute__((objc_method_family(X)))
#else
# define SWIFT_METHOD_FAMILY(X)
#endif
#if __has_attribute(noescape)
# define SWIFT_NOESCAPE __attribute__((noescape))
#else
# define SWIFT_NOESCAPE
#endif
#if __has_attribute(ns_consumed)
# define SWIFT_RELEASES_ARGUMENT __attribute__((ns_consumed))
#else
# define SWIFT_RELEASES_ARGUMENT
#endif
#if __has_attribute(warn_unused_result)
# define SWIFT_WARN_UNUSED_RESULT __attribute__((warn_unused_result))
#else
# define SWIFT_WARN_UNUSED_RESULT
#endif
#if __has_attribute(noreturn)
# define SWIFT_NORETURN __attribute__((noreturn))
#else
# define SWIFT_NORETURN
#endif
#if !defined(SWIFT_CLASS_EXTRA)
# define SWIFT_CLASS_EXTRA
#endif
#if !defined(SWIFT_PROTOCOL_EXTRA)
# define SWIFT_PROTOCOL_EXTRA
#endif
#if !defined(SWIFT_ENUM_EXTRA)
# define SWIFT_ENUM_EXTRA
#endif
#if !defined(SWIFT_CLASS)
# if __has_attribute(objc_subclassing_restricted)
#  define SWIFT_CLASS(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) __attribute__((objc_subclassing_restricted)) SWIFT_CLASS_EXTRA
#  define SWIFT_CLASS_NAMED(SWIFT_NAME) __attribute__((objc_subclassing_restricted)) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
# else
#  define SWIFT_CLASS(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
#  define SWIFT_CLASS_NAMED(SWIFT_NAME) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
# endif
#endif
#if !defined(SWIFT_RESILIENT_CLASS)
# if __has_attribute(objc_class_stub)
#  define SWIFT_RESILIENT_CLASS(SWIFT_NAME) SWIFT_CLASS(SWIFT_NAME) __attribute__((objc_class_stub))
#  define SWIFT_RESILIENT_CLASS_NAMED(SWIFT_NAME) __attribute__((objc_class_stub)) SWIFT_CLASS_NAMED(SWIFT_NAME)
# else
#  define SWIFT_RESILIENT_CLASS(SWIFT_NAME) SWIFT_CLASS(SWIFT_NAME)
#  define SWIFT_RESILIENT_CLASS_NAMED(SWIFT_NAME) SWIFT_CLASS_NAMED(SWIFT_NAME)
# endif
#endif

#if !defined(SWIFT_PROTOCOL)
# define SWIFT_PROTOCOL(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) SWIFT_PROTOCOL_EXTRA
# define SWIFT_PROTOCOL_NAMED(SWIFT_NAME) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_PROTOCOL_EXTRA
#endif

#if !defined(SWIFT_EXTENSION)
# define SWIFT_EXTENSION(M) SWIFT_PASTE(M##_Swift_, __LINE__)
#endif

#if !defined(OBJC_DESIGNATED_INITIALIZER)
# if __has_attribute(objc_designated_initializer)
#  define OBJC_DESIGNATED_INITIALIZER __attribute__((objc_designated_initializer))
# else
#  define OBJC_DESIGNATED_INITIALIZER
# endif
#endif
#if !defined(SWIFT_ENUM_ATTR)
# if defined(__has_attribute) && __has_attribute(enum_extensibility)
#  define SWIFT_ENUM_ATTR(_extensibility) __attribute__((enum_extensibility(_extensibility)))
# else
#  define SWIFT_ENUM_ATTR(_extensibility)
# endif
#endif
#if !defined(SWIFT_ENUM)
# define SWIFT_ENUM(_type, _name, _extensibility) enum _name : _type _name; enum SWIFT_ENUM_ATTR(_extensibility) SWIFT_ENUM_EXTRA _name : _type
# if __has_feature(generalized_swift_name)
#  define SWIFT_ENUM_NAMED(_type, _name, SWIFT_NAME, _extensibility) enum _name : _type _name SWIFT_COMPILE_NAME(SWIFT_NAME); enum SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_ENUM_ATTR(_extensibility) SWIFT_ENUM_EXTRA _name : _type
# else
#  define SWIFT_ENUM_NAMED(_type, _name, SWIFT_NAME, _extensibility) SWIFT_ENUM(_type, _name, _extensibility)
# endif
#endif
#if !defined(SWIFT_UNAVAILABLE)
# define SWIFT_UNAVAILABLE __attribute__((unavailable))
#endif
#if !defined(SWIFT_UNAVAILABLE_MSG)
# define SWIFT_UNAVAILABLE_MSG(msg) __attribute__((unavailable(msg)))
#endif
#if !defined(SWIFT_AVAILABILITY)
# define SWIFT_AVAILABILITY(plat, ...) __attribute__((availability(plat, __VA_ARGS__)))
#endif
#if !defined(SWIFT_WEAK_IMPORT)
# define SWIFT_WEAK_IMPORT __attribute__((weak_import))
#endif
#if !defined(SWIFT_DEPRECATED)
# define SWIFT_DEPRECATED __attribute__((deprecated))
#endif
#if !defined(SWIFT_DEPRECATED_MSG)
# define SWIFT_DEPRECATED_MSG(...) __attribute__((deprecated(__VA_ARGS__)))
#endif
#if __has_feature(attribute_diagnose_if_objc)
# define SWIFT_DEPRECATED_OBJC(Msg) __attribute__((diagnose_if(1, Msg, "warning")))
#else
# define SWIFT_DEPRECATED_OBJC(Msg) SWIFT_DEPRECATED_MSG(Msg)
#endif
#if !defined(IBSegueAction)
# define IBSegueAction
#endif
#if !defined(SWIFT_EXTERN)
# if defined(__cplusplus)
#  define SWIFT_EXTERN extern "C"
# else
#  define SWIFT_EXTERN extern
# endif
#endif
#if __has_feature(modules)
#if __has_warning("-Watimport-in-framework-header")
#pragma clang diagnostic ignored "-Watimport-in-framework-header"
#endif
@import Dispatch;
@import Foundation;
@import ObjectiveC;
#endif

#pragma clang diagnostic ignored "-Wproperty-attribute-mismatch"
#pragma clang diagnostic ignored "-Wduplicate-method-arg"
#if __has_warning("-Wpragma-clang-attribute")
# pragma clang diagnostic ignored "-Wpragma-clang-attribute"
#endif
#pragma clang diagnostic ignored "-Wunknown-pragmas"
#pragma clang diagnostic ignored "-Wnullability"

#if __has_attribute(external_source_symbol)
# pragma push_macro("any")
# undef any
# pragma clang attribute push(__attribute__((external_source_symbol(language="Swift", defined_in="FirebaseStorage",generated_declaration))), apply_to=any(function,enum,objc_interface,objc_category,objc_protocol))
# pragma pop_macro("any")
#endif

@class NSString;
@class FIRApp;
@class FIRStorageReference;

/// FirebaseStorage is a service that supports uploading and downloading binary objects,
/// such as images, videos, and other files to Google Cloud Storage.
/// If you call <code>FirebaseStorage.storage()</code>, the instance will initialize with the default FirebaseApp,
/// <code>FirebaseApp.app()</code>, and the storage location will come from the provided
/// GoogleService-Info.plist.
/// If you provide a custom instance of FirebaseApp,
/// the storage location will be specified via the FirebaseOptions#storageBucket property.
SWIFT_CLASS_NAMED("Storage")
@interface FIRStorage : NSObject
/// An instance of FirebaseStorage, configured with the default FirebaseApp.
/// @return the FirebaseStorage instance, configured with the default FirebaseApp.
+ (FIRStorage * _Nonnull)storage SWIFT_WARN_UNUSED_RESULT;
/// An instance of FirebaseStorage, configured with a custom storage bucket @a url.
/// @param url The gs:// url to your Firebase Storage Bucket.
/// @return the FirebaseStorage instance, configured with the custom FirebaseApp.
+ (FIRStorage * _Nonnull)storageWithURL:(NSString * _Nonnull)url SWIFT_WARN_UNUSED_RESULT;
/// Creates an instance of FirebaseStorage, configured with the custom FirebaseApp @a app.
/// @param app The custom FirebaseApp used for initialization.
/// @return the FirebaseStorage instance, configured with the custom FirebaseApp.
+ (FIRStorage * _Nonnull)storageForApp:(FIRApp * _Nonnull)app SWIFT_WARN_UNUSED_RESULT;
/// Creates an instance of FirebaseStorage, configured with a custom FirebaseApp @a app and a custom storage
/// bucket @a url.
/// @param app The custom FirebaseApp used for initialization.
/// @param url The gs:// url to your Firebase Storage Bucket.
/// @return the FirebaseStorage instance, configured with the custom FirebaseApp.
+ (FIRStorage * _Nonnull)storageForApp:(FIRApp * _Nonnull)app URL:(NSString * _Nonnull)url SWIFT_WARN_UNUSED_RESULT;
/// The Firebase App associated with this Firebase Storage instance.
@property (nonatomic, readonly, strong) FIRApp * _Nonnull app;
/// Maximum time in seconds to retry an upload if a failure occurs.
/// Defaults to 10 minutes (600 seconds).
@property (nonatomic) NSTimeInterval maxUploadRetryTime;
/// Maximum time in seconds to retry a download if a failure occurs.
/// Defaults to 10 minutes (600 seconds).
@property (nonatomic) NSTimeInterval maxDownloadRetryTime;
/// Maximum time in seconds to retry operations other than upload and download if a failure occurs.
/// Defaults to 2 minutes (120 seconds).
@property (nonatomic) NSTimeInterval maxOperationRetryTime;
/// Queue that all developer callbacks are fired on. Defaults to the main queue.
@property (nonatomic, strong) dispatch_queue_t _Nonnull callbackQueue;
/// Creates a StorageReference initialized at the root Firebase Storage location.
/// @return An instance of StorageReference initialized at the root.
- (FIRStorageReference * _Nonnull)reference SWIFT_WARN_UNUSED_RESULT;
/// Creates a StorageReference given a gs:// or https:// URL pointing to a Firebase Storage
/// location. For example, you can pass in an https:// download URL retrieved from
/// [StorageReference downloadURLWithCompletion] or the gs:// URI from
/// [StorageReference description].
/// @param string A gs:// or https:// URL to initialize the reference with.
/// @return An instance of StorageReference at the given child path.
/// @throws Throws an exception if passed in URL is not associated with the FirebaseApp used to initialize
/// this FirebaseStorage.
- (FIRStorageReference * _Nonnull)referenceForURL:(NSString * _Nonnull)string SWIFT_WARN_UNUSED_RESULT;
/// Creates a StorageReference initialized at a child Firebase Storage location.
/// @param string A relative path from the root to initialize the reference with,
/// for instance @“path/to/object”.
/// @return An instance of StorageReference at the given child path.
- (FIRStorageReference * _Nonnull)referenceWithPath:(NSString * _Nonnull)string SWIFT_WARN_UNUSED_RESULT;
/// Configures the Storage SDK to use an emulated backend instead of the default remote backend.
- (void)useEmulatorWithHost:(NSString * _Nonnull)host port:(NSInteger)port;
- (id _Nonnull)copy SWIFT_WARN_UNUSED_RESULT;
- (BOOL)isEqual:(id _Nullable)object SWIFT_WARN_UNUSED_RESULT;
@property (nonatomic, readonly) NSUInteger hash;
@property (nonatomic, readonly, copy) NSString * _Nonnull description;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end


/// Defines task operations such as pause, resume, cancel, and enqueue for all tasks.
/// All tasks are required to implement enqueue, which begins the task, and may optionally
/// implement pause, resume, and cancel, which operate on the task to pause, resume, and cancel
/// operations.
SWIFT_PROTOCOL_NAMED("StorageTaskManagement")
@protocol FIRStorageTaskManagement <NSObject>
/// Prepares a task and begins execution.
- (void)enqueue;
@optional
/// Pauses a task currently in progress.
- (void)pause;
/// Pauses a task currently in progress.
- (void)cancel;
/// Pauses a task currently in progress.
- (void)resume;
@end

@class FIRStorageTaskSnapshot;

/// A superclass to all Storage*Tasks, including StorageUploadTask
/// and StorageDownloadTask, to provide state transitions, event raising, and common storage
/// or metadata and errors.
/// Callbacks are always fired on the developer specified callback queue.
/// If no queue is specified by the developer, it defaults to the main queue.
/// Currently not thread safe, so only call methods on the main thread.
SWIFT_CLASS_NAMED("StorageTask")
@interface FIRStorageTask : NSObject
/// An immutable view of the task and associated metadata, progress, error, etc.
@property (nonatomic, readonly, strong) FIRStorageTaskSnapshot * _Nonnull snapshot;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end

enum FIRStorageTaskStatus : NSInteger;

/// Extends FIRStorageTask to provide observable semantics such as adding and removing observers.
/// Observers produce a FIRStorageHandle, which is used to keep track of and remove specific
/// observers at a later date.
/// This class is currently not thread safe and can only be called on the main thread.
SWIFT_CLASS_NAMED("StorageObservableTask")
@interface FIRStorageObservableTask : FIRStorageTask
/// Observes changes in the upload status: Resume, Pause, Progress, Success, and Failure.
/// @param status The StorageTaskStatus change to observe.
/// @param handler A callback that fires every time the status event occurs,
/// returns a StorageTaskSnapshot containing the state of the task.
/// @return A task handle that can be used to remove the observer at a later date.
- (NSString * _Nonnull)observeStatus:(enum FIRStorageTaskStatus)status handler:(void (^ _Nonnull)(FIRStorageTaskSnapshot * _Nonnull))handler;
/// Removes the single observer with the provided handle.
/// @param handle The handle of the task to remove.
- (void)removeObserverWithHandle:(NSString * _Nonnull)handle;
/// Removes all observers for a single status.
/// @param status A StorageTaskStatus to remove listeners for.
- (void)removeAllObserversForStatus:(enum FIRStorageTaskStatus)status;
/// Removes all observers.
- (void)removeAllObservers;
@end


/// StorageDownloadTask implements resumable downloads from an object in Firebase Storage.
/// Downloads can be returned on completion with a completion handler, and can be monitored
/// by attaching observers, or controlled by calling StorageTask#pause, StorageTask#resume,
/// or FIRIMPLStorageTask#cancel.
/// Downloads can currently be returned as Data in memory, or as an URL to a file on disk.
/// Downloads are performed on a background queue, and callbacks are raised on the developer
/// specified callbackQueue in Storage, or the main queue if left unspecified.
/// Currently all uploads must be initiated and managed on the main queue.
SWIFT_CLASS_NAMED("StorageDownloadTask")
@interface FIRStorageDownloadTask : FIRStorageObservableTask <FIRStorageTaskManagement>
/// Prepares a task and begins execution.
- (void)enqueue;
/// Pauses a task currently in progress.
- (void)pause;
/// Pauses a task currently in progress.
- (void)cancel;
/// Pauses a task currently in progress.
- (void)resume;
@end

typedef SWIFT_ENUM_NAMED(NSInteger, FIRStorageErrorCode, "StorageErrorCode", open) {
  FIRStorageErrorCodeUnknown = -13000,
  FIRStorageErrorCodeObjectNotFound = -13010,
  FIRStorageErrorCodeBucketNotFound = -13011,
  FIRStorageErrorCodeProjectNotFound = -13012,
  FIRStorageErrorCodeQuotaExceeded = -13013,
  FIRStorageErrorCodeUnauthenticated = -13020,
  FIRStorageErrorCodeUnauthorized = -13021,
  FIRStorageErrorCodeRetryLimitExceeded = -13030,
  FIRStorageErrorCodeNonMatchingChecksum = -13031,
  FIRStorageErrorCodeDownloadSizeExceeded = -13032,
  FIRStorageErrorCodeCancelled = -13040,
  FIRStorageErrorCodeInvalidArgument = -13050,
};


/// Contains the prefixes and items returned by a <code>StorageReference.list()</code> call.
SWIFT_CLASS_NAMED("StorageListResult")
@interface FIRStorageListResult : NSObject
/// The prefixes (folders) returned by the <code>list()</code> operation.
/// @return A list of prefixes (folders).
@property (nonatomic, readonly, copy) NSArray<FIRStorageReference *> * _Nonnull prefixes;
/// Returns a token that can be used to resume a previous <code>list()</code> operation. <code>nil</code>
/// indicates that there are no more results.
/// @return A page token if more results are available.
@property (nonatomic, readonly, copy) NSArray<FIRStorageReference *> * _Nonnull items;
/// Returns a token that can be used to resume a previous <code>list()</code> operation. <code>nil</code>
/// indicates that there are no more results.
/// @return A page token if more results are available.
@property (nonatomic, readonly, copy) NSString * _Nullable pageToken;
- (id _Nonnull)copy SWIFT_WARN_UNUSED_RESULT;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end

@class NSDate;

/// Class which represents the metadata on an object in Firebase Storage. This metadata is
/// returned on successful operations, and can be used to retrieve download URLs, content types,
/// and a Storage reference to the object in question. Full documentation can be found at the GCS
/// Objects#resource docs.
/// @see https://cloud.google.com/storage/docs/json_api/v1/objects#resource
SWIFT_CLASS_NAMED("StorageMetadata")
@interface FIRStorageMetadata : NSObject
/// The name of the bucket containing this object.
@property (nonatomic, readonly, copy) NSString * _Nonnull bucket;
/// Cache-Control directive for the object data.
@property (nonatomic, copy) NSString * _Nullable cacheControl;
/// Content-Disposition of the object data.
@property (nonatomic, copy) NSString * _Nullable contentDisposition;
/// Content-Encoding of the object data.
@property (nonatomic, copy) NSString * _Nullable contentEncoding;
/// Content-Language of the object data.
@property (nonatomic, copy) NSString * _Nullable contentLanguage;
/// Content-Type of the object data.
@property (nonatomic, copy) NSString * _Nullable contentType;
/// MD5 hash of the data; encoded using base64.
@property (nonatomic, readonly, copy) NSString * _Nullable md5Hash;
/// The content generation of this object. Used for object versioning.
@property (nonatomic, readonly) int64_t generation;
/// User-provided metadata, in key/value pairs.
@property (nonatomic, copy) NSDictionary<NSString *, NSString *> * _Nullable customMetadata;
/// The version of the metadata for this object at this generation. Used
/// for preconditions and for detecting changes in metadata. A metageneration number is only
/// meaningful in the context of a particular generation of a particular object.
@property (nonatomic, readonly) int64_t metageneration;
/// The name of this object, in gs://bucket/path/to/object.txt, this is object.txt.
@property (nonatomic, readonly, copy) NSString * _Nullable name;
/// The full path of this object, in gs://bucket/path/to/object.txt, this is path/to/object.txt.
@property (nonatomic, readonly, copy) NSString * _Nullable path;
/// Content-Length of the data in bytes.
@property (nonatomic, readonly) int64_t size;
/// The creation time of the object in RFC 3339 format.
@property (nonatomic, readonly, copy) NSDate * _Nullable timeCreated;
/// The modification time of the object metadata in RFC 3339 format.
@property (nonatomic, readonly, copy) NSDate * _Nullable updated;
/// A reference to the object in Firebase Storage.
@property (nonatomic, readonly, strong) FIRStorageReference * _Nullable storageReference;
/// Creates a Dictionary from the contents of the metadata.
/// @return A Dictionary that represents the contents of the metadata.
- (NSDictionary<NSString *, id> * _Nonnull)dictionaryRepresentation SWIFT_WARN_UNUSED_RESULT;
/// Determines if the current metadata represents a “file”.
@property (nonatomic, readonly) BOOL isFile;
/// Determines if the current metadata represents a “folder”.
@property (nonatomic, readonly) BOOL isFolder;
- (nonnull instancetype)init;
/// Creates an instance of StorageMetadata from the contents of a dictionary.
/// @return An instance of StorageMetadata that represents the contents of a dictionary.
- (nonnull instancetype)initWithDictionary:(NSDictionary<NSString *, id> * _Nonnull)dictionary;
- (id _Nonnull)copy SWIFT_WARN_UNUSED_RESULT;
- (BOOL)isEqual:(id _Nullable)object SWIFT_WARN_UNUSED_RESULT;
@property (nonatomic, readonly) NSUInteger hash;
@property (nonatomic, readonly, copy) NSString * _Nonnull description;
@end


@class NSData;
@class FIRStorageUploadTask;
@class NSURL;

/// StorageReference represents a reference to a Google Cloud Storage object. Developers can
/// upload and download objects, as well as get/set object metadata, and delete an object at the
/// path.
/// @see https://cloud.google.com/storage/
SWIFT_CLASS_NAMED("StorageReference")
@interface FIRStorageReference : NSObject
/// The Storage service object which created this reference.
@property (nonatomic, readonly, strong) FIRStorage * _Nonnull storage;
/// The name of the Google Cloud Storage bucket associated with this reference,
/// in gs://bucket/path/to/object.txt, the bucket would be: ‘bucket’
@property (nonatomic, readonly, copy) NSString * _Nonnull bucket;
/// The full path to this object, not including the Google Cloud Storage bucket.
/// In gs://bucket/path/to/object.txt, the full path would be: ‘path/to/object.txt’
@property (nonatomic, readonly, copy) NSString * _Nonnull fullPath;
/// The short name of the object associated with this reference,
/// in gs://bucket/path/to/object.txt, the name of the object would be: ‘object.txt’
@property (nonatomic, readonly, copy) NSString * _Nonnull name;
/// Creates a new StorageReference pointing to the root object.
/// @return A new StorageReference pointing to the root object.
- (FIRStorageReference * _Nonnull)root SWIFT_WARN_UNUSED_RESULT;
/// Creates a new StorageReference pointing to the parent of the current reference
/// or nil if this instance references the root location.
/// For example:
/// path = foo/bar/baz   parent = foo/bar
/// path = foo           parent = (root)
/// path = (root)        parent = nil
/// @return A new StorageReference pointing to the parent of the current reference.
- (FIRStorageReference * _Nullable)parent SWIFT_WARN_UNUSED_RESULT;
/// Creates a new StorageReference pointing to a child object of the current reference.
/// path = foo      child = bar    newPath = foo/bar
/// path = foo/bar  child = baz    ntask.impl.snapshotwPath = foo/bar/baz
/// All leading and trailing slashes will be removed, and consecutive slashes will be
/// compressed to single slashes. For example:
/// child = /foo/bar     newPath = foo/bar
/// child = foo/bar/     newPath = foo/bar
/// child = foo///bar    newPath = foo/bar
/// @param path Path to append to the current path.
/// @return A new StorageReference pointing to a child location of the current reference.
- (FIRStorageReference * _Nonnull)child:(NSString * _Nonnull)path SWIFT_WARN_UNUSED_RESULT;
/// Asynchronously uploads data to the currently specified StorageReference,
/// without additional metadata.
/// This is not recommended for large files, and one should instead upload a file from disk.
/// @param uploadData The Data to upload.
/// @param metadata StorageMetadata containing additional information (MIME type, etc.)
/// about the object being uploaded.
/// @return An instance of StorageUploadTask, which can be used to monitor or manage the upload.
- (FIRStorageUploadTask * _Nonnull)putData:(NSData * _Nonnull)uploadData metadata:(FIRStorageMetadata * _Nullable)metadata;
/// Asynchronously uploads data to the currently specified StorageReference.
/// This is not recommended for large files, and one should instead upload a file from disk.
/// @param uploadData The Data to upload.
/// @return An instance of StorageUploadTask, which can be used to monitor or manage the upload.
- (FIRStorageUploadTask * _Nonnull)putData:(NSData * _Nonnull)uploadData;
/// Asynchronously uploads data to the currently specified StorageReference.
/// This is not recommended for large files, and one should instead upload a file from disk.
/// @param uploadData The Data to upload.
/// @param metadata StorageMetadata containing additional information (MIME type, etc.)
/// about the object being uploaded.
/// @param completion A completion block that either returns the object metadata on success,
/// or an error on failure.
/// @return An instance of StorageUploadTask, which can be used to monitor or manage the upload.
- (FIRStorageUploadTask * _Nonnull)putData:(NSData * _Nonnull)uploadData metadata:(FIRStorageMetadata * _Nullable)metadata completion:(void (^ _Nullable)(FIRStorageMetadata * _Nullable, NSError * _Nullable))completion;
/// Asynchronously uploads a file to the currently specified StorageReference.
/// @param fileURL A URL representing the system file path of the object to be uploaded.
/// @param metadata StorageMetadata containing additional information (MIME type, etc.)
/// about the object being uploaded.
/// @return An instance of StorageUploadTask, which can be used to monitor or manage the upload.
- (FIRStorageUploadTask * _Nonnull)putFile:(NSURL * _Nonnull)fileURL metadata:(FIRStorageMetadata * _Nullable)metadata;
/// Asynchronously uploads a file to the currently specified StorageReference,
/// without additional metadata.
/// @param fileURL A URL representing the system file path of the object to be uploaded.
/// @return An instance of StorageUploadTask, which can be used to monitor or manage the upload.
- (FIRStorageUploadTask * _Nonnull)putFile:(NSURL * _Nonnull)fileURL;
/// Asynchronously uploads a file to the currently specified StorageReference.
/// @param fileURL A URL representing the system file path of the object to be uploaded.
/// @param metadata StorageMetadata containing additional information (MIME type, etc.)
/// about the object being uploaded.
/// @param completion A completion block that either returns the object metadata on success,
/// or an error on failure.
/// @return An instance of StorageUploadTask, which can be used to monitor or manage the upload.
- (FIRStorageUploadTask * _Nonnull)putFile:(NSURL * _Nonnull)fileURL metadata:(FIRStorageMetadata * _Nullable)metadata completion:(void (^ _Nullable)(FIRStorageMetadata * _Nullable, NSError * _Nullable))completion;
/// Asynchronously downloads the object at the StorageReference to an Data object in memory.
/// An Data of the provided max size will be allocated, so ensure that the device has enough free
/// memory to complete the download. For downloading large files, writeToFile may be a better option.
/// @param maxSize The maximum size in bytes to download. If the download exceeds this size,
/// the task will be cancelled and an error will be returned.
/// @param completion A completion block that either returns the object data on success,
/// or an error on failure.
/// @return An StorageDownloadTask that can be used to monitor or manage the download.
- (FIRStorageDownloadTask * _Nonnull)dataWithMaxSize:(int64_t)maxSize completion:(void (^ _Nonnull)(NSData * _Nullable, NSError * _Nullable))completion;
/// Asynchronously retrieves a long lived download URL with a revokable token.
/// This can be used to share the file with others, but can be revoked by a developer
/// in the Firebase Console.
/// @param completion A completion block that either returns the URL on success,
/// or an error on failure.
- (void)downloadURLWithCompletion:(void (^ _Nonnull)(NSURL * _Nullable, NSError * _Nullable))completion;
/// Asynchronously downloads the object at the current path to a specified system filepath.
/// @param fileURL A file system URL representing the path the object should be downloaded to.
/// @return An StorageDownloadTask that can be used to monitor or manage the download.
- (FIRStorageDownloadTask * _Nonnull)writeToFile:(NSURL * _Nonnull)fileURL;
/// Asynchronously downloads the object at the current path to a specified system filepath.
/// @param fileURL A file system URL representing the path the object should be downloaded to.
/// @param completion A completion block that fires when the file download completes.
/// Returns an URL pointing to the file path of the downloaded file on success,
/// or an error on failure.
/// @return An StorageDownloadTask that can be used to monitor or manage the download.
- (FIRStorageDownloadTask * _Nonnull)writeToFile:(NSURL * _Nonnull)fileURL completion:(void (^ _Nullable)(NSURL * _Nullable, NSError * _Nullable))completion;
/// List all items (files) and prefixes (folders) under this StorageReference.
/// This is a helper method for calling list() repeatedly until there are no more results.
/// Consistency of the result is not guaranteed if objects are inserted or removed while this
/// operation is executing. All results are buffered in memory.
/// <code>listAll(completion:)</code> is only available for projects using Firebase Rules Version 2.
/// @param completion A completion handler that will be invoked with all items and prefixes under
/// the current StorageReference.
- (void)listAllWithCompletion:(void (^ _Nonnull)(FIRStorageListResult * _Nullable, NSError * _Nullable))completion;
/// List up to <code>maxResults</code> items (files) and prefixes (folders) under this StorageReference.
/// “/” is treated as a path delimiter. Firebase Storage does not support unsupported object
/// paths that end with “/” or contain two consecutive “/“s. All invalid objects in GCS will be
/// filtered.
/// <code>list(maxResults:completion:)</code> is only available for projects using Firebase Rules Version 2.
/// @param maxResults The maximum number of results to return in a single page. Must be greater
/// than 0 and at most 1000.
/// @param completion A completion handler that will be invoked with up to maxResults items and
/// prefixes under the current StorageReference.
- (void)listWithMaxResults:(int64_t)maxResults completion:(void (^ _Nonnull)(FIRStorageListResult * _Nullable, NSError * _Nullable))completion;
/// Resumes a previous call to list(maxResults:completion:)`, starting after a pagination token.
/// Returns the next set of items (files) and prefixes (folders) under this StorageReference.
/// “/” is treated as a path delimiter. Firebase Storage does not support unsupported object
/// paths that end with “/” or contain two consecutive “/“s. All invalid objects in GCS will be
/// filtered.
/// <code>list(maxResults:pageToken:completion:)</code>is only available for projects using Firebase Rules
/// Version 2.
/// @param maxResults The maximum number of results to return in a single page. Must be greater
/// than 0 and at most 1000.
/// @param pageToken A page token from a previous call to list.
/// @param completion A completion handler that will be invoked with the next items and prefixes
/// under the current StorageReference.
- (void)listWithMaxResults:(int64_t)maxResults pageToken:(NSString * _Nonnull)pageToken completion:(void (^ _Nonnull)(FIRStorageListResult * _Nullable, NSError * _Nullable))completion;
/// Retrieves metadata associated with an object at the current path.
/// @param completion A completion block which returns the object metadata on success,
/// or an error on failure.
- (void)metadataWithCompletion:(void (^ _Nonnull)(FIRStorageMetadata * _Nullable, NSError * _Nullable))completion;
/// Updates the metadata associated with an object at the current path.
/// @param metadata An StorageMetadata object with the metadata to update.
/// @param completion A completion block which returns the StorageMetadata on success,
/// or an error on failure.
- (void)updateMetadata:(FIRStorageMetadata * _Nonnull)metadata completion:(void (^ _Nullable)(FIRStorageMetadata * _Nullable, NSError * _Nullable))completion;
/// Deletes the object at the current path.
/// @param completion A completion block which returns nil on success, or an error on failure.
- (void)deleteWithCompletion:(void (^ _Nullable)(NSError * _Nullable))completion;
- (FIRStorageReference * _Nonnull)copy:(struct _NSZone * _Nonnull)zone SWIFT_WARN_UNUSED_RESULT;
- (BOOL)isEqual:(id _Nullable)object SWIFT_WARN_UNUSED_RESULT;
@property (nonatomic, readonly) NSUInteger hash;
@property (nonatomic, readonly, copy) NSString * _Nonnull description;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end





@class NSProgress;

/// StorageTaskSnapshot represents an immutable view of a task.
/// A Snapshot contains a task, storage reference, metadata (if it exists),
/// progress, and an error (if one occurred).
SWIFT_CLASS_NAMED("StorageTaskSnapshot")
@interface FIRStorageTaskSnapshot : NSObject
/// Subclass of StorageTask this snapshot represents.
@property (nonatomic, readonly, strong) FIRStorageTask * _Nonnull task;
/// Metadata returned by the task, or nil if no metadata returned.
@property (nonatomic, readonly, strong) FIRStorageMetadata * _Nullable metadata;
/// StorageReference this task is operates on.
@property (nonatomic, readonly, strong) FIRStorageReference * _Nonnull reference;
/// Progress object which tracks the progress of an upload or download.
@property (nonatomic, readonly, strong) NSProgress * _Nullable progress;
/// Error during task execution, or nil if no error occurred.
@property (nonatomic, readonly) NSError * _Nullable error;
/// Status of the task.
@property (nonatomic, readonly) enum FIRStorageTaskStatus status;
@property (nonatomic, readonly, copy) NSString * _Nonnull description;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end

typedef SWIFT_ENUM_NAMED(NSInteger, FIRStorageTaskStatus, "StorageTaskStatus", open) {
  FIRStorageTaskStatusUnknown = 0,
  FIRStorageTaskStatusResume = 1,
  FIRStorageTaskStatusProgress = 2,
  FIRStorageTaskStatusPause = 3,
  FIRStorageTaskStatusSuccess = 4,
  FIRStorageTaskStatusFailure = 5,
};


/// StorageUploadTask implements resumable uploads to a file in Firebase Storage.
/// Uploads can be returned on completion with a completion callback, and can be monitored
/// by attaching observers, or controlled by calling StorageTask#pause, StorageTask#resume,
/// or StorageTask#cancel.
/// Uploads can takeData in memory, or an URL to a file on disk.
/// Uploads are performed on a background queue, and callbacks are raised on the developer
/// specified callbackQueue in Storage, or the main queue if left unspecified.
/// Currently all uploads must be initiated and managed on the main queue.
SWIFT_CLASS_NAMED("StorageUploadTask")
@interface FIRStorageUploadTask : FIRStorageObservableTask <FIRStorageTaskManagement>
/// Prepares a task and begins execution.
- (void)enqueue;
/// Pauses a task currently in progress.
- (void)pause;
/// Pauses a task currently in progress.
- (void)cancel;
/// Pauses a task currently in progress.
- (void)resume;
@end

#if __has_attribute(external_source_symbol)
# pragma clang attribute pop
#endif
#pragma clang diagnostic pop
#endif