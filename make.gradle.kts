import com.lagradost.cloudstream3.gradle.CloudstreamExtension

fun Project.cloudstream(configuration: CloudstreamExtension.() -> Unit) =
    extensions.getByName<CloudstreamExtension>("cloudstream").configuration()

subprojects {
    apply(plugin = "com.lagradost.cloudstream3.gradle")

    cloudstream {
        // يحسن عملية استخراج الإضافات أثناء التجميع
    }
}
