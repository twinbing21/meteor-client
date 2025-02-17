import java.lang.ref.SoftReference;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("jh")
@Implements("SoftWrapper")
public class SoftWrapper extends Wrapper {
    @ObfuscatedName("f")
    SoftReference ref;

   SoftWrapper(Object var1, int var2) {
      super(var2);
      this.ref = new SoftReference(var1);
   }

    @ObfuscatedName("f")
    Object get() {
      return this.ref.get();
   }

    @ObfuscatedName("w")
    boolean isSoft() {
      return true;
   }
}
