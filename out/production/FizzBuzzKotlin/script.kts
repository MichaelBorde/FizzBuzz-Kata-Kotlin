// Module script for production
import kotlin.modules.*
fun project() {
    module("FizzBuzzKotlin") {
        sources += "/Users/michael/dev/workspaceKotlin/FizzBuzzKotlin/src/FizzBuzz.kt"
        // Boot classpath
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/lib/dt.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/lib/jconsole.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/lib/sa-jdi.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/lib/tools.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/charsets.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/jce.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/JObjC.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/jsse.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/management-agent.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/resources.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/rhino.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/rt.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/ext/dnsns.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/ext/localedata.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/ext/sunec.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar"
        classpath += "/Library/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home/jre/lib/ext/zipfs.jar"
        // Compilation classpath
        // Output directory, commented out
        //         classpath += "/Users/michael/dev/workspaceKotlin/FizzBuzzKotlin/out/test/FizzBuzzKotlin"
        // Output directory, commented out
        //         classpath += "/Users/michael/dev/workspaceKotlin/FizzBuzzKotlin/out/production/FizzBuzzKotlin"
        classpath += "/Users/michael/dev/workspaceKotlin/FizzBuzzKotlin/lib/kotlin-runtime.jar"
        classpath += "/Users/michael/dev/workspaceKotlin/FizzBuzzKotlin/lib/fest-assert-1.4.jar"
        classpath += "/Users/michael/dev/workspaceKotlin/FizzBuzzKotlin/lib/fest-util-1.1.6.jar"
        classpath += "/Users/michael/dev/workspaceKotlin/FizzBuzzKotlin/lib/junit-4.10.jar"
        // Java classpath (for Java sources)
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Android_Including_Compiler/FizzBuzzKotlin.4b707eb8/production"
        classpath += "/Users/michael/dev/workspaceKotlin/FizzBuzzKotlin/test"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Android_Including_Compiler/FizzBuzzKotlin.4b707eb8/test"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Android_Renderscript_Compiler/FizzBuzzKotlin.4b707eb8/production"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Android_Renderscript_Compiler/FizzBuzzKotlin.4b707eb8/test"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Flex_Resource_Compiler/FizzBuzzKotlin.4b707eb8/production"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Flex_Resource_Compiler/FizzBuzzKotlin.4b707eb8/test"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/ActionScript_Compiler/FizzBuzzKotlin.4b707eb8/production"
        classpath += "/Users/michael/dev/workspaceKotlin/FizzBuzzKotlin/src"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/ActionScript_Compiler/FizzBuzzKotlin.4b707eb8/test"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/aidl/FizzBuzzKotlin.4b707eb8/test"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/aidl/FizzBuzzKotlin.4b707eb8/production"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Android_External_Apklib_Extracting_Compiler/FizzBuzzKotlin.4b707eb8/test"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Android_External_Apklib_Extracting_Compiler/FizzBuzzKotlin.4b707eb8/production"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Android_PNG_files_caching_compiler/FizzBuzzKotlin.4b707eb8/test"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Android_PNG_files_caching_compiler/FizzBuzzKotlin.4b707eb8/production"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Android_Maven_Resources_Compiler/FizzBuzzKotlin.4b707eb8/test"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Android_Maven_Resources_Compiler/FizzBuzzKotlin.4b707eb8/production"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Android_BuildConfig_Generator/FizzBuzzKotlin.4b707eb8/test"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/Android_BuildConfig_Generator/FizzBuzzKotlin.4b707eb8/production"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/aapt/FizzBuzzKotlin.4b707eb8/test"
        classpath += "/Users/michael/Library/Caches/IntelliJIdea11/compiler/fizzbuzzkotlin.b5b9f988/.generated/aapt/FizzBuzzKotlin.4b707eb8/production"
        // Main output
    }
}
