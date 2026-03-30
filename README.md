Sample project TimeTracker module (Producer of Android SDK) and App module (Consumer of TimeTracker after retrieving it from jitpack.io) 

TimeTracker module acts as an Android SDK.

1. First commit the changes (including SDK module and normal app module) to repository and push the changes.
2. Tag a release
   JitPack builds your library based on tags. Once your code is on GitHub, create a release tag:
      git tag v1.0.0
      git push origin v1.0.0
3. Then .aar file version will be uploaded to the https://jitpack.io and paste the git repo url.
4. Update settings.gradle.kts -> Add repositories { maven { url = uri("https://jitpack.io") } }
5. Update build.gradle.kts -> Add dependencies { implementation("com.github.sathish-chanda:TimeTrackerSDK:v1.0.0") }
6. Now you can TimeTracker class and methods anywhere inside the app.

Please refer the below link to deeply understand about Android SDK and App Implementation. 
https://proandroiddev.com/creating-and-publishing-an-android-sdk-a-simple-step-by-step-guide-that-actually-works-3cf3a205f1e4

