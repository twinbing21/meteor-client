import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("NanoClock")
public class NanoClock extends Clock {
    @ObfuscatedName("f")
    long lastTimeNano = System.nanoTime();

    @ObfuscatedName("f")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "-1619845116"
    )
    public void mark() {
      this.lastTimeNano = System.nanoTime();
   }

    @ObfuscatedName("w")
    @ObfuscatedSignature(
            descriptor = "(III)I",
            garbageValue = "1661663667"
    )
    public int wait(int var1, int var2) {
      long var3 = 1000000L * (long)var2;
      long var5 = this.lastTimeNano - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      Clock.method911(var5 / 1000000L);
      long var7 = System.nanoTime();

      int var9;
      for(var9 = 0; var9 < 10 && (var9 < 1 || this.lastTimeNano < var7); this.lastTimeNano += 1000000L * (long)var1) {
         ++var9;
      }

      if (this.lastTimeNano < var7) {
         this.lastTimeNano = var7;
      }

      return var9;
   }
}
