# Flurry Analytics iOS 

### Libraries required for this pod: 
* libFlurry_X.X.X.a

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <libs>
        <lib>libs/libFlurry_X.X.X.a</lib>
    </libs>
</config></config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
repositories {
    maven { url 'https://oss.sonatype.org/content/repositories/snapshots' }
}
dependencies {
   ... other dependencies ...
   implementation "io.github.dkimitsa.robovm:robopods-flurry-ios:$altpodsVersion"
}
```