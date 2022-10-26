# Firebase iOS Analytics framework

### Frameworks required for this pod: 
* FirebaseAnalytics.framework (from Firebase.zip/FirebaseAnalytics/FirebaseAnalytics.xcframework)
* GoogleAppMeasurement.framework (from Firebase.zip/FirebaseAnalytics/GoogleAppMeasurement.xcframework)
* FirebaseInstallations.framework (from Firebase.zip/FirebaseAnalytics/FirebaseInstallations.xcframework)
* nanopb.framework (from Firebase.zip/FirebaseAnalytics/nanopb.xcframework)

Plus ones required for ios-core module:
* FirebaseCore.framework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* FirebaseCoreInternal.framework (from Firebase.zip/FirebaseAnalytics/FirebaseCoreInternal.xcframework)
* GoogleUtilities.framework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* FBLPromises.framework (from Firebase.zip/FirebaseAnalytics/FBLPromises.xcframework)

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseAnalytics.framework is located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
repositories {
    maven { url 'https://oss.sonatype.org/content/repositories/snapshots' }
}
dependencies {
   ... other dependencies ...
   implementation "io.github.dkimitsa.robovm:robopods-firebase-analytics-ios:$altpodsVersion"
}
```
