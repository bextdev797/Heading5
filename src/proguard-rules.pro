# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.heading5.Heading5 {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/heading5/repack'
-flattenpackagehierarchy
-dontpreverify
